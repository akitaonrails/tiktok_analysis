package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0J8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487080J8g {
    public static void LIZ(Aweme aweme, String str, String str2, boolean z) {
        String aid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        Object objValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            objValueOf = Integer.valueOf(aweme.getAwemeType());
        }
        c2344009Gk.LJ(objValueOf, "aweme_type");
        c2344009Gk.LJIIIIZZ("anchor_type", str);
        c2344009Gk.LIZJ(z ? 1 : 0, "show");
        c2344009Gk.LJIIIIZZ("msg", str2);
        C20684815ws.LJIILLIIL("multi_anchor_filter", c2344009Gk.LIZ);
    }
}
