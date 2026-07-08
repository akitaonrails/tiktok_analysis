package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ghz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176010ghz {
    public final Map<String, Integer> LIZ = new LinkedHashMap();

    public static int LIZ(C1176010ghz c1176010ghz, String str) {
        if (c1176010ghz.LIZ.containsKey(str)) {
            Integer num = (Integer) ((LinkedHashMap) c1176010ghz.LIZ).get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
        int iHashCode = (int) (((double) 55000) + (((((long) str.hashCode()) & 4294967295L) / 4294967295L) * ((double) 5000)));
        while (true) {
            if (((LinkedHashMap) c1176010ghz.LIZ).containsValue(Integer.valueOf(iHashCode))) {
                iHashCode++;
                if (iHashCode > 60000) {
                    iHashCode = C538540LAe.LLJJJIL;
                }
            } else {
                c1176010ghz.LIZ.put(str, Integer.valueOf(iHashCode));
                return iHashCode;
            }
        }
    }
}
