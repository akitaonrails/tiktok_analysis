package X;

/* JADX INFO: renamed from: X.0tsi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682380tsi {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    public static final boolean LIZJ(long j, long j2) {
        return j == j2;
    }

    public static final boolean LIZLLL(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return (((int) (j >> ((i2 + 15) + 31))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean LJ(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static final boolean LJFF(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = i2 + 15;
        int i5 = ((int) (j >> i4)) & i3;
        int i6 = ((int) (j >> (i4 + 31))) & i3;
        return i5 == (i6 == 0 ? Integer.MAX_VALUE : i6 - 1);
    }

    public static final boolean LJI(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = ((int) (j >> 33)) & i2;
        return (((int) (j >> 2)) & i2) == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    public static final int LJII(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = ((int) (j >> ((i2 + 15) + 31))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int LJIIIIZZ(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final int LJIIIZ(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int LJIIJ(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        return LJIIJJI(this.LIZ);
    }

    public /* synthetic */ C1682380tsi(long j) {
        this.LIZ = j;
    }

    public static String LJIIJJI(long j) {
        String strValueOf;
        int iLJIIIIZZ = LJIIIIZZ(j);
        String strValueOf2 = "Infinity";
        if (iLJIIIIZZ == Integer.MAX_VALUE) {
            strValueOf = "Infinity";
        } else {
            strValueOf = String.valueOf(iLJIIIIZZ);
        }
        int iLJII = LJII(j);
        if (iLJII != Integer.MAX_VALUE) {
            strValueOf2 = String.valueOf(iLJII);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Constraints(minWidth = ");
        sbLIZ.append(LJIIJ(j));
        sbLIZ.append(", maxWidth = ");
        sbLIZ.append(strValueOf);
        sbLIZ.append(", minHeight = ");
        sbLIZ.append(LJIIIZ(j));
        sbLIZ.append(", maxHeight = ");
        sbLIZ.append(strValueOf2);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1682380tsi) || j != ((C1682380tsi) obj).LIZ) {
            return false;
        }
        return true;
    }

    public static final long LIZ(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            C1682410tsl.LIZ("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return C1682390tsj.LJII(i, i2, i3, i4);
    }
}
