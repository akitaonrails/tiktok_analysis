package X;

import com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionDto;
import com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionNextDto;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0op0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487880op0 {
    public static Map LIZ(Map map) {
        List list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof List) && (list = (List) value) != null) {
                linkedHashMap.put(entry.getKey(), LIZIZ(list));
            }
        }
        return linkedHashMap;
    }

    public static List LIZIZ(List list) {
        Object ecommerceActionDto;
        EcommerceActionNextDto ecommerceActionNextDto;
        String str;
        String str2;
        String str3;
        Map map;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((obj instanceof Map) || (obj instanceof EcommerceActionDto)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (Object obj2 : arrayList) {
            String str4 = null;
            if (obj2 instanceof Map) {
                Map map2 = (Map) obj2;
                Object obj3 = map2.get("next");
                if ((obj3 instanceof Map) && (map = (Map) obj3) != null) {
                    ecommerceActionNextDto = new EcommerceActionNextDto(map.get("success"), map.get("fail"));
                } else {
                    ecommerceActionNextDto = null;
                }
                Object obj4 = map2.get("name");
                if (obj4 instanceof String) {
                    str = (String) obj4;
                } else {
                    str = null;
                }
                Object obj5 = map2.get("enable");
                if (obj5 instanceof String) {
                    str2 = (String) obj5;
                } else {
                    str2 = null;
                }
                Object obj6 = map2.get("params");
                if (obj6 instanceof String) {
                    str3 = (String) obj6;
                } else {
                    str3 = null;
                }
                Object obj7 = map2.get("return_key");
                if (obj7 instanceof String) {
                    str4 = (String) obj7;
                }
                ecommerceActionDto = new EcommerceActionDto(str, str2, str3, str4, ecommerceActionNextDto);
            } else if ((obj2 instanceof EcommerceActionDto) && obj2 != null) {
                ecommerceActionDto = obj2;
            } else {
                ecommerceActionDto = new EcommerceActionDto(null, null, null, null, null);
            }
            arrayList2.add(ecommerceActionDto);
        }
        return arrayList2;
    }
}
