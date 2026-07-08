package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0JnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502520JnG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_space_newpost_click");
        c474500IjALIZ.LJJII(str, "post_type");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "anchor_id");
        c474500IjALIZ.LJJII(str2, "space_show_entrance");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_space_newpost_progress");
        c474500IjALIZ.LJJII("topic", "post_type");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LJJII(str2, "topic_type");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "anchor_id");
        c474500IjALIZ.LJJII(str3, "space_show_entrance");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(int i, String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_space_activity_message");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "anchor_id");
        c474500IjALIZ.LJJII(str3, "space_show_entrance");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "message_count");
        c474500IjALIZ.LIZ();
    }
}
