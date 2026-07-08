package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0TGS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TGS {
    public static final void LIZ(long j) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_highlight_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(int i, long j, String str, boolean z) {
        String str2;
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_highlight_result_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(str, "item_id");
        if (!z) {
            c474500IjALIZ.LJJII(Integer.valueOf(i), "fail_type");
        }
        c474500IjALIZ.LIZ();
    }
}
