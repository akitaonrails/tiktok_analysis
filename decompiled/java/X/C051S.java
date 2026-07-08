package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.051S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051S {
    public static final <K, V> JSONObject LIZ(Map<K, ? extends V> map) {
        try {
            return new JSONObject(map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static final List<Object> LIZIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                Object objLIZJ = jSONArray.get(i);
                if (objLIZJ instanceof JSONArray) {
                    objLIZJ = LIZIZ((JSONArray) objLIZJ);
                } else if (objLIZJ instanceof JSONObject) {
                    objLIZJ = LIZJ((JSONObject) objLIZJ);
                }
                arrayList.add(objLIZJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> LIZJ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object objLIZJ = jSONObject.get(next);
                if (objLIZJ instanceof JSONArray) {
                    objLIZJ = LIZIZ((JSONArray) objLIZJ);
                } else if (objLIZJ instanceof JSONObject) {
                    objLIZJ = LIZJ((JSONObject) objLIZJ);
                }
                map.put(next, objLIZJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return map;
    }
}
