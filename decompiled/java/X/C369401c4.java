package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.01c4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C369401c4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z) {
        String str2;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
            map.put("layout_id", C917520Zz4.LIZJ());
        }
        map.put("action_type", str);
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        map.put("switch_to", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_points_reset_icon");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
