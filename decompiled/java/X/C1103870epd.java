package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0epd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103870epd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        HashMap map = new HashMap();
        map.put("click_type", str);
        map.put("show_page", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_safety_reminder_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("click_type", str);
        map.put("unavailable_event", str2);
        if (str3 != null) {
            map.put("popup_entrance", str3);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gifting_recharge_unavailable_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put("unavailable_event", str);
        if (str2 != null) {
            map.put("popup_entrance", str2);
        }
        map.put("error_code", String.valueOf(i));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gifting_recharge_unavailable_popup_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
