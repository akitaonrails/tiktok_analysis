package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0a3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920390a3h {
    public static void LIZ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("user_type", "user");
        map.put("msg_content", str);
        map.put("msg_id", "ttlive_multiRequestSettings_viewerScreen_requestFailedToast");
        map.put("extra", "guest_apply_multi_grey_button");
        C0KX4.LIZ("livesdk_toast_msg_show", map, null, true);
    }
}
