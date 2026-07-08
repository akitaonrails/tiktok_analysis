package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0a75, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922490a75 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, String str2) {
        String str3;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("connection_type", "guest");
        map.put("switch_to", str);
        map.put("way_of_switch", str2);
        map.put("is_success", String.valueOf(i));
        if (C927560aFG.LIZIZ()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_mg_downgrade", str3);
        C0KX4.LIZ("livesdk_camera_on_and_off", map, null, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZIZ(String str, String str2, Boolean bool, boolean z, boolean z2) {
        String str3;
        Object obj;
        HashMap map = new HashMap();
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1183699191:
                    if (str2.equals("invite")) {
                        map.put("guest_invite_type", "anchor_invite_guest");
                    }
                    break;
                case -1006804125:
                    if (str2.equals("others")) {
                        map.put("guest_invite_type", "others");
                    }
                    break;
                case 93029230:
                    if (str2.equals("apply")) {
                        map.put("guest_invite_type", "guest_apply_anchor");
                    }
                    break;
                case 1466857630:
                    if (str2.equals("join_direct")) {
                        map.put("guest_invite_type", "guest_apply_anchor");
                    }
                    break;
            }
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
            map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        map.put("connection_type", "guest");
        String str4 = "off";
        if (!z) {
            str3 = "off";
        } else if (z2) {
            str3 = "rear";
        } else {
            str3 = "front";
        }
        map.put("switch_to", str3);
        map.put("way_of_switch", str);
        String str5 = "1";
        if (C927560aFG.LIZIZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_mg_downgrade", obj);
        if (bool != null) {
            if (!bool.booleanValue()) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_success", str5);
        }
        C917520Zz4.LIZ(map);
        C0KX4.LIZ("livesdk_guest_camera_on_and_off", map, null, true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_name", "ttlive_multilive_guest_switch_camera");
        if (z) {
            str4 = "on";
        }
        jSONObject.put("switch", str4);
        jSONObject.put("way", str);
        C20441214yg.LJIIIZ("MultiLiveGuestSwitchCamera", C786410Ut5.J3(jSONObject));
    }

    public static void LIZLLL(int i, String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (z) {
            str4 = "on";
        } else {
            str4 = "off";
        }
        map.put("switch_to", str4);
        map.put("way_of_switch", str);
        map.put("link_id", str2);
        if (Intrinsics.LJFF(str3, "apply")) {
            str5 = "guest_apply_anchor";
        } else if (Intrinsics.LJFF(str3, "invite")) {
            str5 = "anchor_invite_guest";
        } else {
            str5 = "others";
        }
        map.put("guest_invite_type", str5);
        map.put("connection_type", "guest");
        map.put("live_room_mode", String.valueOf(i));
        C0KX4.LIZ("livesdk_guest_camera_on_and_off_save", map, null, true);
    }
}
