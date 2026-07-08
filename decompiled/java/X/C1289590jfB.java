package X;

/* JADX INFO: renamed from: X.0jfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289590jfB<T> {
    public EnumC1288980jeC LIZ;
    public T LIZIZ;
    public Throwable LIZJ;

    public static C1289590jfB LIZ(Throwable th) {
        C1289590jfB c1289590jfB = new C1289590jfB();
        c1289590jfB.LIZ = EnumC1288980jeC.FAILED;
        c1289590jfB.LIZJ = th;
        return c1289590jfB;
    }

    public static <T> C1289590jfB<T> LIZIZ(T t) {
        C1289590jfB<T> c1289590jfB = new C1289590jfB<>();
        c1289590jfB.LIZ = EnumC1288980jeC.SUCCESS;
        c1289590jfB.LIZIZ = t;
        return c1289590jfB;
    }
}
