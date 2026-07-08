package X;

import com.bytedance.android.livesdk.userservice.UserService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0acz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942270acz {
    public static final void LIZ(Map<String, String> map) {
        String str;
        Integer numValueOf;
        C948100amO c948100amOLIZ = C0H79.LIZ();
        String str2 = null;
        if (c948100amOLIZ != null) {
            str = c948100amOLIZ.LJ;
        } else {
            str = null;
        }
        map.put("layout_key", String.valueOf(str));
        C948100amO c948100amOLIZ2 = C0H79.LIZ();
        if (c948100amOLIZ2 != null) {
            numValueOf = Integer.valueOf(c948100amOLIZ2.LIZIZ());
        } else {
            numValueOf = null;
        }
        map.put("panel_layout_type", String.valueOf(numValueOf));
        C948100amO c948100amOLIZ3 = C0H79.LIZ();
        if (c948100amOLIZ3 != null) {
            str2 = c948100amOLIZ3.LIZLLL;
        }
        map.put("layout_id", String.valueOf(str2));
    }

    public static final void LIZJ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        LIZ(linkedHashMap);
        C0KX4.LIZ("livesdk_multi_live_take_frame_enlarge", linkedHashMap, null, true);
    }

    public static final void LIZIZ(int i, int i2, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        linkedHashMap.put("popup_type", "normal");
        linkedHashMap.put("from_guest_seat", String.valueOf(i));
        linkedHashMap.put("to_guest_seat", String.valueOf(i2));
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("click_type", str2);
        linkedHashMap.put("from_page", str3);
        LIZ(linkedHashMap);
        C0KX4.LIZ("livesdk_anchor_guest_seat_modification_popup", linkedHashMap, null, true);
    }
}
