package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.01Z5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01Z5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Map map) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            HashMap map2 = (HashMap) map;
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map2.put("room_id", room.getIdStr());
            C917650ZzH.LIZIZ(map);
        }
    }

    public static void LIZIZ(String str) {
        HashMap map = new HashMap();
        LIZ(map);
        map.put("action_type", str);
        map.put("layout_setting", C917520Zz4.LJII(C917520Zz4.LJIILIIL()).getFirst());
        map.put("window_setting", C917520Zz4.LJII(C917520Zz4.LJIILIIL()).getSecond());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_multi_settings_icon");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
