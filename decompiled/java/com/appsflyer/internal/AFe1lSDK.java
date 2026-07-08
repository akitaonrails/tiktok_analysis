package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class AFe1lSDK implements AFe1iSDK<Map<String, String>> {
    @Override // com.appsflyer.internal.AFe1iSDK
    public final /* synthetic */ Map<String, String> AFInAppEventType(String str) {
        HashMap map = new HashMap();
        if (!str.trim().isEmpty()) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        }
        return map;
    }
}
