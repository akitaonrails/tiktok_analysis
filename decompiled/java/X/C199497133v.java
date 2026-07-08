package X;

/* JADX INFO: renamed from: X.133v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199497133v {
    public static final C199497133v LIZJ;
    public static final C199497133v LIZLLL;
    public final boolean LIZ;
    public final Throwable LIZIZ;

    public C199497133v(Throwable th, boolean z) {
        this.LIZ = z;
        this.LIZIZ = th;
    }

    static {
        if (C133Z.LLILZLL) {
            LIZLLL = null;
            LIZJ = null;
        } else {
            LIZLLL = new C199497133v(null, false);
            LIZJ = new C199497133v(null, true);
        }
    }
}
