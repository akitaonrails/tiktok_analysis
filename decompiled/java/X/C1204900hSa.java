package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204900hSa {
    public static final C1204900hSa LIZ = new C1204900hSa();
    public static String LIZIZ;
    public static String LIZJ;
    public static boolean LIZLLL;
    public static Long LJ;

    public static void LIZ() {
        Long l = LJ;
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", "homepage_nearby");
            C1189060h32.LJIJJLI(c2344009Gk, "enter_point", LIZJ);
            c2344009Gk.LJFF("enter_method", "click_nearby_toolzone");
            C1189060h32.LJIJJLI(c2344009Gk, "enable_location", C1204880hSY.LIZ());
            C1189060h32.LJIJJLI(c2344009Gk, "duration", String.valueOf(jCurrentTimeMillis));
            C1189060h32.LJIJJLI(c2344009Gk, "nearby_tab_city_id", C1204880hSY.LIZIZ());
            C20684815ws.LJIILLIIL("stay_time", c2344009Gk.LIZ);
        }
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[set] currentEnterPoint from ");
        sbLIZ.append(LIZJ);
        sbLIZ.append(" to ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZJ = str;
    }

    public static void LIZLLL(boolean z) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[set] shouldMobStayTimeOfTool from ");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(" to ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        } else {
            lValueOf = null;
        }
        LJ(lValueOf);
        LIZLLL = z;
    }

    public static void LJ(Long l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[set] stayTimeStartTimestamp from ");
        sbLIZ.append(LJ);
        sbLIZ.append(" to ");
        sbLIZ.append(l);
        C2188811AlT.LIZIZ(sbLIZ);
        LJ = l;
    }

    public static void LIZIZ(Integer num, Integer num2, Boolean bool, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1189060h32.LJIJJLI(c2344009Gk, "all_item_cnt", num);
        C1189060h32.LJIJJLI(c2344009Gk, "all_item_name", LIZIZ);
        C1189060h32.LJIJJLI(c2344009Gk, "item_name", str);
        C1189060h32.LJIJJLI(c2344009Gk, "item_index", num2);
        C1189060h32.LJIJJLI(c2344009Gk, "nearby_tab_city_id", C1204880hSY.LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "is_cache", Integer.valueOf(Intrinsics.LJFF(Boolean.TRUE, bool) ? 1 : 0));
        C20684815ws.LJIILLIIL("ttls_nearby_toolzone_item_click", c2344009Gk.LIZ);
    }
}
