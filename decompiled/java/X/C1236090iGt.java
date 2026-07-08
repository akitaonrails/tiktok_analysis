package X;

import java.util.List;

/* JADX INFO: renamed from: X.0iGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236090iGt {
    public static final C1236090iGt LIZ = new C1236090iGt();

    public static void LIZIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", str);
        c2344009Gk.LJIIIIZZ("enter_from", "live");
        c2344009Gk.LJIIIIZZ("room_id", str2);
        C20684815ws.LJIILLIIL("livesdk_live_takepage_series_show", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, List list) {
        String strLJJLIIIJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "live");
        c2344009Gk.LJIIIIZZ("user_id", str);
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        c2344009Gk.LJIIIIZZ("collection_id_list", strLJJLIIIJ);
        c2344009Gk.LJIIIIZZ("room_id", str2);
        c2344009Gk.LJIIIIZZ("error_code", str3);
        C20684815ws.LJIILLIIL("add_series_page_show_live", c2344009Gk.LIZ);
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", str);
        c2344009Gk.LJIIIIZZ("collection_id", str2);
        c2344009Gk.LJIIIIZZ("room_id", str3);
        c2344009Gk.LIZJ(i, "finish_flag");
        C20684815ws.LJIILLIIL("pinned_series_show_live", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, List list) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "live");
        c2344009Gk.LJIIIIZZ("user_id", str);
        c2344009Gk.LJ(list, "collection_id_list_ordered");
        c2344009Gk.LJIIIIZZ("room_id", str2);
        c2344009Gk.LJIIIIZZ("page_type", str3);
        c2344009Gk.LJIIIIZZ("error_code", str4);
        C20684815ws.LJIILLIIL("selected_series_show_live", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.CharSequence, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.CharSequence, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static void LJ(String str, String str2, String str3, List list, String str4, List list2, List list3, List list4) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        ?? r3;
        ?? c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "live_shop_panel");
        c2344009Gk.LJIIIIZZ("author_id", str);
        c2344009Gk.LJIIIIZZ("room_id", str2);
        c2344009Gk.LJIIIIZZ("user_id", str3);
        c2344009Gk.LJIIIIZZ("entry_method", "series_list_button");
        String str5 = null;
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        c2344009Gk.LJIIIIZZ("collection_id_list_ordered", strLJJLIIIJ);
        if (list2 != null) {
            str5 = null;
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ2 = null;
        }
        c2344009Gk.LJIIIIZZ("collection_price_list", strLJJLIIIJ2);
        if (list3 != null) {
            ?? r32 = str5;
            strLJJLIIIJ3 = C13LP.LJJLIIIJ(list3, ",", r32, r32, 0, r32, r32, 62);
            r3 = r32;
        } else {
            strLJJLIIIJ3 = str5;
            r3 = str5;
        }
        c2344009Gk.LJIIIIZZ("is_discounted_flag_list", strLJJLIIIJ3);
        ?? LJJLIIIJ = r3;
        if (list4 != null) {
            ?? r33 = r3;
            LJJLIIIJ = C13LP.LJJLIIIJ(list4, ",", r33, r33, 0, r33, r33, 62);
        }
        c2344009Gk.LJIIIIZZ("discount_price_list", LJJLIIIJ);
        c2344009Gk.LJIIIIZZ("error_code", str4);
        C20684815ws.LJIILLIIL("view_series_live", c2344009Gk.LIZ);
    }
}
