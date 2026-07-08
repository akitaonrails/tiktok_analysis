package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0KLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516050KLr {
    public static final C516050KLr LIZ = new C516050KLr();
    public static final Map<String, List<C0KM2>> LIZIZ = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    public static C0KM2 LIZIZ(Integer num, String str) {
        T next;
        C259800zU c259800zU = new C259800zU();
        Iterator it2 = ((LinkedHashMap) LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    C0KM2 c0km2 = (C0KM2) next;
                    if (Intrinsics.LJFF(c0km2.LIZ, str)) {
                        int i = c0km2.LIZIZ;
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
        return (C0KM2) c259800zU.element;
    }

    public static void LIZJ(String str, Integer num, C0KM4 c0km4) {
        C0KM2 c0km2LIZIZ = LIZIZ(num, str);
        if (c0km2LIZIZ != null && c0km2LIZIZ.LIZJ != C0KM4.QUERY_ORDER_SUCCEED) {
            if (c0km4 == C0KM4.IAP_FAIL || c0km4 == C0KM4.IAP_SUCCEED) {
                c0km2LIZIZ.LIZLLL = c0km4;
            }
            c0km2LIZIZ.LIZJ = c0km4;
        }
    }

    public static void LIZ(String str, Integer num, String str2, boolean z) {
        int iIntValue;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (str != null) {
            if (a0.LJJJIL(str)) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            str3 = str;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C0KM2 c0km2 = new C0KM2(iIntValue, str2);
        C0KM4 c0km4 = C0KM4.CREATED;
        if (c0km2.LIZJ != C0KM4.QUERY_ORDER_SUCCEED) {
            if (c0km4 == C0KM4.IAP_FAIL || c0km4 == C0KM4.IAP_SUCCEED) {
                c0km2.LIZLLL = c0km4;
            }
            c0km2.LIZJ = c0km4;
        }
        Map<String, List<C0KM2>> map = LIZIZ;
        if (map.containsKey(str3)) {
            List list = (List) ((LinkedHashMap) map).get(str3);
            if (list != null) {
                list.add(c0km2);
                return;
            }
            return;
        }
        map.put(str3, C1697810uHb.LJIILJJIL(c0km2));
    }
}
