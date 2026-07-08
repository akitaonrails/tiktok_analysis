package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0a2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919870a2r {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(User user) {
        String string;
        Long lValueOf;
        FollowInfo followInfo;
        HashMap map = new HashMap();
        if (user == null || (string = Long.valueOf(user.getId()).toString()) == null) {
            string = "";
        }
        map.put("guest_id", string);
        if (user != null && (followInfo = user.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        } else {
            lValueOf = null;
        }
        map.put("anchor_relationship", String.valueOf(lValueOf));
        map.put("connected_guest_cnt", String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
        C917520Zz4.LIZ(map);
        C01Z4.LIZ(null, map);
        C0KX4.LIZ("livesdk_anchor_canceled_enlarge_guest_screen", map, null, true);
    }

    public static void LIZIZ(int i, String str) {
        HashMap map = new HashMap();
        map.put("change_type", str);
        map.put("enlarge_type", String.valueOf(i));
        map.put("connected_guest_cnt", String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
        C917520Zz4.LIZ(map);
        C01Z4.LIZ(null, map);
        C0KX4.LIZ("livesdk_anchor_change_anchor_screen_success", map, null, true);
    }

    public static void LIZJ(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put("guest_id", str);
        map.put("change_type", str2);
        map.put("enlarge_type", String.valueOf(i));
        map.put("connected_guest_cnt", String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
        C917520Zz4.LIZ(map);
        C01Z4.LIZ(null, map);
        C0KX4.LIZ("livesdk_anchor_change_guest_screen_success", map, null, true);
    }

    public static void LIZLLL(int i, String str, String str2, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        map.put("anchor_id", str);
        if (str5 != null) {
            map.put("request_page", str5);
        }
        map.put("guest_id", str2);
        map.put("enlarge_type", String.valueOf(i));
        map.put("connected_guest_cnt", String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
        C917520Zz4.LIZ(map);
        C01Z4.LIZ(null, map);
        map.put("action_type", str3);
        map.put("to_user_type", str4);
        C404301hh.LIZ(map);
        C0KX4.LIZ("livesdk_anchor_enlarge_guest_screen_icon", map, null, true);
    }
}
