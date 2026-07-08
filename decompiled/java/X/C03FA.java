package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.03FA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FA {
    public static final Set<String> LIZ = new LinkedHashSet();
    public static final LinkedHashMap<String, Object> LIZIZ = new LinkedHashMap<>();
    public static String LIZJ;
    public static String LIZLLL;

    public static String LIZ(List list) {
        if (list == null) {
            return LIZJ;
        }
        new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map<String, String> map = ((LogisticDTO) it2.next()).eventTrackInfo;
            if (map != null) {
                arrayList.add(map);
            }
        }
        if (arrayList.isEmpty()) {
            return LIZJ;
        }
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(arrayList);
        LIZJ = strLJIIIIZZ;
        return strLJIIIIZZ;
    }

    public static Map LIZIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("module_name", "pickup_point");
        return linkedHashMap;
    }

    public static String LIZJ(LogisticDTO logisticDTO, List list) {
        Map<String, String> map;
        Map<String, String> map2;
        if (logisticDTO != null && (map2 = logisticDTO.eventTrackInfo) != null && map2.containsKey("ship_from")) {
            LIZLLL = map2.get("ship_from");
            return map2.get("ship_from");
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LogisticDTO logisticDTO2 = (LogisticDTO) it2.next();
                Boolean bool = logisticDTO2.isDefault;
                if (bool != null && bool.booleanValue() && (map = logisticDTO2.eventTrackInfo) != null && map.containsKey("ship_from")) {
                    LIZLLL = map.get("ship_from");
                    return map.get("ship_from");
                }
            }
        }
        return LIZLLL;
    }

    public static void LJFF(String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", str);
        if (str2 != null) {
            linkedHashMap.put("button_type", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("is_next_day_delivery", str3);
        }
        C1018703yb.LIZIZ("tiktokec_button_show", linkedHashMap);
    }

    public static void LJIIIIZZ(String str, Float f, String str2, String str3, int i) {
        String str4 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = "next_day_delivery";
        }
        if ((i & 16) != 0) {
            str4 = "product_detail";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "logistics");
        linkedHashMap.put("actionsheet_name", str3);
        linkedHashMap.put("previous_page", str4);
        if (str != null) {
            linkedHashMap.put("enter_from_info", str);
        }
        if (f != null) {
            linkedHashMap.put("shipping_price", f);
        }
        if (str2 != null) {
            linkedHashMap.put("shipping_currency", str2);
        }
        C1018703yb.LIZIZ("tiktokec_enter_actionsheet", linkedHashMap);
    }

    public static void LJIIIZ(String str, Float f, String str2, Long l, String str3, int i) {
        String str4 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            str3 = "next_day_delivery";
        }
        if ((i & 32) != 0) {
            str4 = "product_detail";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "logistics");
        linkedHashMap.put("actionsheet_name", str3);
        linkedHashMap.put("previous_page", str4);
        if (str != null) {
            linkedHashMap.put("enter_from_info", str);
        }
        if (f != null) {
            linkedHashMap.put("shipping_price", f);
        }
        if (str2 != null) {
            linkedHashMap.put("shipping_currency", str2);
        }
        if (l != null) {
            linkedHashMap.put("stay_time", Integer.valueOf((int) l.longValue()));
        }
        C1018703yb.LIZIZ("tiktokec_stay_actionsheet", linkedHashMap);
    }

    public static void LJII(String str, String str2, String str3, Map map, String str4, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = "delivery_flag";
        }
        if ((i & 8) != 0) {
            map = C2097608Jq.LJ();
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if (C123100dR.LIZ(str4)) {
            Set<String> set = LIZ;
            if (!set.contains(str4)) {
                set.add(str4);
            } else {
                return;
            }
        }
        C1018703yb.LIZJ(str, LIZIZ, new AnonymousClass0183(str2, str3, map, z));
    }

    public static void LIZLLL(String str, String str2, Float f, String str3, String str4, String str5, String str6, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", str);
        if (str2 != null) {
            linkedHashMap.put("button_type", str2);
        }
        if (f != null) {
            linkedHashMap.put("shipping_price", f);
        }
        if (str3 != null) {
            linkedHashMap.put("shipping_currency", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("free_shipping_condition", str4);
        }
        if (str6 != null) {
            linkedHashMap.put("sub_page_name", str6);
        }
        if (str5 != null) {
            linkedHashMap.put("is_next_day_delivery", str5);
        }
        C038N.LIZ(linkedHashMap, map);
        C1018703yb.LIZIZ("tiktokec_button_click", linkedHashMap);
    }

    public static void LJI(String str, String str2, int i, Float f, String str3, String str4, Map map, String str5, String str6, Map map2, Map map3) {
        C1018703yb.LIZJ(str, LIZIZ, new C7810033g(map, str2, i, str5, f, str3, str4, str6, map2, map3));
    }
}
