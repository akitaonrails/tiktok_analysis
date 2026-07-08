package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0aB2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924940aB2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(LiveEffect liveEffect, long j, boolean z, boolean z2, boolean z3, String str, long j2, boolean z4, int i, String str2) {
        long effectId;
        String str3;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("room_id", room.getIdStr());
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        if (liveEffect != null) {
            effectId = liveEffect.getEffectId();
        } else {
            effectId = 0;
        }
        map.put("props_id", String.valueOf(effectId));
        map.put("enhance_level", String.valueOf(j));
        map.put("guest_permission", C917520Zz4.LJIIIIZZ(false, null));
        map.put("mic_status", String.valueOf(!z ? 1 : 0));
        map.put("camera_status", String.valueOf(!z2 ? 1 : 0));
        if (z2) {
            str3 = "off";
        } else if (z3) {
            str3 = "rear";
        } else {
            str3 = "front";
        }
        map.put("camera_type", str3);
        map.put("close_way", str);
        map.put("stay_duration", String.valueOf(j2 / 1000.0f));
        if (z4) {
            map.put("enlarge_status", String.valueOf(i));
        }
        map.put("request_page", str2);
        C924620aAW.LJIIJJI(map);
        C917520Zz4.LIZ(map);
        C0KX4.LIZ("livesdk_guest_connection_setting_panel_close", map, null, true);
    }

    public static void LIZJ(String str, String str2, String str3, LiveEffect liveEffect, long j, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        long effectId;
        String str4;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("room_id", room.getIdStr());
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1183699191) {
                if (iHashCode != 93029230) {
                    if (iHashCode == 1466857630 && str.equals("join_direct")) {
                        map.put("guest_invite_type", "guest_apply_anchor");
                    }
                } else if (str.equals("apply")) {
                    map.put("guest_invite_type", "guest_apply_anchor");
                }
            } else if (str.equals("invite")) {
                map.put("guest_invite_type", "anchor_invite_guest");
            }
        }
        map.put("request_page", str2);
        if (z2) {
            str3 = "";
        }
        map.put("tab", str3);
        if (liveEffect != null) {
            effectId = liveEffect.getEffectId();
        } else {
            effectId = 0;
        }
        map.put("props_id", String.valueOf(effectId));
        map.put("enhance_level", String.valueOf(j));
        map.put("guest_permission", C917520Zz4.LJIIIIZZ(false, null));
        map.put("mic_status", String.valueOf(!z ? 1 : 0));
        map.put("camera_status", String.valueOf(!z2 ? 1 : 0));
        if (z2) {
            str4 = "off";
        } else if (z3) {
            str4 = "rear";
        } else {
            str4 = "front";
        }
        map.put("camera_type", str4);
        if (z4) {
            map.put("enlarge_status", String.valueOf(i));
        }
        C924620aAW.LJIIJJI(map);
        C917520Zz4.LIZ(map);
        C0KX4.LIZ("livesdk_guest_connection_setting_panel_show", map, null, true);
    }
}
