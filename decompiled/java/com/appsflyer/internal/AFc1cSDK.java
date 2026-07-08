package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFc1cSDK {
    public final Map<String, Object> AFInAppEventParameterName = new HashMap();
    public Map<String, Object> values = new HashMap();

    public final void values(Map<String, Object> map) {
        if (!this.AFInAppEventParameterName.isEmpty()) {
            map.put("partner_data", this.AFInAppEventParameterName);
        }
        if (!this.values.isEmpty()) {
            AFb1vSDK.AFInAppEventParameterName(map).put("partner_data", this.values);
            this.values = new HashMap();
        }
    }
}
