package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07dI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1905807dI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Map map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        C1713870uhV.LIZ(str, linkedHashMap);
    }
}
