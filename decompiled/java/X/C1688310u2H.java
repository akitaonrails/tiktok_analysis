package X;

/* JADX INFO: renamed from: X.0u2H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688310u2H {
    public static long LIZ(long j, EnumC1324330kZD enumC1324330kZD) {
        int iLJIIIZ;
        int iLJII;
        int iLJIIJ;
        int iLJIIIIZZ;
        EnumC1324330kZD enumC1324330kZD2 = EnumC1324330kZD.Horizontal;
        if (enumC1324330kZD == enumC1324330kZD2) {
            iLJIIIZ = C1682380tsi.LJIIJ(j);
        } else {
            iLJIIIZ = C1682380tsi.LJIIIZ(j);
        }
        if (enumC1324330kZD == enumC1324330kZD2) {
            iLJII = C1682380tsi.LJIIIIZZ(j);
        } else {
            iLJII = C1682380tsi.LJII(j);
        }
        if (enumC1324330kZD == enumC1324330kZD2) {
            iLJIIJ = C1682380tsi.LJIIIZ(j);
        } else {
            iLJIIJ = C1682380tsi.LJIIJ(j);
        }
        if (enumC1324330kZD == enumC1324330kZD2) {
            iLJIIIIZZ = C1682380tsi.LJII(j);
        } else {
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        }
        return C1682390tsj.LIZ(iLJIIIZ, iLJII, iLJIIJ, iLJIIIIZZ);
    }

    public static long LIZIZ(int i, long j) {
        int iLJIIJ;
        int iLJIIIIZZ;
        int iLJIIIZ;
        int iLJII = 0;
        if ((i & 1) != 0) {
            iLJIIJ = C1682380tsi.LJIIJ(j);
        } else {
            iLJIIJ = 0;
        }
        if ((i & 2) != 0) {
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        } else {
            iLJIIIIZZ = 0;
        }
        if ((i & 4) != 0) {
            iLJIIIZ = C1682380tsi.LJIIIZ(j);
        } else {
            iLJIIIZ = 0;
        }
        if ((i & 8) != 0) {
            iLJII = C1682380tsi.LJII(j);
        }
        return C1682390tsj.LIZ(iLJIIJ, iLJIIIIZZ, iLJIIIZ, iLJII);
    }

    public static final long LIZJ(long j, EnumC1324330kZD enumC1324330kZD) {
        if (enumC1324330kZD == EnumC1324330kZD.Horizontal) {
            return C1682390tsj.LIZ(C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j), C1682380tsi.LJIIIZ(j), C1682380tsi.LJII(j));
        }
        return C1682390tsj.LIZ(C1682380tsi.LJIIIZ(j), C1682380tsi.LJII(j), C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j));
    }
}
