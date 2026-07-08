package X;

import com.ss.android.ugc.aweme.ecommerce.action.framework.ECActionDto;
import com.ss.android.ugc.aweme.ecommerce.action.framework.ECActionNextDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.18bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21319118bt {
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, List<ECActionDto>>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();

    public static Object LIZ(Object obj) {
        if (!(obj instanceof String)) {
            if (obj instanceof List) {
                return LIZIZ((List) obj);
            }
            return null;
        }
        return obj;
    }

    public static List LIZIZ(List list) {
        ECActionNextDto eCActionNextDto;
        String str;
        String str2;
        String str3;
        Map map;
        ArrayList<Map> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Map) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (Map map2 : arrayList) {
            Object obj2 = map2.get("next");
            String str4 = null;
            if ((obj2 instanceof Map) && (map = (Map) obj2) != null) {
                eCActionNextDto = new ECActionNextDto(LIZ(map.get("success")), LIZ(map.get("fail")), LIZ(map.get("trigger")));
            } else {
                eCActionNextDto = null;
            }
            Object obj3 = map2.get("name");
            if (obj3 instanceof String) {
                str = (String) obj3;
            } else {
                str = null;
            }
            Object obj4 = map2.get("enable");
            if (obj4 instanceof String) {
                str2 = (String) obj4;
            } else {
                str2 = null;
            }
            Object obj5 = map2.get("params");
            if (obj5 instanceof String) {
                str3 = (String) obj5;
            } else {
                str3 = null;
            }
            Object obj6 = map2.get("return_key");
            if (obj6 instanceof String) {
                str4 = (String) obj6;
            }
            arrayList2.add(new ECActionDto(str, str2, str3, str4, eCActionNextDto));
        }
        return arrayList2;
    }
}
