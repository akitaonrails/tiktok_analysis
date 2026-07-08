package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.ss.android.common.util.NetworkUtils;
import java.util.Map;

/* JADX INFO: renamed from: X.0iPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241460iPY {
    public static long LIZIZ;
    public static boolean LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static int LJI;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final C1241460iPY LIZ = new C1241460iPY();
    public static boolean LJII = true;

    public static void LJIIIIZZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "search_icon");
        c2344009Gk.LIZJ(LIZLLL, "counter");
        c2344009Gk.LIZJ(LJ, "recent_counter");
        c2344009Gk.LIZJ(LJFF, "suggested_counter");
        c2344009Gk.LIZJ(LJI, "result_counter");
        C20684815ws.LJIILLIIL("dm_search_valid_consume_performance", c2344009Gk.LIZ);
        LIZLLL = 0;
        LJ = 0;
        LJFF = 0;
        LJI = 0;
    }

    public static void LIZ(boolean z) {
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        long serverTimeMills = NetworkUtils.getServerTimeMills();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "search_icon");
        long j = 0;
        c2344009Gk.LIZLLL(0L, "is_animation_enable");
        c2344009Gk.LIZLLL(0L, "is_low_end_device");
        c2344009Gk.LIZLLL(serverTimeMills - LIZIZ, "overall_cost");
        if (z) {
            j = 1;
        }
        c2344009Gk.LIZLLL(j, "is_empty");
        C20684815ws.LJIILLIIL("dm_search_launch_performance", c2344009Gk.LIZ);
    }

    public static void LIZJ(Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "dm_search_page");
        LIZIZ(c2344009Gk, map);
        if (map.containsKey("action")) {
            c2344009Gk.LJFF("action", (String) map.get("action"));
        }
        C20684815ws.LJIILLIIL("click_dm_search_cell", c2344009Gk.LIZ);
    }

    public static void LIZLLL(Map map) {
        Integer numValueOf;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "dm_search_page");
        LIZIZ(c2344009Gk, map);
        if (map.containsKey("item_num")) {
            String str = (String) map.get("item_num");
            if (str != null) {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "item_num");
        }
        C20684815ws.LJIILLIIL("show_dm_search_cell", c2344009Gk.LIZ);
    }

    public static void LJI(C1241480iPa c1241480iPa) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "inbox");
        c2344009Gk.LIZIZ(System.currentTimeMillis() - c1241480iPa.LIZ, "duration");
        c2344009Gk.LIZJ(c1241480iPa.LIZJ, "selection_count");
        c2344009Gk.LIZJ(c1241480iPa.LIZIZ, "query_count");
        c2344009Gk.LJIIIIZZ("search_keyword", c1241480iPa.LIZLLL);
        C20684815ws.LJIILLIIL("social_search_session_summary", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(EnumC1241340iPM enumC1241340iPM) {
        int i = C1241360iPO.LIZJ[enumC1241340iPM.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LJI++;
                }
            } else {
                LJ++;
            }
        } else {
            LJFF++;
        }
        LIZLLL++;
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, Map map) {
        String str;
        Integer numValueOf;
        if (map.containsKey("position")) {
            c2344009Gk.LJFF("position", (String) map.get("position"));
        }
        if (map.containsKey("cell_type")) {
            c2344009Gk.LJFF("cell_type", (String) map.get("cell_type"));
        }
        if (map.containsKey("tab_name")) {
            c2344009Gk.LJFF("tab_name", (String) map.get("tab_name"));
        }
        if (map.containsKey("to_user_id")) {
            c2344009Gk.LJFF("to_user_id", (String) map.get("to_user_id"));
        }
        if (map.containsKey("conversation_id")) {
            c2344009Gk.LJFF("conversation_id", (String) map.get("conversation_id"));
        }
        if (map.containsKey("rank_num")) {
            c2344009Gk.LJFF("rank_num", (String) map.get("rank_num"));
        }
        if (map.containsKey("relation_tag")) {
            String str2 = (String) map.get("relation_tag");
            if (str2 != null) {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str2));
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "relation_tag");
        }
        if (map.containsKey("rec_type") && (str = (String) map.get("rec_type")) != null && str.length() > 0) {
            c2344009Gk.LJFF("rec_type", (String) map.get("rec_type"));
        }
        if (map.containsKey("chat_type")) {
            c2344009Gk.LJFF("chat_type", (String) map.get("chat_type"));
        }
        if (map.containsKey("content_id")) {
            c2344009Gk.LJFF("content_id", (String) map.get("content_id"));
        }
        if (map.containsKey("is_stranger")) {
            c2344009Gk.LJFF("is_stranger", (String) map.get("is_stranger"));
        }
        if (map.containsKey("search_content_type")) {
            c2344009Gk.LJFF("search_content_type", (String) map.get("search_content_type"));
        }
    }

    public static void LJ(String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", str);
        if (z) {
            str2 = "enter_filter";
        } else {
            str2 = "clear";
        }
        c2344009Gk.LJIIIIZZ("action_type", str2);
        C20684815ws.LJIILLIIL("click_inbox_search_filter", c2344009Gk.LIZ);
    }

    public static void LJFF(EnumC1241180iP6 enumC1241180iP6, long j, C1241470iPZ c1241470iPZ) {
        String str;
        long j2;
        if (!LJIIIIZZ) {
            return;
        }
        LJIIIIZZ = false;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("page_type", "default");
        int i = C1241360iPO.LIZ[enumC1241180iP6.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "other";
            } else {
                str = "empty";
            }
        } else {
            str = "normal";
        }
        c2344009Gk.LJIIIIZZ("page_status", str);
        if (LJII) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        c2344009Gk.LIZLLL(j2, "is_first_load");
        c2344009Gk.LIZLLL(j, "overall_cost");
        c2344009Gk.LIZLLL(c1241470iPZ.LIZ, "suggested_query_cost");
        c2344009Gk.LJIIIIZZ("suggested_query_type", c1241470iPZ.LIZIZ);
        c2344009Gk.LIZLLL(c1241470iPZ.LIZJ, "suggested_convert_cost");
        c2344009Gk.LIZJ(c1241470iPZ.LIZLLL, "suggested_count");
        c2344009Gk.LIZLLL(c1241470iPZ.LJ, "recent_query_cost");
        c2344009Gk.LIZLLL(c1241470iPZ.LJFF, "recent_convert_cost");
        c2344009Gk.LIZJ(c1241470iPZ.LJI, "recent_count");
        C20684815ws.LJIILLIIL("dm_search_page_load_performance", c2344009Gk.LIZ);
        LJII = false;
    }

    public static void LJII(EnumC1241490iPb enumC1241490iPb, long j, int i) {
        String str;
        if (!LJIIIZ) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("page_type", "result");
        int i2 = C1241360iPO.LIZIZ[enumC1241490iPb.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                str = "other";
            } else {
                str = "empty";
            }
        } else {
            str = "normal";
        }
        c2344009Gk.LJIIIIZZ("page_status", str);
        c2344009Gk.LIZLLL(0L, "is_first_load");
        c2344009Gk.LIZLLL(j, "overall_cost");
        c2344009Gk.LIZJ(i, "result_count");
        C20684815ws.LJIILLIIL("dm_search_page_load_performance", c2344009Gk.LIZ);
    }
}
