package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0vND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739730vND {
    public static final C1739730vND LIZ = new C1739730vND();

    public static void LIZ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("subsequent_page", "mall");
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("module_name", "shop_message_relocation_notice");
        linkedHashMap.put("is_fullscreen", 0);
        linkedHashMap.put("click_area", str2);
        if (str3 != null) {
            linkedHashMap.put("mall_extra_info", str3);
        }
        C1018703yb.LIZIZ("tiktokec_module_click", linkedHashMap);
    }
}
