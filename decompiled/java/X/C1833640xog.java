package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0xog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833640xog {
    public static final C1833640xog LIZ = new C1833640xog();

    public static void LIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        if (str2 != null) {
            linkedHashMap.put("click_type", str2);
        }
        C20684815ws.LJIILLIIL("livesdk_highlight_record_setting_popup", linkedHashMap);
    }

    public static void LIZJ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("icon_status", str);
        linkedHashMap.put("click_type", str2);
        C20684815ws.LJIILLIIL("livesdk_anchor_highlight_record_click", linkedHashMap);
    }

    public static void LIZLLL(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("toast_status", str);
        linkedHashMap.put("enter_from", str2);
        C20684815ws.LJIILLIIL("livesdk_highlight_record_result", linkedHashMap);
    }

    public static void LIZIZ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        if (str2 != null) {
            linkedHashMap.put("click_type", str2);
        }
        linkedHashMap.put("pop_reason", str3);
        C20684815ws.LJIILLIIL("livesdk_highlight_record_reminder_popup", linkedHashMap);
    }
}
