package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04zF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1277504zF {
    public static final Map<String, Map<String, Boolean>> LIZ = new LinkedHashMap();
    public static final Type LIZIZ = new TypeToken<Map<String, ? extends Boolean>>() { // from class: X.04zG
    }.getType();
    public static final Gson LIZJ = new Gson();

    public static Map LIZ(String str) {
        try {
            return (Map) LIZJ.LJIIIIZZ(str, LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZIZ(Map map) {
        Map<String, Boolean> mapLIZ;
        if (map == null) {
            return;
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null && (mapLIZ = LIZ(str2)) != null) {
                    LIZ.put(str, mapLIZ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
