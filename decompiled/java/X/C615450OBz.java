package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0OBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615450OBz {
    public static final C615450OBz LIZ = new C615450OBz();
    public static String LIZIZ = "click_bar";

    public static final void LIZ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "prop_page");
        c2344009Gk.LJIIIIZZ("prop_id", str);
        c2344009Gk.LJIIIIZZ("prop_author_id", str2);
        c2344009Gk.LJIIIIZZ("enter_method", LIZIZ);
        c2344009Gk.LIZJ(1, "is_prop_author_video");
        c2344009Gk.LIZJ(1, "order");
        c2344009Gk.LJIIIIZZ("group_id", str4);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        C20684815ws.LJIILLIIL("save_featured_video_status", c2344009Gk.LIZ);
    }
}
