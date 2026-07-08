package X;

/* JADX INFO: renamed from: X.13e9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20059113e9 {
    public C20059013e8 LIZIZ;
    public float[] LJFF;
    public final C20029713Yp<C20059013e8> LIZ = C1685990tyX.LIZ();
    public long LIZJ = -1;
    public long LIZLLL = 0;
    public long LJ = 0;

    public final void LIZIZ(C20059013e8 c20059013e8, long j, long j2, float[] fArr, long j3) {
        boolean z;
        boolean z2;
        if (j3 - c20059013e8.LJIIIIZZ > c20059013e8.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (c20059013e8.LIZJ == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c20059013e8.LJIIIZ = j3;
        if (z) {
            if (z2) {
                c20059013e8.LJIIIIZZ = j3;
                c20059013e8.LIZ(c20059013e8.LJI, c20059013e8.LJII, j, j2, fArr);
                return;
            }
        } else if (z2) {
            return;
        }
        long j4 = this.LIZJ;
        long j5 = c20059013e8.LIZJ + j3;
        if (j4 <= 0 || j5 >= j4) {
            return;
        }
        this.LIZJ = j4;
    }

    public static long LIZ(C20059013e8 c20059013e8, long j, long j2, float[] fArr, long j3, long j4) {
        long j5 = c20059013e8.LIZJ;
        if (j5 > 0) {
            long j6 = c20059013e8.LJIIIZ;
            if (j6 > 0) {
                if (j3 - j6 > j5) {
                    c20059013e8.LJIIIIZZ = j3;
                    c20059013e8.LJIIIZ = -1L;
                    c20059013e8.LIZ(c20059013e8.LJI, c20059013e8.LJII, j, j2, fArr);
                } else {
                    return Math.min(j4, j6 + j5);
                }
            }
        }
        return j4;
    }
}
