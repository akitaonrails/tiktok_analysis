package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00mK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1294060jmO
public final class C178200mK {
    public static final /* synthetic */ int LIZ = 0;

    public static ConcurrentHashMap LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                concurrentHashMap.put(next, jSONObject.get(next));
            }
            return concurrentHashMap;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZIZ(Map map) {
        if (map != null && (!map.isEmpty())) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return C786410Ut5.J3(jSONObject);
        }
        return null;
    }
}
