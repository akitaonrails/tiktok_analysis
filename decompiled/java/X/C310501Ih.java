package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.01Ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C310501Ih {
    public static int LIZ;
    public static int LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;

    public static void LIZ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", "click");
        map.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        if (str != null) {
            map.put("banner_type", str);
        }
        C0KX4.LIZ("livesdk_multi_countdown_banner", map, null, true);
    }

    public static void LIZJ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        map.put("layout_id", C917520Zz4.LIZJ());
        map.put("is_grey", CardStruct.IStatusCode.DEFAULT);
        map.put("is_multi_guest_moderator", CardStruct.IStatusCode.DEFAULT);
        C0KX4.LIZ("livesdk_multi_anchor_countdown_all_entrance", map, null, true);
    }

    public static void LIZLLL(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("page_name", str);
        C0KX4.LIZ("livesdk_multi_anchor_countdown_all_page_show", map, null, true);
    }

    public static void LIZIZ(long j, long j2, long j3) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("duration", String.valueOf(j));
        map.put("countdown_target", String.valueOf(j2));
        map.put("countdown_score", String.valueOf(j3));
        C0KX4.LIZ("livesdk_multi_guest_countdown_connection_over", map, null, true);
        LIZJ = 0L;
    }

    public static void LJ(Boolean bool, String str, String str2) {
        String str3;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        map.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        if (str2 != null) {
            map.put("to_user_id", str2);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_finish_target", str3);
        }
        C0KX4.LIZ("livesdk_multi_countdown_panel", map, null, true);
    }
}
