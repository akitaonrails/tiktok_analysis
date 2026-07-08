package X;

/* JADX INFO: renamed from: X.134U, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C134U {
    public static final C134U LIZJ;
    public static final C134U LIZLLL;
    public final boolean LIZ;
    public final Throwable LIZIZ;

    static {
        if (C134M.LLILZ) {
            LIZLLL = null;
            LIZJ = null;
        } else {
            LIZLLL = new C134U(null, false);
            LIZJ = new C134U(null, true);
        }
    }

    public C134U(Throwable th, boolean z) {
        this.LIZ = z;
        this.LIZIZ = th;
    }
}
