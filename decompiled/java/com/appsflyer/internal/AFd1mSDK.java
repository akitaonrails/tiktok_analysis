package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AFd1mSDK {
    public byte[] AFInAppEventParameterName;
    public final boolean AFInAppEventType = true;
    public Map<String, String> valueOf;
    public int values;

    public abstract String AFInAppEventParameterName();

    public abstract String AFInAppEventType(String str);

    public abstract AFe1uSDK values();

    public final boolean AFKeystoreWrapper() {
        HttpURLConnection httpURLConnection;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            URLConnection uRLConnectionINVOKEVIRTUAL_com_appsflyer_internal_AFd1mSDK_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection = INVOKEVIRTUAL_com_appsflyer_internal_AFd1mSDK_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(AFInAppEventParameterName()));
            if (uRLConnectionINVOKEVIRTUAL_com_appsflyer_internal_AFd1mSDK_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionINVOKEVIRTUAL_com_appsflyer_internal_AFd1mSDK_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection;
            try {
                boolean zAFInAppEventType = AFInAppEventType(httpURLConnection, jCurrentTimeMillis);
                httpURLConnection.disconnect();
                return zAFInAppEventType;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    StringBuilder sb = new StringBuilder("HTTP: [");
                    sb.append(httpURLConnection != null ? httpURLConnection.hashCode() : 0);
                    sb.append("] ");
                    sb.append(str);
                    String strAFInAppEventType = AFInAppEventType(sb.toString());
                    if (!AFInAppEventType()) {
                        AFLogger.afVerboseLog(strAFInAppEventType);
                    }
                    if (httpURLConnection == null) {
                        return false;
                    }
                    httpURLConnection.disconnect();
                    return false;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    public boolean AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_AFd1mSDK_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        return C2204961BRm.e0(url, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bFsZeleyw==", new String[]{"01c45"}));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0166  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x014b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AFInAppEventType(java.net.HttpURLConnection r14, long r15) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.AFInAppEventType(java.net.HttpURLConnection, long):boolean");
    }

    public AFd1mSDK(byte[] bArr, Map<String, String> map, int i) {
        this.AFInAppEventParameterName = bArr;
        this.valueOf = map;
        this.values = i;
    }
}
