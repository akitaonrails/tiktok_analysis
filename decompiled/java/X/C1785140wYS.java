package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0wYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785140wYS {
    public static final C08I7<String, C1785120wYQ> LIZ = new C08I7<>(20);
    public static final List<InterfaceC1785150wYT> LIZIZ = new ArrayList();

    public static C1785120wYQ LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return LIZ.LIZIZ(str);
    }

    public static boolean LIZLLL(String str) {
        C1785120wYQ c1785120wYQLIZIZ = LIZIZ(str);
        if (c1785120wYQLIZIZ == null) {
            return false;
        }
        if (c1785120wYQLIZIZ.LIZJ && c1785120wYQLIZIZ.LJ == 0 && C1819907Av.LIZ()) {
            return false;
        }
        return !c1785120wYQLIZIZ.LIZIZ;
    }

    public static void LJII(String str) {
        C1785120wYQ c1785120wYQLIZIZ = LIZIZ(str);
        if (c1785120wYQLIZIZ != null) {
            LJIIJ(str, C1785120wYQ.LIZ(c1785120wYQLIZIZ, false, true, 0, 0, false, 59));
        }
    }

    public static String LIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append('#');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZJ(int i, String str) {
        C1785120wYQ c1785120wYQLIZIZ = LIZIZ(LIZ(i, str));
        if (c1785120wYQLIZIZ == null) {
            return false;
        }
        if (c1785120wYQLIZIZ.LIZJ && c1785120wYQLIZIZ.LJ == 0 && C1819907Av.LIZ()) {
            return false;
        }
        return !c1785120wYQLIZIZ.LIZIZ;
    }

    public static void LJ(String str, boolean z) {
        C1785120wYQ c1785120wYQLIZIZ = LIZIZ(str);
        if (c1785120wYQLIZIZ != null) {
            LJIIJ(str, C1785120wYQ.LIZ(c1785120wYQLIZIZ, false, false, 0, 0, z, 31));
        }
    }

    public static void LJFF(int i, String str) {
        String strLIZ = LIZ(i, str);
        C1785120wYQ c1785120wYQLIZIZ = LIZIZ(strLIZ);
        if (c1785120wYQLIZIZ != null) {
            LJIIJ(strLIZ, C1785120wYQ.LIZ(c1785120wYQLIZIZ, true, true, 0, 0, false, 57));
        }
    }

    public static void LJI(int i, String str) {
        String strLIZ = LIZ(i, str);
        C1785120wYQ c1785120wYQLIZIZ = LIZIZ(strLIZ);
        if (c1785120wYQLIZIZ != null) {
            LJIIJ(strLIZ, C1785120wYQ.LIZ(c1785120wYQLIZIZ, false, true, 0, 0, false, 59));
        }
    }

    public static void LJIIIZ(String str, boolean z) {
        C1785120wYQ c1785120wYQLIZIZ = LIZIZ(str);
        if (c1785120wYQLIZIZ != null) {
            LJIIJ(str, C1785120wYQ.LIZ(c1785120wYQLIZIZ, z, false, 0, 0, false, 61));
        }
    }

    public static void LJIIJ(String str, C1785120wYQ c1785120wYQ) {
        if (str == null) {
            return;
        }
        LIZ.LIZLLL(str, c1785120wYQ);
    }

    public static void LJIIIIZZ(int i, String str, boolean z) {
        String strLIZ = LIZ(i, str);
        C1785120wYQ c1785120wYQLIZIZ = LIZIZ(strLIZ);
        if (c1785120wYQLIZIZ != null) {
            LJIIJ(strLIZ, C1785120wYQ.LIZ(c1785120wYQLIZIZ, z, false, 0, 0, false, 61));
        }
    }
}
