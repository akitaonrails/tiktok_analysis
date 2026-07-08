package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C161900jh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, int i) {
        long followStatus;
        User owner;
        FollowInfo followInfo;
        Room roomLIZ = C162100jj.LIZ(dataChannel);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_repost_notification_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (roomLIZ != null && (owner = roomLIZ.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        c474500IjALIZ.LJJII(String.valueOf(followStatus), "follow_status");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "message_type");
        c474500IjALIZ.LIZ();
    }
}
