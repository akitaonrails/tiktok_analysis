package X;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C162800jq {
    public static final C162800jq LIZ = new C162800jq();
    public static int LIZIZ;

    public static Map LIZ(String[] strArr) {
        long jLongValue;
        if (strArr.length == 0) {
            return null;
        }
        Map mapLIZ = C1977807ou.LIZ(true, strArr);
        if (mapLIZ.isEmpty()) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLIZ.entrySet()) {
            String str = (String) entry.getKey();
            long jLongValue2 = ((Number) entry.getValue()).longValue();
            String lowerCase = a0.LJJLJ('.', str, str).toLowerCase(Locale.ROOT);
            Long l = (Long) linkedHashMap.get(lowerCase);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            linkedHashMap.put(lowerCase, Long.valueOf(jLongValue + jLongValue2));
        }
        return linkedHashMap;
    }
}
