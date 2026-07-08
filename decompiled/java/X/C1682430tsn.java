package X;

/* JADX INFO: renamed from: X.0tsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682430tsn {
    public static final void LIZ(long j) {
        if (C1682440tso.LIZIZ(j) == 0) {
            C1682410tsl.LIZ("Cannot perform operation for Unspecified type.");
        }
    }

    public static final long LIZJ(double d) {
        return LJFF((float) d, 4294967296L);
    }

    public static final long LIZLLL(float f) {
        return LJFF(f, 4294967296L);
    }

    public static final long LJ(int i) {
        return LJFF(i, 4294967296L);
    }

    public static final void LIZIZ(long j, long j2) {
        if (C1682440tso.LIZIZ(j) == 0 || C1682440tso.LIZIZ(j2) == 0) {
            C1682410tsl.LIZ("Cannot perform operation for Unspecified type.");
        }
        if (!C1682450tsp.LIZ(C1682440tso.LIZJ(j), C1682440tso.LIZJ(j2))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot perform operation for ");
            sbLIZ.append((Object) C1682450tsp.LIZIZ(C1682440tso.LIZJ(j)));
            sbLIZ.append(" and ");
            sbLIZ.append((Object) C1682450tsp.LIZIZ(C1682440tso.LIZJ(j2)));
            C1682410tsl.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final long LJFF(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        return jFloatToRawIntBits;
    }
}
