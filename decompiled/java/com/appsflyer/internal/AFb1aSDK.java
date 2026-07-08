package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1aSDK {
    public static Map<String, String> valueOf(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                map2.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e);
            }
        }
        return map2;
    }
}
