package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0yop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872170yop {
    public static Map LIZ(C1872160yoo c1872160yoo) {
        Integer num = c1872160yoo.LIZ;
        if (num == null) {
            return null;
        }
        num.intValue();
        if (c1872160yoo.LIZLLL == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("httpCode", c1872160yoo.LIZ);
        linkedHashMap.put("response", c1872160yoo.LIZLLL);
        Integer num2 = c1872160yoo.LIZIZ;
        if (num2 != null) {
            linkedHashMap.put("clientCode", Integer.valueOf(num2.intValue()));
        }
        Map<String, ? extends Object> map = c1872160yoo.LIZJ;
        if (map != null) {
            linkedHashMap.put("header", map);
        }
        String str = c1872160yoo.LJ;
        if (str != null) {
            linkedHashMap.put("rawResponse", str);
        }
        String str2 = c1872160yoo.LJFF;
        if (str2 != null) {
            linkedHashMap.put("responseType", str2);
        }
        Map<String, Long> map2 = c1872160yoo.LJI;
        if (map2 != null) {
            linkedHashMap.put("handleTiming", map2);
        }
        linkedHashMap.put("usePiperData", Boolean.valueOf(c1872160yoo.LJII));
        return linkedHashMap;
    }
}
