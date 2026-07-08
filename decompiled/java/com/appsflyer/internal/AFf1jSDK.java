package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1jSDK extends AFe1dSDK<Map<String, Object>> {
    public static final int unregisterClient = (int) TimeUnit.SECONDS.toMillis(2);
    public final AFc1oSDK AFLogger;
    public Map<String, Object> d;
    public final Uri e;
    public final List<String> force;
    public final Context registerClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        Integer num;
        Object obj;
        if (!AFInAppEventParameterName(this.e.toString())) {
            AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(this.registerClient, this.AFLogger, this.e, null);
            return AFe1bSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.e.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            Map<String, Object> mapAFKeystoreWrapper = AFKeystoreWrapper(UriProtector.parse(string));
            string = (String) mapAFKeystoreWrapper.get("res");
            num = (Integer) mapAFKeystoreWrapper.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            obj = mapAFKeystoreWrapper.get("error");
            if (string == null || !AFInAppEventParameterName(string)) {
                break;
            }
            if (i < 4) {
                arrayList.add(string);
            }
            i++;
        } while (i < 5);
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(num != null ? num.intValue() : -1));
        if (obj != null) {
            map.put("error", obj);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.AFLogger) {
            try {
                this.AFLogger.AFKeystoreWrapper("af_deeplink_r", map);
                this.AFLogger.AFKeystoreWrapper("af_deeplink", this.e.toString());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(this.registerClient, this.AFLogger, string != null ? UriProtector.parse(string) : this.e, this.e);
        this.d = map;
        return AFe1bSDK.SUCCESS;
    }

    private boolean AFInAppEventParameterName(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        try {
            return this.force.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }

    public static Map<String, Object> AFKeystoreWrapper(Uri uri) {
        HashMap map = new HashMap();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_appsflyer_internal_AFf1jSDK_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(uri.toString()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = unregisterClient;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.14.0");
            int responseCode = httpURLConnection.getResponseCode();
            map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            map.put("error", th.getLocalizedMessage());
            return map;
        }
    }

    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_AFf1jSDK_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        return C2204961BRm.e0(url, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bNsYuleyw==", new String[]{"01c45"}));
    }

    public AFf1jSDK(Context context, AFc1oSDK aFc1oSDK, Uri uri, List<String> list) {
        super(AFf1zSDK.RESOLVE_ESP, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "ResolveEsp");
        this.registerClient = context;
        this.AFLogger = aFc1oSDK;
        this.e = uri;
        this.force = list;
    }
}
