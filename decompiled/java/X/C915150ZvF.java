package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0ZvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915150ZvF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        if (str2 != null) {
            map.put("wont_show_again", str2);
        }
        C0KX4.LIZ("livesdk_send_gift_all_confirm_popup", map, null, true);
    }
}
