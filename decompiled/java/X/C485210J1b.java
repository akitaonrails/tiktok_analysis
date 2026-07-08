package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0J1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485210J1b {
    public static final void LIZ(int i, long j, boolean z, boolean z2) {
        String str;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str = "refresh";
        } else {
            str = "loadmore";
        }
        c2344009Gk.LJIIIIZZ("load_type", str);
        c2344009Gk.LIZJ(i, "count");
        c2344009Gk.LIZLLL(j, "duration");
        if (z2) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        C20684815ws.LJIILLIIL("repost_tab_net_session", c2344009Gk.LIZ);
    }
}
