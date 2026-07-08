package X;

/* JADX INFO: renamed from: X.0r6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575790r6n {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final String LJFF;

    public C1575790r6n() {
        this(false, false, null, false, null, 63);
    }

    public C1575790r6n(boolean z, boolean z2, String str, boolean z3, String str2, int i) {
        long jCurrentTimeMillis;
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? true : z2;
        str = (i & 4) != 0 ? "auto" : str;
        z3 = (i & 8) != 0 ? false : z3;
        if ((i & 16) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        str2 = (i & 32) != 0 ? null : str2;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = str;
        this.LIZLLL = z3;
        this.LJ = jCurrentTimeMillis;
        this.LJFF = str2;
    }
}
