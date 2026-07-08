package X;

/* JADX INFO: renamed from: X.0QJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668400QJq {
    public static final C668400QJq LIZ = new C668400QJq();

    public static void LIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("position", "homepage_hot");
        c2344009Gk.LIZJ(1, "is_interest_point_query");
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("search_keyword", str);
        C20684815ws.LJIILLIIL("feed_search_words_show", c2344009Gk.LIZ);
    }

    public static void LIZIZ(C0QK9 c0qk9, C0QK7 c0qk7, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str12 = null;
        if (c0qk9 != null) {
            str2 = c0qk9.LIZ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("words_content", str2);
        if (c0qk9 != null) {
            str3 = c0qk9.LIZIZ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("search_position", str3);
        if (c0qk9 != null) {
            str4 = c0qk9.LIZLLL;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str4);
        if (c0qk9 != null) {
            str5 = c0qk9.LJ;
        } else {
            str5 = null;
        }
        c2344009Gk.LJIIIIZZ("last_from_group_id", str5);
        if (c0qk9 != null) {
            str6 = c0qk9.LJFF;
        } else {
            str6 = null;
        }
        c2344009Gk.LJIIIIZZ("last_feed_group_id", str6);
        if (c0qk9 == null || (str7 = c0qk9.LJI) == null) {
            str7 = "";
        }
        c2344009Gk.LJIIIIZZ("latest_group_id", str7);
        if (c0qk7 != null) {
            str8 = c0qk7.LIZ;
        } else {
            str8 = null;
        }
        c2344009Gk.LJIIIIZZ("interest_point", str8);
        if (c0qk7 != null) {
            str9 = c0qk7.LIZIZ;
        } else {
            str9 = null;
        }
        c2344009Gk.LJIIIIZZ("interest_point_recommend", str9);
        if (c0qk7 != null) {
            str10 = c0qk7.LIZJ;
        } else {
            str10 = null;
        }
        c2344009Gk.LJIIIIZZ("interest_point_recommend_position", str10);
        c2344009Gk.LJIIIIZZ("click_type", str);
        if (c0qk7 != null) {
            str11 = c0qk7.LIZLLL;
        } else {
            str11 = null;
        }
        c2344009Gk.LJIIIIZZ("interest_point_words_type", str11);
        if (c0qk7 != null) {
            str12 = c0qk7.LJ;
        }
        c2344009Gk.LJIIIIZZ("interest_point_words_code", str12);
        C20684815ws.LJIILLIIL("interest_point_module_click", c2344009Gk.LIZ);
    }
}
