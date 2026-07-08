package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class AFe1tSDK implements AFe1iSDK<Map<String, Object>> {
    public static Map<String, Object> values(String str) {
        Object obj;
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObject.isNull(next)) {
                    obj = null;
                } else {
                    obj = jSONObject.get(next);
                }
                map.put(next, obj);
            }
            map.remove("is_cache");
            return map;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", e);
            HashMap map2 = new HashMap();
            map2.put("string_response", str);
            return map2;
        }
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    public final /* synthetic */ Map<String, Object> AFInAppEventType(String str) {
        return values(str);
    }
}
