package X;

/* JADX INFO: renamed from: X.133u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199496133u {
    public static final C199496133u LIZJ;
    public static final C199496133u LIZLLL;
    public final boolean LIZ;
    public final Throwable LIZIZ;

    static {
        if (AbstractC199488133m.LL) {
            LIZLLL = null;
            LIZJ = null;
        } else {
            LIZLLL = new C199496133u(null, false);
            LIZJ = new C199496133u(null, true);
        }
    }

    public C199496133u(Throwable th, boolean z) {
        this.LIZ = z;
        this.LIZIZ = th;
    }
}
