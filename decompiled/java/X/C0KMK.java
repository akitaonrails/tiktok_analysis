package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KMK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KMK {
    public static final C0KMK LIZ = new C0KMK();
    public static final Map<String, List<C0KML>> LIZIZ = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    public static C0KML LIZIZ(Integer num, String str) {
        T next;
        C259800zU c259800zU = new C259800zU();
        Iterator it2 = ((LinkedHashMap) LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    C0KML c0kml = (C0KML) next;
                    if (Intrinsics.LJFF(c0kml.LIZ, str)) {
                        int i = c0kml.LIZIZ;
                        if (num == null || i != num.intValue()) {
                        }
                    }
                } else {
                    next = 0;
                    break;
                }
            }
            c259800zU.element = next;
        }
        return (C0KML) c259800zU.element;
    }

    public static void LIZJ(String str, Integer num, C0KMJ c0kmj) {
        C0KML c0kmlLIZIZ = LIZIZ(num, str);
        if (c0kmlLIZIZ != null && c0kmlLIZIZ.LIZJ != C0KMJ.QUERY_ORDER_SUCCEED) {
            if (c0kmj == C0KMJ.IAP_FAIL || c0kmj == C0KMJ.IAP_SUCCEED) {
                c0kmlLIZIZ.LIZLLL = c0kmj;
            }
            c0kmlLIZIZ.LIZJ = c0kmj;
        }
    }

    public static void LIZ(String str, Integer num, String str2, boolean z) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C0KML c0kml = new C0KML(iIntValue, str2);
        C0KMJ c0kmj = C0KMJ.CREATED;
        if (c0kml.LIZJ != C0KMJ.QUERY_ORDER_SUCCEED) {
            if (c0kmj == C0KMJ.IAP_FAIL || c0kmj == C0KMJ.IAP_SUCCEED) {
                c0kml.LIZLLL = c0kmj;
            }
            c0kml.LIZJ = c0kmj;
        }
        Map<String, List<C0KML>> map = LIZIZ;
        if (map.containsKey(str)) {
            List list = (List) ((LinkedHashMap) map).get(str);
            if (list != null) {
                list.add(c0kml);
                return;
            }
            return;
        }
        map.put(str, C1697810uHb.LJIILJJIL(c0kml));
    }
}
