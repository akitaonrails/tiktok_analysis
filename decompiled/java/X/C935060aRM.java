package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0aRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935060aRM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ() {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        C0KX4.LIZ("livesdk_anchor_guest_request_filter_setting_show", map, null, true);
    }

    public static void LIZ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("to_status", str);
        C0KX4.LIZ("livesdk_anchor_guest_request_filter_setting_click", map, null, true);
    }

    public static void LIZJ(int i, String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("threshold_cnt", String.valueOf(i));
        map.put("trigger_type", str);
        C0KX4.LIZ("livesdk_anchor_guest_request_filter_start", map, null, true);
    }

    public static void LIZLLL(int i, String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("threshold_cnt", String.valueOf(i));
        map.put("set_type", str);
        C0KX4.LIZ("livesdk_anchor_guest_request_filter_threshold_set", map, null, true);
    }
}
