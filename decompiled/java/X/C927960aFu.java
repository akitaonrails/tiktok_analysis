package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0aFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927960aFu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        HashMap map = new HashMap();
        map.put("errorMsg", str);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("room_id", room.getIdStr());
        }
        C0KX4.LIZ("livesdk_linkmic_audience_click_entrance_intercepted", map, null, true);
    }

    public static void LIZIZ(Room room, int i, int i2, String str, String str2) {
        Long lValueOf;
        User owner;
        FollowInfo followInfo;
        HashMap map = new HashMap();
        C01Z4.LIZ(room, map);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        } else {
            lValueOf = null;
        }
        map.put("anchor_relationship", String.valueOf(lValueOf));
        map.put("set_guest_cnt", String.valueOf(i));
        map.put("icon_rank", String.valueOf(i2));
        if (str2 == null) {
            str2 = "1";
        }
        map.put("reason", str2);
        map.put("multi_request_id", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_audience_seats_icon_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
