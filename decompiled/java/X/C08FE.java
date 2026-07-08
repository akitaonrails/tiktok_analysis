package X;

/* JADX INFO: renamed from: X.08FE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08FE<T> {
    public static Class[] typeClasses = {Byte.class, Double.class, Float.class, Integer.class, Long.class, Short.class, String.class};

    public static boolean isReturnMatch(Object obj, Class<?> cls) {
        for (Class<?> cls2 : typeClasses) {
            if (cls2.isInstance(obj) && cls == cls2) {
                return true;
            }
        }
        return false;
    }

    public static <T> T tryProtect(C08FG c08fg, Throwable th, Class<?> cls) {
        C08FV c08fvLIZ = C09EU.LIZ(c08fg, th);
        if (c08fvLIZ == null) {
            return null;
        }
        T t = (T) c08fvLIZ.LIZ;
        if (!isReturnMatch(t, cls)) {
            return null;
        }
        return t;
    }
}
