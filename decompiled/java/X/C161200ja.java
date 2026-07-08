package X;

import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C161200ja {
    public static final C161200ja LIZ = new C161200ja();

    public static void LIZ(DataChannel dataChannel, String str, SocialMessage socialMessage) {
        String str2;
        int i = socialMessage.followType;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "guest_follow_guest";
                } else {
                    return;
                }
            } else {
                str2 = "guest_follow_anchor";
            }
        } else {
            str2 = "anchor_follow_guest";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_follow_guide_comment");
        if (dataChannel == null) {
            c474500IjALIZ.LJIL();
        } else {
            c474500IjALIZ.LJIJJLI(dataChannel);
        }
        c474500IjALIZ.LJJII(str, "event_action_type");
        c474500IjALIZ.LJJII(str2, "message_type");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(socialMessage.user.getId()), "from_user_id");
        c474500IjALIZ.LJJII(Long.valueOf(socialMessage.targetUserId), "to_user_id");
        c474500IjALIZ.LIZ();
    }
}
