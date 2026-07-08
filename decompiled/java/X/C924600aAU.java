package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0aAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924600aAU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        map.put("guest_id", str2);
        C0KX4.LIZ("livesdk_multi_guest_avatar_ai_icon", map, null, true);
    }

    public static void LIZIZ(long j, Room room) {
        HashMap map = new HashMap();
        C01Z4.LIZ(room, map);
        if (MultiGuestAvatarFeatureSetting.INSTANCE.hasSeeAbility()) {
            map.put("avatar_duration", String.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        } else {
            map.put("avatar_duration", CardStruct.IStatusCode.DEFAULT);
        }
        C0KX4.LIZ("livesdk_multi_audience_avatar_view_duration", map, null, true);
    }

    public static void LIZJ(String str, String str2, int i, Long l, Integer num) {
        String string;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        C924620aAW.LJIIIZ(map);
        map.put("guest_invite_type", str2);
        map.put("connection_status", String.valueOf(i));
        map.put("action_type", str);
        map.put("enter_from", C935990aSr.LIZJ());
        if (l != null) {
            map.put("style_id", String.valueOf(l.longValue()));
            if (num == null || (string = num.toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("style_position", string);
        }
        C0KX4.LIZ("livesdk_multi_guest_avatar_generate_panel", map, null, true);
    }

    public static void LIZLLL(int i, String str, String str2, long j, String str3) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        C924620aAW.LJIIIZ(map);
        map.put("guest_invite_type", str2);
        map.put("generate_status", str);
        map.put("enter_from", C935990aSr.LIZJ());
        map.put("style_id", String.valueOf(j));
        map.put("style_position", String.valueOf(i));
        if (str3 != null) {
            map.put("error_code", str3);
        }
        C0KX4.LIZ("livesdk_multi_guest_avatar_generate", map, null, true);
    }
}
