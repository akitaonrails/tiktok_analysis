package X;

import java.util.Map;
import java.util.SortedMap;

/* JADX INFO: renamed from: X.0QUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QUZ {
    public final C671100QUa LIZ = new C671100QUa();

    public static void LIZ(C671100QUa c671100QUa, String str, SortedMap sortedMap) {
        if (c671100QUa.LIZIZ) {
            sortedMap.put(Integer.valueOf(c671100QUa.LIZJ), c671100QUa);
        }
        for (Map.Entry<Character, C671100QUa> entry : c671100QUa.LIZ.entrySet()) {
            char cCharValue = entry.getKey().charValue();
            C671100QUa value = entry.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(cCharValue);
            LIZ(value, C2188811AlT.LIZIZ(sbLIZ), sortedMap);
        }
    }
}
