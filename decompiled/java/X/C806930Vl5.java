package X;

/* JADX INFO: renamed from: X.0Vl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806930Vl5 {
    public static String LIZ = "Bench-";
    public static byte LIZIZ = 3;

    public static void LIZ(String str) {
        if ((LIZIZ & 8) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZIZ(String str) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZJ(String str) {
        if ((LIZIZ & 4) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJ(String str) {
        if ((LIZIZ & 2) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZLLL(String str, byte b) {
        if (str.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-");
            LIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZIZ = b;
    }
}
