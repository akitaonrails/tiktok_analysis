package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0Zyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917300Zyi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC918790a17 enumC918790a17, boolean z, boolean z2) {
        Object obj;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("connection_type", "guest");
        map.put("trigger", enumC918790a17.getValue());
        String str = "on";
        if (z2) {
            obj = "on";
        } else {
            obj = "off";
        }
        map.put("guest_mode_status", obj);
        if (!z2 || !z) {
            str = "off";
        }
        map.put("switch_to", str);
        C0KX4.LIZ("livesdk_permissionsettings_viewer_on_and_off", map, null, true);
    }
}
