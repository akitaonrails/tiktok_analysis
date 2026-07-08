package X;

/* JADX INFO: renamed from: X.135U, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C135U {
    public static C135T LIZIZ(Object obj) {
        return new C135T(obj.getClass().getSimpleName());
    }

    public static <T> T LIZ(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
