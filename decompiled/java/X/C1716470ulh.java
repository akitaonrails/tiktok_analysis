package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ulh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716470ulh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C1716550ulp.LIZ.getClass();
        C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str);
        if (c1717080umgLJFF != null) {
            linkedHashMap2.put("merchant_id", c1717080umgLJFF.LIZLLL.LIZ);
            linkedHashMap2.put("merchant_user_id", c1717080umgLJFF.LIZLLL.LIZIZ);
        }
        linkedHashMap.putAll(linkedHashMap2);
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL(str2, linkedHashMap);
    }
}
