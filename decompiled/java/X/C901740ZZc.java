package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0ZZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901740ZZc implements InterfaceC901860ZZo {
    public static final void LIZ(long j, String str, String str2, String str3) {
        C0I0B.LJFF.LIZIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from_merge", "chat");
        c2344009Gk.LJIIIIZZ("enter_method", "live_cover");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("anchor_id", str2);
        c2344009Gk.LJIIIIZZ("room_id", str3);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "success_duration");
        C20684815ws.LJIILLIIL("livesdk_live_cell_autoplay", c2344009Gk.LIZ);
    }
}
