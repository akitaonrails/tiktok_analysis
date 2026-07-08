package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import qo2.w;

/* JADX INFO: renamed from: X.0ILV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ILV {
    public static void LIZ(int i, String str, long j, PunishEventInfo punishEventInfo, boolean z) {
        HashMap map;
        String str2;
        if (punishEventInfo != null) {
            map = new HashMap();
            map.put("record_id", punishEventInfo.punishId);
            map.put("violation_type", punishEventInfo.punishType);
            map.put("violation_reason", punishEventInfo.punishReason);
            map.put("violation_anchor_id", String.valueOf(punishEventInfo.violationUid));
        } else {
            map = null;
        }
        EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_finish_show");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "room_position");
        c474500IjALIZ.LJJII(str, "show_reason");
        c474500IjALIZ.LJJII(Long.valueOf(j), "watch_live_duration");
        c474500IjALIZ.LJJII(0, "is_half_screen");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_guest_spec");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(enterRoomConfig.mRoomsData.roomId), "room_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIILLIIL(), "live_window_mode");
        c474500IjALIZ.LIZ();
    }
}
