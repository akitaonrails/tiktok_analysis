package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0O5Y, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O5Y {
    public static final C0O5Y LIZ = new C0O5Y();
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static void LIZ(String str) {
        C2344809Gs.LIZLLL(6, "state_agent", str);
    }

    public static void LJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("id: ");
        sbLIZ.append(str);
        sbLIZ.append(", cannot sync state, reason: ");
        sbLIZ.append(str2);
        LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL("sync_state_failed", C2097608Jq.LJIIJ(new Pair("item_id", str), new Pair("reason", str2)));
    }

    public static void LIZIZ(String str, C19719912Dl c19719912Dl, boolean z, Object obj) {
        String str2;
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19719912Dl.LJI());
        sbLIZ.append(", try to get state of: ");
        sbLIZ.append(str);
        sbLIZ.append(", result: ");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        if (z) {
            str2 = "success, state is: ";
        } else {
            str2 = "failed, no record, use default state: ";
        }
        sbLIZ2.append(str2);
        sbLIZ2.append(obj);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            String str3 = "";
            if (LIZIZ) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("");
                sbLIZ3.append("main type adapter not registered,");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            if (!LIZJ) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append("profile type adapter not registered,");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            if (!LIZLLL) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ);
                sbLIZ5.append("cold start type adapter not registered,");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            }
            if (strLIZIZ.length() == 0) {
                strLIZIZ = "unknown";
            }
            Pair[] pairArr = new Pair[2];
            String strLJI = c19719912Dl.LJI();
            if (strLJI != null) {
                str3 = strLJI;
            }
            pairArr[0] = new Pair("type", str3);
            pairArr[1] = new Pair("reason", strLIZIZ);
            C20684815ws.LJIILLIIL("get_current_state_failed", C2097608Jq.LJIIJ(pairArr));
        }
        LIZ(strLIZIZ2);
    }

    public static void LIZJ(String str, C19719912Dl c19719912Dl, Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19719912Dl.LJI());
        sbLIZ.append(", real update occurs on id ");
        sbLIZ.append(str);
        sbLIZ.append(", update to: ");
        sbLIZ.append(obj);
        sbLIZ.append(", current state is: ");
        sbLIZ.append(obj2);
        LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZLLL(String str, C19719912Dl c19719912Dl, Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19719912Dl.LJI());
        sbLIZ.append(", rollback occurs on id ");
        sbLIZ.append(str);
        sbLIZ.append(", rollback to: ");
        sbLIZ.append(obj);
        sbLIZ.append(", current state is: ");
        sbLIZ.append(obj2);
        LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
