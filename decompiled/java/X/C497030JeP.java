package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497030JeP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, String str, String str2) {
        HashMap map = new HashMap();
        map.put("action_type", str);
        map.put("from_user_id", String.valueOf(j));
        map.put("position", str2);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("room_id", room.getIdStr());
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        map.putAll(C917810ZzX.LIZLLL());
        C0KX4.LIZ("livesdk_connection_anchor_popup", map, null, true);
    }
}
