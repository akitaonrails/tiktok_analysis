package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0nc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441390nc1 {
    public static final Map<String, String> LIZ = new LinkedHashMap();
    public static final Map<String, StringBuilder> LIZIZ = new LinkedHashMap();
    public static final Map<String, Integer> LIZJ = new LinkedHashMap();

    public static final void LIZ(String str, String str2) {
        int iIntValue;
        if (str != null) {
            LIZ.put(str, str2);
            Map<String, Integer> map = LIZJ;
            Integer num = (Integer) ((LinkedHashMap) map).get(str);
            if (num != null) {
                iIntValue = num.intValue() + 1;
            } else {
                iIntValue = 0;
            }
            map.put(str, Integer.valueOf(iIntValue));
            Map<String, StringBuilder> map2 = LIZIZ;
            if (map2.containsKey(str)) {
                StringBuilder sb = (StringBuilder) ((LinkedHashMap) map2).get(str);
                if (sb != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("\n ");
                    sbLIZ.append(str2);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            map2.put(str, new StringBuilder(str2));
        }
    }
}
