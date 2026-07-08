package X;

/* JADX INFO: renamed from: X.0kjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330590kjJ {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static InterfaceC1331270kkP LIZJ;

    public static void LJ(String str) {
        if (LIZJ != null) {
            C1330660kjQ.LIZ(6, str);
        }
    }

    public static void LIZIZ(String str, String str2) {
        int i = C2187451AjH.LIZ;
        LIZ(0, str, str2, "");
    }

    public static void LIZJ(String str, String str2, String str3) {
        int i = C2187451AjH.LIZ;
        LIZ(0, str, str2, str3);
    }

    public static void LJFF(String str, String str2, String str3) {
        int i = C2187451AjH.LIZ;
        LIZLLL(0, str, str2, str3);
    }

    public static void LJII(int i, String str, String str2) {
        int i2 = C2187451AjH.LIZ;
        LJIIIIZZ(i, str, str2, "");
    }

    public static void LJIIIZ(String str, String str2, String str3) {
        int i = C2187451AjH.LIZ;
        LJIIIIZZ(0, str, str2, str3);
    }

    public static void LIZ(int i, String str, String str2, String str3) {
        if (LIZJ != null) {
            C1330660kjQ.LIZ(3, LJI(i, str, str2, str3));
        }
    }

    public static void LIZLLL(int i, String str, String str2, String str3) {
        if (LIZJ != null) {
            C1330660kjQ.LIZ(6, LJI(i, str, str2, str3));
        }
    }

    public static String LJI(int i, String str, String str2, String str3) {
        if (i == 0) {
            return "[[" + str + "::" + str2 + "]]  " + str3;
        }
        return "[[" + str + "::" + str2 + "::" + i + "]]  " + str3;
    }

    public static void LJIIIIZZ(int i, String str, String str2, String str3) {
        if (LIZIZ) {
            if (LIZJ != null) {
                if (2 >= C1332140klo.LIZ) {
                    C2344809Gs.LIZLLL(2, "[Lighten]", LJI(i, str, str2, str3));
                }
                C2213981Bky.LIZIZ.isOffline();
                return;
            }
            return;
        }
        if (LIZJ == null) {
            return;
        }
        C1330660kjQ.LIZ(2, LJI(i, str, str2, str3));
    }
}
