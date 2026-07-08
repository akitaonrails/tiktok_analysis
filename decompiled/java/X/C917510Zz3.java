package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0Zz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917510Zz3 {
    public static void LIZIZ() {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        C0KX4.LIZ("livesdk_anchor_guest_kickoff_all_click_success", map, null, true);
    }

    public static void LIZ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("icon_status", str);
        C0KX4.LIZ("livesdk_anchor_guest_kickoff_all_click", map, null, true);
    }
}
