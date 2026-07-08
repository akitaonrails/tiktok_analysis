package X;

/* JADX INFO: renamed from: X.0lGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351420lGu {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_guide_close_count_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_guide_show_count_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(String str, String str2) {
        if (str != null && str.length() > 0 && 1 != 0) {
            LIZ = str;
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            LIZJ = str2;
            C0TSK.LJFF(LIZJ(str), Integer.valueOf(Math.max(0, C0TSK.LIZJ(6, LIZJ(str), null) - 1)));
        }
    }
}
