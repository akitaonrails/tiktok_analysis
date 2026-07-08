package X;

/* JADX INFO: renamed from: X.15JF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15JF {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;

    public static C15JF LIZ(C15JF c15jf, long j, long j2, long j3, int i) {
        String str;
        long j4;
        long j5;
        long j6 = j3;
        long j7 = j2;
        long j8 = j;
        String str2 = null;
        if ((i & 1) != 0) {
            str = c15jf.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c15jf.LIZIZ;
        }
        if ((i & 4) != 0) {
            j4 = c15jf.LIZJ;
        } else {
            j4 = 0;
        }
        if ((i & 8) != 0) {
            j8 = c15jf.LIZLLL;
        }
        if ((i & 16) != 0) {
            j7 = c15jf.LJ;
        }
        if ((i & 32) != 0) {
            j6 = c15jf.LJFF;
        }
        if ((i & 64) != 0) {
            j5 = c15jf.LJI;
        } else {
            j5 = 0;
        }
        c15jf.getClass();
        return new C15JF(j4, j8, j7, j6, j5, str, str2);
    }

    public C15JF(long j, long j2, long j3, long j4, long j5, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = j5;
    }
}
