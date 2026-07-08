package X;

/* JADX INFO: renamed from: X.0juh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299210juh<T> {
    public final Throwable LIZ;
    public int LIZIZ;
    public final T LIZJ;

    public C1299210juh(Throwable th) {
        this.LIZIZ = -1;
        this.LIZ = th;
    }

    public static <T> C1299210juh<T> LIZ(T t) {
        C1299210juh<T> c1299210juh = new C1299210juh<>(t);
        c1299210juh.LIZIZ = 0;
        return c1299210juh;
    }

    public C1299210juh(T t) {
        this.LIZJ = t;
    }
}
