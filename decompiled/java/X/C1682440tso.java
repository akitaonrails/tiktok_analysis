package X;

/* JADX INFO: renamed from: X.0tso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682440tso {
    public static final C1682450tsp[] LIZIZ = {new C1682450tsp(0), new C1682450tsp(4294967296L), new C1682450tsp(8589934592L)};
    public static final long LIZJ = C1682430tsn.LJFF(Float.NaN, 0);
    public final long LIZ;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static final long LIZIZ(long j) {
        return j & 1095216660480L;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        return LJFF(this.LIZ);
    }

    public static final long LIZJ(long j) {
        return LIZIZ[(int) (LIZIZ(j) >>> 32)].LIZ;
    }

    public static final float LIZLLL(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean LJ(long j) {
        if (LIZIZ(j) == 8589934592L) {
            return true;
        }
        return false;
    }

    public static String LJFF(long j) {
        long jLIZJ = LIZJ(j);
        if (C1682450tsp.LIZ(jLIZJ, 0L)) {
            return "Unspecified";
        }
        if (C1682450tsp.LIZ(jLIZJ, 4294967296L)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZLLL(j));
            sbLIZ.append(".sp");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C1682450tsp.LIZ(jLIZJ, 8589934592L)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LIZLLL(j));
            sbLIZ2.append(".em");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1682440tso) || j != ((C1682440tso) obj).LIZ) {
            return false;
        }
        return true;
    }
}
