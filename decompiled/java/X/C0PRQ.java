package X;

/* JADX INFO: renamed from: X.0PRQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRQ {
    public static void LIZ(C0PRP c0prp) {
        String str;
        String str2;
        if (c0prp.LLILLJJLI > 0 && (str = c0prp.LL) != null && str.length() != 0 && (str2 = c0prp.LLILZ) != null && str2.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c0prp.LLILLJJLI;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("search_id", c0prp.LL);
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            c2344009Gk.LJIIIIZZ("group_id", c0prp.LLILLL);
            c2344009Gk.LJIIIIZZ("enter_from", c0prp.LLILZIL);
            c2344009Gk.LJIIIIZZ("enter_method", c0prp.LLILZLL);
            c2344009Gk.LJIIIIZZ("enter_from_channel", c0prp.LLIZ);
            c2344009Gk.LJIIIIZZ("search_type", c0prp.LLILZ);
            String str3 = c0prp.LLIZLLLIL;
            if (str3 != null) {
                c2344009Gk.LJFF("enter_group_id", str3);
            }
            String str4 = c0prp.LLJ;
            if (str4 != null) {
                c2344009Gk.LJFF("req_search_enter_method", str4);
            }
            String str5 = c0prp.LLJI;
            if (str5 != null) {
                c2344009Gk.LJFF("req_search_enter_from", str5);
            }
            if (!C1823107Cb.LIZ()) {
                String str6 = c0prp.LLJIJIL;
                if (str6 != null && str6.length() > 0) {
                    c2344009Gk.LJFF("vs_result_feed_impr_id", str6);
                }
                String str7 = c0prp.LLJILJIL;
                if (str7 != null && str7.length() > 0) {
                    c2344009Gk.LJFF("req_visual_unified_tag_id", str7);
                }
            }
            C20684815ws.LJIILLIIL("search_result_stay_time", c2344009Gk.LIZ);
        }
    }
}
