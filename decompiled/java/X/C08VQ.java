package X;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.08VQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VQ {
    public static C830490Whz<Class, Character> LIZLLL;
    public final Class[] LIZ;
    public boolean LIZIZ;
    public String LIZJ;

    public C08VQ(Method method) {
        method.setAccessible(true);
        this.LIZ = method.getParameterTypes();
    }

    public static char LIZ(Class cls) {
        if (LIZLLL == null) {
            C830490Whz<Class, Character> c830490Whz = new C830490Whz<>();
            LIZLLL = c830490Whz;
            c830490Whz.put(Byte.TYPE, 'b');
            LIZLLL.put(Byte.class, 'B');
            LIZLLL.put(Short.TYPE, 's');
            LIZLLL.put(Short.class, 'S');
            LIZLLL.put(Long.TYPE, 'l');
            LIZLLL.put(Long.class, 'L');
            LIZLLL.put(Character.TYPE, 'c');
            LIZLLL.put(Character.class, 'C');
            LIZLLL.put(Boolean.TYPE, 'z');
            LIZLLL.put(Boolean.class, 'Z');
            LIZLLL.put(Integer.TYPE, 'i');
            LIZLLL.put(Integer.class, 'I');
            LIZLLL.put(Double.TYPE, 'd');
            LIZLLL.put(Double.class, 'D');
            LIZLLL.put(Float.TYPE, 'f');
            LIZLLL.put(Float.class, 'F');
            LIZLLL.put(String.class, 'T');
        }
        if (LIZLLL.containsKey(cls)) {
            return LIZLLL.get(cls).charValue();
        }
        return (char) 0;
    }
}
