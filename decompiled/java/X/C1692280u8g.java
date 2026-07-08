package X;

/* JADX INFO: renamed from: X.0u8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692280u8g {
    public static final long LIZIZ = C1680680tpy.LIZ(0, 0);
    public static final /* synthetic */ int LIZJ = 0;
    public final long LIZ;

    public static final boolean LIZIZ(long j, long j2) {
        return j == j2;
    }

    public static final int LIZLLL(long j) {
        return (int) (j & 4294967295L);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        return LJIIIIZZ(this.LIZ);
    }

    public /* synthetic */ C1692280u8g(long j) {
        this.LIZ = j;
    }

    public static final boolean LIZJ(long j) {
        if (((int) (j >> 32)) == LIZLLL(j)) {
            return true;
        }
        return false;
    }

    public static final int LJ(long j) {
        return LJFF(j) - LJI(j);
    }

    public static final int LJFF(long j) {
        return Math.max((int) (j >> 32), LIZLLL(j));
    }

    public static final int LJI(long j) {
        return Math.min((int) (j >> 32), LIZLLL(j));
    }

    public static final boolean LJII(long j) {
        if (((int) (j >> 32)) > LIZLLL(j)) {
            return true;
        }
        return false;
    }

    public static String LJIIIIZZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextRange(");
        sbLIZ.append((int) (j >> 32));
        sbLIZ.append(", ");
        sbLIZ.append(LIZLLL(j));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1692280u8g) || j != ((C1692280u8g) obj).LIZ) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (LJI(j) <= LJI(j2)) {
            z = true;
        } else {
            z = false;
        }
        if (LJFF(j2) > LJFF(j)) {
            z2 = false;
        }
        return z & z2;
    }
}
