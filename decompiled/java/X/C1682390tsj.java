package X;

/* JADX INFO: renamed from: X.0tsj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682390tsj {
    public static final int LIZJ(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final Void LJIIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can't represent a size of ");
        sbLIZ.append(i);
        sbLIZ.append(" in Constraints");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final long LIZLLL(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iLJIIJ = C1682380tsi.LJIIJ(j);
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        if (i < iLJIIJ) {
            i = iLJIIJ;
        }
        if (i <= iLJIIIIZZ) {
            iLJIIIIZZ = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iLJIIIZ = C1682380tsi.LJIIIZ(j);
        int iLJII = C1682380tsi.LJII(j);
        if (i2 < iLJIIIZ) {
            i2 = iLJIIIZ;
        }
        if (i2 <= iLJII) {
            iLJII = i2;
        }
        return (((long) iLJIIIIZZ) << 32) | (((long) iLJII) & 4294967295L);
    }

    public static final long LJ(long j, long j2) {
        int iLJIIJ = C1682380tsi.LJIIJ(j);
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        int iLJIIIZ = C1682380tsi.LJIIIZ(j);
        int iLJII = C1682380tsi.LJII(j);
        int iLJIIJ2 = C1682380tsi.LJIIJ(j2);
        if (iLJIIJ2 < iLJIIJ) {
            iLJIIJ2 = iLJIIJ;
        }
        if (iLJIIJ2 > iLJIIIIZZ) {
            iLJIIJ2 = iLJIIIIZZ;
        }
        int iLJIIIIZZ2 = C1682380tsi.LJIIIIZZ(j2);
        if (iLJIIIIZZ2 >= iLJIIJ) {
            iLJIIJ = iLJIIIIZZ2;
        }
        if (iLJIIJ <= iLJIIIIZZ) {
            iLJIIIIZZ = iLJIIJ;
        }
        int iLJIIIZ2 = C1682380tsi.LJIIIZ(j2);
        if (iLJIIIZ2 < iLJIIIZ) {
            iLJIIIZ2 = iLJIIIZ;
        }
        if (iLJIIIZ2 > iLJII) {
            iLJIIIZ2 = iLJII;
        }
        int iLJII2 = C1682380tsi.LJII(j2);
        if (iLJII2 >= iLJIIIZ) {
            iLJIIIZ = iLJII2;
        }
        if (iLJIIIZ <= iLJII) {
            iLJII = iLJIIIZ;
        }
        return LIZ(iLJIIJ2, iLJIIIIZZ, iLJIIIZ2, iLJII);
    }

    public static final int LJFF(int i, long j) {
        int iLJIIIZ = C1682380tsi.LJIIIZ(j);
        int iLJII = C1682380tsi.LJII(j);
        if (i < iLJIIIZ) {
            i = iLJIIIZ;
        }
        if (i <= iLJII) {
            return i;
        }
        return iLJII;
    }

    public static final int LJI(int i, long j) {
        int iLJIIJ = C1682380tsi.LJIIJ(j);
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        if (i < iLJIIJ) {
            i = iLJIIJ;
        }
        if (i <= iLJIIIIZZ) {
            return i;
        }
        return iLJIIIIZZ;
    }

    public static final void LJIIIZ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can't represent a width of ");
        sbLIZ.append(i);
        sbLIZ.append(" and height of ");
        sbLIZ.append(i2);
        sbLIZ.append(" in Constraints");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final long LJIIIIZZ(int i, int i2, long j) {
        int iLJIIJ = C1682380tsi.LJIIJ(j) + i;
        int i3 = 0;
        if (iLJIIJ < 0) {
            iLJIIJ = 0;
        }
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        if (iLJIIIIZZ != Integer.MAX_VALUE && (iLJIIIIZZ = iLJIIIIZZ + i) < 0) {
            iLJIIIIZZ = 0;
        }
        int iLJIIIZ = C1682380tsi.LJIIIZ(j) + i2;
        if (iLJIIIZ < 0) {
            iLJIIIZ = 0;
        }
        int iLJII = C1682380tsi.LJII(j);
        if (iLJII == Integer.MAX_VALUE || (iLJII = iLJII + i2) >= 0) {
            i3 = iLJII;
        }
        return LIZ(iLJIIJ, iLJIIIIZZ, iLJIIIZ, i3);
    }

    public static final long LIZ(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (i4 >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (i3 < 0) {
            z4 = false;
        }
        if (!(z4 & z6)) {
            C1682410tsl.LIZ("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return LJII(i, i2, i3, i4);
    }

    public static final long LJII(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        int iLIZJ = LIZJ(i5);
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        } else {
            i6 = i2;
        }
        int iLIZJ2 = LIZJ(i6);
        if (iLIZJ + iLIZJ2 > 31) {
            LJIIIZ(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iLIZJ2 - 13;
        int i10 = i9 + 15;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << i10) | (((long) (i8 & (~(i8 >> 31)))) << (i10 + 31));
    }
}
