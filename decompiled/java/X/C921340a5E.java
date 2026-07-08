package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921340a5E {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j, String str, String str2) {
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

    public static final void LIZ(String str, Long l, long j, String str2) {
        HashMap map = new HashMap();
        if (Intrinsics.LJFF(C920830a4P.LJFF, "appointment_guide")) {
            map.put("enter_from", "appointment_guide");
        }
        map.put("from_user_id", String.valueOf(l));
        map.put("is_reservation_sender", CardStruct.IStatusCode.DEFAULT);
        map.put("click_time", str);
        map.put("reservation_id", String.valueOf(j));
        map.put("reservation_status", str2);
        C0KX4.LIZ("livesdk_anchor_guest_connection_reservation_show", map, null, true);
    }
}
