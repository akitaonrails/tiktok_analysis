package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0aAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924690aAd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String[] strArr, boolean z) {
        String str2;
        boolean z2;
        String str3;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (z) {
            str2 = C920830a4P.LIZLLL;
        } else {
            str2 = C925600aC6.LIZ;
        }
        if (str2 == null) {
            str2 = "";
        }
        map.put("check_permission_scene", str2);
        map.put("popup_type", "first_popup");
        map.put("guest_permission", C917520Zz4.LJIIIIZZ(false, null));
        if (C13LQ.LJJIJIIJI("android.permission.RECORD_AUDIO", strArr) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && C13LQ.LJJIJIIJI("android.permission.CAMERA", strArr) >= 0) {
            str3 = "all";
        } else if (C13LQ.LJJIJIIJI("android.permission.CAMERA", strArr) >= 0 && C13LQ.LJJIJIIJI("android.permission.RECORD_AUDIO", strArr) < 0) {
            str3 = "video";
        } else if (C13LQ.LJJIJIIJI("android.permission.CAMERA", strArr) < 0 && C13LQ.LJJIJIIJI("android.permission.RECORD_AUDIO", strArr) >= 0) {
            str3 = "audio";
        } else {
            str3 = "none";
        }
        map.put("require_permission", str3);
        map.put("click_type", str);
        C0KX4.LIZ("livesdk_guest_sys_permission_click", map, null, true);
    }
}
