package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator(); 
		assertEquals(calc.minus(1,1), 0); 
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator(); 
		assertEquals(calc.multiply(9,9), 81); 
	}
	
	@Test
	public void testDivide(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4,2), 2);
	}
	
    @Test (expected = ArithmeticException.class)
	public void testDivideByZero() {
    	SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4,0), 2);
	}
	
	
}
