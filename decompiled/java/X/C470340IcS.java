package X;

/* JADX INFO: renamed from: X.0IcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470340IcS {
    public static String LIZ(long j) {
        if (j >= 1000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C341701Uh.LIZ("%.2f", Double.valueOf((j * 1.0d) / 1000000.0d)));
            sbLIZ.append("m");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j >= 1000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C341701Uh.LIZ("%.2f", Double.valueOf((j * 1.0d) / 1000.0d)));
            sbLIZ2.append("k");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return String.valueOf(j);
    }

    public static String LIZIZ(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000.0d)));
            sbLIZ.append("k");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C341701Uh.LIZ("%.0f", Double.valueOf((j * 1.0d) / 1000.0d)));
            sbLIZ2.append("k");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000000.0d)));
        sbLIZ3.append("m");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
