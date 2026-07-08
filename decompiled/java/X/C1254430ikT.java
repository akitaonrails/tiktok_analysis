package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0ikT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254430ikT {
    public static final C1254430ikT LIZ = new C1254430ikT();

    public static void LIZ(String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_aip_influencer", str2);
        C20684815ws.LJIILLIIL("click_aip_direct_link", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_aip_influencer", str2);
        C20684815ws.LJIILLIIL("click_aip_linktree", c2344009Gk.LIZ);
    }

    public static void LIZIZ(int i, String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "result");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_aip_influencer", str2);
        C20684815ws.LJIILLIIL("click_aip_direct_link_result", c2344009Gk.LIZ);
    }

    public static void LIZLLL(int i, String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "result");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_aip_influencer", str2);
        C20684815ws.LJIILLIIL("click_aip_linktree_result", c2344009Gk.LIZ);
    }
}
