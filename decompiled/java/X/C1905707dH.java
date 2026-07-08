package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.07dH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1905707dH {
    public static void LIZ(String str, Map map) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ(str, linkedHashMap);
    }
}
