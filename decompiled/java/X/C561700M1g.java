package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0M1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561700M1g {
    public static final C561700M1g LIZ = new C561700M1g();

    public static String LIZJ(EnumC561670M1d enumC561670M1d, C0M22 c0m22) {
        int i = C561690M1f.LIZ[enumC561670M1d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (c0m22 instanceof C0M20) {
                    return "creation_date_asc";
                }
                if (!(c0m22 instanceof C561890M1z)) {
                    throw new C1954807lC();
                }
                return "size_desc";
            }
            throw new C1954807lC();
        }
        return "size_desc";
    }

    public static void LIZIZ(String str, int i, boolean z, EnumC561670M1d enumC561670M1d, C0M22 c0m22, String str2) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("draft_select_page_type", "popup");
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LIZJ(i, "select_count");
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_first_selection", str3);
        c2344009Gk.LJIIIIZZ("filter_by", "no_filter");
        c2344009Gk.LJIIIIZZ("sort_by", LIZJ(enumC561670M1d, c0m22));
        C20684815ws.LJIILLIIL("select_draft", c2344009Gk.LIZ);
    }

    public static void LIZ(C0M22 c0m22, int i, long j, int i2, long j2, String str, String str2) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c0m22 instanceof C0M20) {
            str3 = "draft_cnt";
        } else if (c0m22 instanceof C561890M1z) {
            str3 = "draft_size";
        } else {
            throw new C1954807lC();
        }
        c2344009Gk.LJIIIIZZ("alert_type", str3);
        c2344009Gk.LJIIIIZZ("component_type", "popup");
        c2344009Gk.LJIIIIZZ("event_element", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LIZJ(i, "alert_draft_cnt");
        c2344009Gk.LIZLLL(j, "alert_draft_size");
        c2344009Gk.LIZJ(i2, "draft_cnt");
        c2344009Gk.LIZLLL(j2, "draft_size");
        C20684815ws.LJIILLIIL("ttcrt_draft_guide_click", c2344009Gk.LIZ);
    }
}
