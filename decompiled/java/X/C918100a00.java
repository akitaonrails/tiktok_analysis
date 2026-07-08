package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0a00, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918100a00 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, EnumC930180aJU enumC930180aJU, String str2) {
        if (enumC930180aJU != EnumC930180aJU.TURN_ON && enumC930180aJU != EnumC930180aJU.TURN_OFF) {
            return;
        }
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (str2 != null) {
            map.put("enter_from", str2);
        }
        map.put("connection_type", "guest");
        map.put("switch_to", str);
        C0KX4.LIZ("livesdk_layoutsettings_fixed_number_of_windows", map, null, true);
    }
}
