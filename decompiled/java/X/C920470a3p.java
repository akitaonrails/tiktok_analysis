package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0a3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920470a3p {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4) {
        long followStatus;
        User owner;
        FollowInfo followInfo;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        map.put("follow_status", String.valueOf(followStatus));
        map.put("gift_id", str);
        map.put("coins_gap", str2);
        map.put("popup_action_type", str3);
        map.put("popup_type", str4);
        C0KX4.LIZ("livesdk_guest_prioritized_gift_popup_show", map, null, true);
    }
}
