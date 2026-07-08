package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.01c5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C369501c5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, boolean z2, boolean z3) {
        Object obj;
        String str2;
        HashMap map = new HashMap();
        map.put("action_type", str);
        String str3 = "on";
        if (z2) {
            obj = "on";
        } else {
            obj = "off";
        }
        map.put("button_before", obj);
        if (!z3) {
            str3 = "off";
        }
        map.put("switch_to", str3);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("if_highlight", str2);
        map.put("layout_id", C917520Zz4.LIZJ());
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
        }
        C0KX4.LIZ("livesdk_multi_anchor_replay_sharing_icon", map, null, true);
    }
}
