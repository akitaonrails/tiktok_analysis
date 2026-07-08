package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.18NA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NA {
    public static final C18NA LIZ = new C18NA();
    public static final Map<String, Object> LIZIZ = new LinkedHashMap();

    public static void LIZ(Map map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get("author_id");
        if (obj != null) {
            LIZIZ.put("author_id", obj);
        }
        Object obj2 = linkedHashMap.get("creation_id");
        if (obj2 != null) {
            LIZIZ.put("creation_id", obj2);
        }
        Object obj3 = linkedHashMap.get("has_shop_anchor");
        if (obj3 != null) {
            LIZIZ.put("has_shop_anchor", obj3);
        }
        Object obj4 = linkedHashMap.get("last_has_shop_anchor");
        if (obj4 != null) {
            LIZIZ.put("last_has_shop_anchor", obj4);
        }
        Object obj5 = linkedHashMap.get("region");
        if (obj5 != null) {
            LIZIZ.put("region", obj5);
        }
    }

    public static void LIZIZ(int i, String str, boolean z, long j, Integer num, long j2) {
        int iIntValue;
        String str2;
        EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.VIDEO_ANCHOR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("duration", Long.valueOf(j));
        linkedHashMap.put("click_duration", Long.valueOf(j2));
        linkedHashMap.put("error_code", 6001);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        linkedHashMap.put("request_code", Integer.valueOf(iIntValue));
        linkedHashMap.put("type", Integer.valueOf(i));
        if (z) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        linkedHashMap.put("is_single_anchor", str2);
        if (str != null) {
            linkedHashMap.put("entrance_form", str);
        }
        C05D4.LIZIZ("rd_tiktokec_video_shopping_list_request_result", enumC1778650wNz, 1001, "diff request fail", linkedHashMap);
    }

    public static void LIZLLL(boolean z, Integer num, String str, String str2, boolean z2, Map map) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (z2) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        linkedHashMap.put("is_single_anchor", str3);
        if (map != null) {
            linkedHashMap.putAll(new LinkedHashMap(map));
        }
        if (str2 != null) {
            linkedHashMap.put("entrance_form", str2);
        }
        if (z) {
            C05D4.LIZIZ("rd_tiktokec_video_anchor_view_click_fail", EnumC1778650wNz.VIDEO_ANCHOR, num, str, linkedHashMap);
        } else {
            C05D4.LIZ(num, str, linkedHashMap);
            C1018703yb.LIZLLL("rd_tiktokec_video_anchor_view_click_fail", new AwS580S0100000_1(linkedHashMap, (Map<Integer, String>) 453));
        }
    }
}
