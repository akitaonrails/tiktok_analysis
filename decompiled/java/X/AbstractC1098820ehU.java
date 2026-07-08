package X;

import X.C1098000egA;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ehU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1098820ehU<T extends C1098000egA> {
    public C1098070egH LIZ;

    public static long LIZ(long j, long j2) {
        if (j == -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    public final T LIZIZ() {
        C1098070egH c1098070egH = this.LIZ;
        if (c1098070egH != null) {
            return c1098070egH;
        }
        C1098070egH c1098070egH2 = (T) new C1098000egA() { // from class: X.0egH
        };
        this.LIZ = c1098070egH2;
        return c1098070egH2;
    }

    public static void LIZJ(C1098850ehX c1098850ehX, String str, Map map, Map map2) {
        String string;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap map3 = (HashMap) map;
        map3.put("action", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_short_touch_all_in_one");
        Iterator it2 = map3.entrySet().iterator();
        while (true) {
            String string3 = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                string3 = value.toString();
            }
            c474500IjALIZ.LJJII(string3, str2);
        }
        for (Map.Entry entry2 : ((LinkedHashMap) map2).entrySet()) {
            String str3 = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 != null) {
                string2 = value2.toString();
            } else {
                string2 = null;
            }
            c474500IjALIZ.LJJII(string2, str3);
        }
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            String str4 = (String) entry3.getKey();
            Object value3 = entry3.getValue();
            if (value3 != null) {
                string = value3.toString();
            } else {
                string = null;
            }
            c474500IjALIZ.LJJII(string, str4);
        }
        c474500IjALIZ.LJJIJLIJ();
        c474500IjALIZ.LJJIJL();
        C1CC2.LIZLLL("livesdk_short_touch_all_in_one", map, map2, linkedHashMap);
    }
}
