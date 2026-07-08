package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0yoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1871990yoX {
    public static Map LIZ(C1872000yoY c1872000yoY) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c1872000yoY.LIZ;
        if (str != null) {
            linkedHashMap.put("url", str);
        }
        String str2 = c1872000yoY.LIZIZ;
        if (str2 != null) {
            linkedHashMap.put("uri", str2);
        }
        Map<String, ? extends Object> map = c1872000yoY.LIZJ;
        if (map != null) {
            linkedHashMap.put("response", map);
        }
        Integer num = c1872000yoY.LIZLLL;
        if (num != null) {
            linkedHashMap.put("clientCode", Integer.valueOf(num.intValue()));
        }
        return linkedHashMap;
    }
}
