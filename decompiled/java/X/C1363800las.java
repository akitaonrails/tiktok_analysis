package X;

/* JADX INFO: renamed from: X.0las, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363800las {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;

    public C1363800las(long j, long j2, long j3, long j4, long j5, long j6) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = j6;
    }

    public static C1363800las LIZ(C1363800las c1363800las, long j, long j2, long j3, long j4, int i) {
        long j5;
        long j6 = j4;
        long j7 = j3;
        long j8 = j2;
        long j9 = j;
        long j10 = 0;
        if ((i & 1) != 0) {
            j5 = c1363800las.LIZ;
        } else {
            j5 = 0;
        }
        if ((i & 2) != 0) {
            j9 = c1363800las.LIZIZ;
        }
        if ((i & 4) != 0) {
            j10 = c1363800las.LIZJ;
        }
        if ((i & 8) != 0) {
            j8 = c1363800las.LIZLLL;
        }
        if ((i & 16) != 0) {
            j7 = c1363800las.LJ;
        }
        if ((i & 32) != 0) {
            j6 = c1363800las.LJFF;
        }
        return new C1363800las(j5, j9, j10, j8, j7, j6);
    }
}
