package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.01y1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C505501y1 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Map map, Map map2) {
        String string;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
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
        C1CC2.LIZLLL(str, map, map2, linkedHashMap);
    }
}
