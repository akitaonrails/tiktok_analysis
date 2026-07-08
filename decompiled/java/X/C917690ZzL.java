package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0ZzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917690ZzL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, boolean z, String str, long j) {
        InterfaceC921620a5g interfaceC921620a5g;
        String strLIZIZ;
        String str2;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (objLJIIIZ instanceof InterfaceC302401Fe) {
            interfaceC921620a5g = (InterfaceC921620a5g) objLJIIIZ;
        } else {
            interfaceC921620a5g = null;
        }
        map.put("guest_id", String.valueOf(j));
        Object obj = "null";
        if (interfaceC921620a5g == null || (strLIZIZ = interfaceC921620a5g.LIZIZ(j)) == null) {
            strLIZIZ = "null";
        }
        map.put("guest_invite_type", strLIZIZ);
        String str3 = "off";
        if (i != 0) {
            if (i != 1) {
                str2 = "off";
            } else {
                str2 = "on";
            }
        } else {
            str2 = "abnormal";
        }
        map.put("to_camera_status", str2);
        if (i2 == 1) {
            str3 = "on";
        }
        map.put("to_mic_status", str3);
        map.put("link_id", str);
        Object obj2 = C917700ZzM.LIZ().get(Long.valueOf(j));
        if (obj2 != null) {
            obj = obj2;
        }
        map.put("enter_from", obj);
        if (z) {
            C0KX4.LIZ("livesdk_anchor_guest_camera_status_switch_success", map, null, true);
        } else {
            C0KX4.LIZ("livesdk_anchor_guest_mic_status_switch_success", map, null, true);
        }
    }
}
