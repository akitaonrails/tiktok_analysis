package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18CK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18CK {
    public static String LIZ = "";
    public static C18CL LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static void LIZIZ(Function0 function0) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init_");
        sbLIZ.append("BcmServiceImpl");
        LIZ(C2188811AlT.LIZIZ(sbLIZ), function0, false);
    }

    public static void LIZLLL(String str, Function0 function0) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("api_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, false);
    }

    public static void LJ(String str, Function0 function0) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, false);
    }

    public static void LJFF(String str, Function0 function0) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layer1_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, false);
    }

    public static void LJI(String str, Function0 function0) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layer2_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, false);
    }

    public static void LJII(String str, Function0 function0) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layer3_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, false);
    }

    public static void LJIIIZ(String str, Function0 function0) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, false);
    }

    public static void LJIIJJI(String str, Function0 function0) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknown_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, false);
    }

    public static void LJIIL(String str, Function0 function0) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("utils_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, false);
    }

    public static void LIZ(String str, Function0 function0, boolean z) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BTMSDK_BCM_");
        sbLIZ.append(str);
        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ), function0, z);
    }

    public static void LIZJ(String str, Function0 function0, boolean z) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BTMSDK_BTM_");
        sbLIZ.append(str);
        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ), function0, z);
    }

    public static void LJIIIIZZ(String str, Function0 function0, boolean z) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitor_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, z);
    }

    public static void LJIIJ(String str, Function0 function0, boolean z) {
        if (LIZLLL && !LIZJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pageshow_");
        sbLIZ.append(str);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), function0, z);
    }

    public static void LJIILIIL(String str, Function0 function0, boolean z) {
        if (LIZ.length() > 0) {
            C18CL c18cl = LIZIZ;
            if (c18cl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(LIZ);
                c18cl.LIZ(C2188811AlT.LIZIZ(sbLIZ), function0, z);
                return;
            }
            return;
        }
        C18CL c18cl2 = LIZIZ;
        if (c18cl2 == null) {
            return;
        }
        c18cl2.LIZ(str, function0, z);
    }
}
