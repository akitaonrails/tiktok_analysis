package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0JGZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("connection_type", "guest");
        map.put("switch_to", str);
        if (str2 != null) {
            map.put("enter_from", str2);
        }
        C0KX4.LIZ("livesdk_layoutwindowsettings_switch", map, null, true);
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z, boolean z2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("connection_type", "guest");
        if (z2) {
            if (z) {
                str = "fixed";
            } else {
                str = "unfixed";
            }
        }
        map.put("switch_to", str);
        map.put("decision", str2);
        if (str3 != null) {
            map.put("enter_from", str3);
        }
        C0KX4.LIZ("livesdk_layoutwindowsettings_confirm", map, null, true);
    }
}
