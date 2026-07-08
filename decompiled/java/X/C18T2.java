package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.18T2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18T2 {
    public static final C18T2 LIZ = new C18T2();
    public static final HashMap<String, C18T3> LIZIZ = new HashMap<>();
    public static String LIZJ = "";

    public static C0LAB LIZJ() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("conversation_id", LIZJ);
        return c0lab;
    }

    public static void LIZ(String str) {
        LIZIZ.put(str, new C18T3(System.currentTimeMillis(), 12));
    }

    public static void LIZLLL(String str) {
        HashMap<String, C18T3> map = LIZIZ;
        C18T3 c18t3 = map.get(str);
        if (c18t3 != null) {
            c18t3.LIZIZ = System.currentTimeMillis();
            LIZ.getClass();
            LJFF(str, c18t3);
            map.remove(str);
        }
    }

    public static void LIZIZ(String str, String str2) {
        HashMap<String, C18T3> map = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        map.put(C2188811AlT.LIZIZ(sbLIZ), new C18T3(System.currentTimeMillis(), 4));
    }

    public static void LJ(String str, String str2) {
        HashMap<String, C18T3> map = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        C18T3 c18t3 = map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (c18t3 != null) {
            c18t3.LIZIZ = System.currentTimeMillis();
            LIZ.getClass();
            LJFF(str, c18t3);
        }
    }

    public static void LJFF(String str, C18T3 c18t3) {
        if (c18t3.LIZIZ - c18t3.LIZ < 0) {
            return;
        }
        C0LAB c0labLIZJ = LIZJ();
        c0labLIZJ.LIZIZ(c18t3.LIZIZ - c18t3.LIZ, "duration");
        C20684815ws.LJIILLIIL(str, c0labLIZJ.LIZ);
    }

    public static void LJI(String str, boolean z) {
        C0LAB c0labLIZJ = LIZJ();
        c0labLIZJ.LJFF("success", z);
        C20684815ws.LJIILLIIL(str, c0labLIZJ.LIZ);
    }
}
