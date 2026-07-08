package com.appsflyer.internal;

import X.C0WZX;
import X.C2097608Jq;
import X.C2204961BRm;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFf1kSDK;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1kSDK extends AFf1nSDK<AFc1pSDK> {
    public final CountDownLatch afDebugLog;
    public final List<AFi1hSDK> afErrorLog;
    public final AFd1sSDK afInfoLog;
    public int afRDLog;
    public int afVerboseLog;
    public int afWarnLog;
    public final AFi1aSDK force;
    public final AFh1wSDK i;
    public final AFc1jSDK unregisterClient;
    public final AFd1pSDK v;
    public final AFc1vSDK w;

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] valueOf;
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFe1bSDK.values().length];
            iArr[AFe1bSDK.SUCCESS.ordinal()] = 1;
            iArr[AFe1bSDK.FAILURE.ordinal()] = 2;
            valueOf = iArr;
            int[] iArr2 = new int[AFi1hSDK.AFa1ySDK.values().length];
            iArr2[AFi1hSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            iArr2[AFi1hSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            values = iArr2;
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private final boolean w() {
        Object obj = this.unregisterClient.AFInAppEventParameterName().get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.afRDLog && !this.unregisterClient.AFInAppEventParameterName().containsKey("referrers");
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return this.w.registerClient;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0171: IGET (r3 I:com.appsflyer.internal.AFh1wSDK) = (r0 I:com.appsflyer.internal.AFf1kSDK) (LINE:369) com.appsflyer.internal.AFf1kSDK.i com.appsflyer.internal.AFh1wSDK, block:B:49:0x015e */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x019b: IGET (r3 I:com.appsflyer.internal.AFh1wSDK) = (r0 I:com.appsflyer.internal.AFf1kSDK) (LINE:411) com.appsflyer.internal.AFf1kSDK.i com.appsflyer.internal.AFh1wSDK, block:B:51:0x0180 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x01bf: IGET (r2 I:int) = (r0 I:com.appsflyer.internal.AFf1kSDK) (LINE:447) com.appsflyer.internal.AFf1kSDK.afWarnLog int, block:B:53:0x01aa */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.appsflyer.internal.AFf1kSDK] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.appsflyer.internal.AFf1kSDK] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.appsflyer.internal.AFf1kSDK] */
    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        ?? r0;
        ?? r02;
        ?? r03;
        int i;
        AFe1bSDK aFe1bSDKAFKeystoreWrapper = AFe1bSDK.FAILURE;
        try {
            aFe1bSDKAFKeystoreWrapper = super.AFKeystoreWrapper();
            AFh1wSDK aFh1wSDK = this.i;
            int i2 = this.afWarnLog;
            if (i2 <= 0 || i2 > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i2))));
            } else {
                int i3 = i2 - 1;
                aFh1wSDK.AFLogger[i3] = System.currentTimeMillis();
                long j = aFh1wSDK.e[i3];
                if (j != 0) {
                    long[] jArr = aFh1wSDK.d;
                    jArr[i3] = aFh1wSDK.AFLogger[i3] - j;
                    aFh1wSDK.valueOf.put("net", jArr);
                    aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("ddl", C786410Ut5.J3(new JSONObject(aFh1wSDK.valueOf)));
                }
            }
            i = AFa1tSDK.valueOf[aFe1bSDKAFKeystoreWrapper.ordinal()];
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Throwable cause = e.getCause();
            if ((cause instanceof InterruptedException) || (cause instanceof InterruptedIOException)) {
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + r0.afWarnLog + " attempt(s) within " + r0.w.registerClient + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                r0.i.AFInAppEventParameterName(deepLinkResult, r0.w.registerClient);
                r0.w.values(deepLinkResult);
                return AFe1bSDK.TIMEOUT;
            }
            if (!(cause instanceof IOException)) {
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Unexpected Exception: ".concat(String.valueOf(e)), false, 4, null);
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                r02.i.AFInAppEventParameterName(deepLinkResult2, r02.w.registerClient);
                r02.w.values(deepLinkResult2);
                return aFe1bSDKAFKeystoreWrapper;
            }
            AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
            DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
            r03.i.AFInAppEventParameterName(deepLinkResult3, r03.w.registerClient);
            r03.w.values(deepLinkResult3);
        }
        if (i != 1) {
            if (i == 2) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
                StringBuilder sb = new StringBuilder("Error occurred. Server response code = ");
                ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
                sb.append(responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null);
                AFg1fSDK.d$default(aFLogger, aFg1aSDK, sb.toString(), false, 4, null);
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.i.AFInAppEventParameterName(deepLinkResult4, this.w.registerClient);
                this.w.values(deepLinkResult4);
                return aFe1bSDKAFKeystoreWrapper;
            }
            return aFe1bSDKAFKeystoreWrapper;
        }
        AFc1pSDK aFc1pSDK = (AFc1pSDK) ((AFf1nSDK) this).registerClient.getBody();
        DeepLink deepLink = aFc1pSDK.AFInAppEventType;
        if (deepLink != null) {
            DeepLinkResult deepLinkResult5 = new DeepLinkResult(deepLink, null);
            this.i.AFInAppEventParameterName(deepLinkResult5, this.w.registerClient);
            this.w.values(deepLinkResult5);
            return aFe1bSDKAFKeystoreWrapper;
        }
        if (this.afWarnLog > 1 || !aFc1pSDK.valueOf() || !w()) {
            DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, null);
            this.i.AFInAppEventParameterName(deepLinkResult6, this.w.registerClient);
            this.w.values(deepLinkResult6);
            return aFe1bSDKAFKeystoreWrapper;
        }
        AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Waiting for referrers...", false, 4, null);
        this.afDebugLog.await();
        AFh1wSDK aFh1wSDK2 = this.i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = aFh1wSDK2.AFLogger[0];
        if (j2 != 0) {
            aFh1wSDK2.valueOf.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j2));
            aFh1wSDK2.AFInAppEventParameterName.AFInAppEventParameterName("ddl", C786410Ut5.J3(new JSONObject(aFh1wSDK2.valueOf)));
        }
        if (this.afVerboseLog != this.afRDLog) {
            return AFKeystoreWrapper();
        }
        DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, null);
        this.i.AFInAppEventParameterName(deepLinkResult7, this.w.registerClient);
        this.w.values(deepLinkResult7);
        return AFe1bSDK.SUCCESS;
    }

    private final void AFInAppEventParameterName(AFi1hSDK aFi1hSDK) {
        if (AFKeystoreWrapper(aFi1hSDK)) {
            this.afErrorLog.add(aFi1hSDK);
            this.afDebugLog.countDown();
            AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Added non-organic ".concat(aFi1hSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i = this.afVerboseLog + 1;
            this.afVerboseLog = i;
            if (i == this.afRDLog) {
                this.afDebugLog.countDown();
            }
        }
    }

    public static Map<String, String> valueOf(AFb1zSDK aFb1zSDK) {
        String str;
        if (aFb1zSDK != null && (str = aFb1zSDK.AFInAppEventParameterName) != null) {
            Boolean bool = aFb1zSDK.AFKeystoreWrapper;
            if (bool == null || !bool.booleanValue()) {
                return C2097608Jq.LJIIIIZZ(new Pair("type", "unhashed"), new Pair("value", str));
            }
            return null;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<AFc1pSDK> AFKeystoreWrapper(String str) {
        boolean z;
        AFb1zSDK aFb1zSDK;
        String[] strArr;
        this.afWarnLog++;
        AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Preparing request " + this.afWarnLog, false, 4, null);
        Map<String, Object> mapAFInAppEventParameterName = this.unregisterClient.AFInAppEventParameterName();
        if (this.afWarnLog == 1) {
            if (this.afInfoLog.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) == 0) {
                z = true;
            } else {
                z = false;
            }
            mapAFInAppEventParameterName.put("is_first", Boolean.valueOf(z));
            mapAFInAppEventParameterName.put("lang", C786410Ut5.t2(Locale.getDefault()) + '-' + C2204961BRm.g0(Locale.getDefault(), new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bNsY+leyw==", new String[]{"01c45"})));
            mapAFInAppEventParameterName.put("os", Build.VERSION.RELEASE);
            mapAFInAppEventParameterName.put("type", Build.MODEL);
            AFd1sSDK aFd1sSDK = this.afInfoLog;
            mapAFInAppEventParameterName.put("request_id", AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper));
            AFd1wSDK aFd1wSDK = this.v.AFKeystoreWrapper;
            if (aFd1wSDK != null && (strArr = aFd1wSDK.AFInAppEventType) != null) {
                mapAFInAppEventParameterName.put("sharing_filter", strArr);
            }
            AFh1uSDK aFh1uSDK = this.afInfoLog.AFInAppEventType.AFLogger;
            if (aFh1uSDK != null) {
                aFb1zSDK = new AFb1zSDK(aFh1uSDK.AFKeystoreWrapper, aFh1uSDK.AFInAppEventParameterName);
            } else {
                aFb1zSDK = null;
            }
            Map<String, String> mapValueOf = valueOf(aFb1zSDK);
            if (mapValueOf != null) {
                mapAFInAppEventParameterName.put("gaid", mapValueOf);
            }
            Map<String, String> mapValueOf2 = valueOf(AFb1rSDK.AFInAppEventType(this.afInfoLog.valueOf.AFKeystoreWrapper));
            if (mapValueOf2 != null) {
                mapAFInAppEventParameterName.put("oaid", mapValueOf2);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        mapAFInAppEventParameterName.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        mapAFInAppEventParameterName.put("request_count", Integer.valueOf(this.afWarnLog));
        List<AFi1hSDK> list = this.afErrorLog;
        ArrayList arrayList = new ArrayList();
        for (AFi1hSDK aFi1hSDK : list) {
            if (aFi1hSDK.unregisterClient == AFi1hSDK.AFa1ySDK.FINISHED) {
                Object obj = aFi1hSDK.AFInAppEventParameterName.get("referrer");
                if ((obj instanceof String) && obj != null) {
                    Pair[] pairArr = new Pair[2];
                    Object obj2 = aFi1hSDK.AFInAppEventParameterName.get("source");
                    if (obj2 != null) {
                        pairArr[0] = new Pair("source", obj2);
                        pairArr[1] = new Pair("value", obj);
                        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                        if (mapLJIIIIZZ != null) {
                            arrayList.add(mapLJIIIIZZ);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            mapAFInAppEventParameterName.put("referrers", arrayList);
        }
        AFc1jSDK aFc1jSDK = this.unregisterClient;
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.afInfoLog, null, 2, null);
        String str2 = ((AFf1nSDK) this).d.AFLogger;
        Object obj3 = this.unregisterClient.AFInAppEventParameterName().get("timestamp");
        if (obj3 != null) {
            String str3 = (String) obj3;
            String packageName = aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName();
            String strD = aFj1xSDK.AFInAppEventType.d();
            if (strD == null || (!a0.LJJJIL(strD) && (strD = "-".concat(String.valueOf(a0.LJLIIIL(strD).toString()))) == null)) {
                strD = "";
            }
            String string = a0.LJLIIIL(strD).toString();
            Uri.Builder builderAppendPath = UriProtector.parse(aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + string);
            AFj1xSDK.AFInAppEventParameterName(builderAppendPath, str2, str3);
            aFc1jSDK.valueOf(builderAppendPath.appendQueryParameter("sdk_version", AFb1vSDK.AFInAppEventParameterName).build().toString());
            AFh1wSDK aFh1wSDK = this.i;
            int i = this.afWarnLog;
            if (i > 0 && i <= 2) {
                int i2 = i - 1;
                aFh1wSDK.e[i2] = System.currentTimeMillis();
                if (i2 == 0) {
                    long j = aFh1wSDK.unregisterClient;
                    if (j != 0) {
                        aFh1wSDK.valueOf.put("from_fg", Long.valueOf(aFh1wSDK.e[i2] - j));
                        aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("ddl", C786410Ut5.J3(new JSONObject(aFh1wSDK.valueOf)));
                    }
                }
            } else {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            }
            return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public static boolean AFKeystoreWrapper(AFi1hSDK aFi1hSDK) {
        Long l;
        Object obj = aFi1hSDK.AFInAppEventParameterName.get("click_ts");
        if (obj instanceof Long) {
            l = (Long) obj;
        } else {
            l = null;
        }
        if (l != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    public AFf1kSDK(AFc1jSDK aFc1jSDK, AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.DLSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, "DdlSdk");
        this.unregisterClient = aFc1jSDK;
        this.afDebugLog = new CountDownLatch(1);
        this.afErrorLog = new ArrayList();
        this.afInfoLog = aFd1kSDK.AFInAppEventType();
        this.v = aFd1kSDK.getLevel();
        this.w = aFd1kSDK.afRDLog();
        this.i = aFd1kSDK.AFLogger();
        AFi1aSDK aFi1aSDKForce = aFd1kSDK.force();
        this.force = aFi1aSDKForce;
        AFi1hSDK[] aFi1hSDKArrAFKeystoreWrapper = aFi1aSDKForce.AFKeystoreWrapper();
        ArrayList<AFi1hSDK> arrayList = new ArrayList();
        for (AFi1hSDK aFi1hSDK : aFi1hSDKArrAFKeystoreWrapper) {
            if (aFi1hSDK != null && aFi1hSDK.unregisterClient != AFi1hSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFi1hSDK);
            }
        }
        this.afRDLog = arrayList.size();
        for (final AFi1hSDK aFi1hSDK2 : arrayList) {
            AFi1hSDK.AFa1ySDK aFa1ySDK = aFi1hSDK2.unregisterClient;
            if (aFa1ySDK != null) {
                int i = AFa1tSDK.values[aFa1ySDK.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        aFi1hSDK2.addObserver(new Observer() { // from class: X.13lD
                            @Override // java.util.Observer
                            public final void update(Observable observable, Object obj) {
                                AFf1kSDK.AFInAppEventType(aFi1hSDK2, this, observable, obj);
                            }
                        });
                    }
                } else {
                    AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, aFi1hSDK2.AFInAppEventParameterName.get("source") + " referrer collected earlier", false, 4, null);
                    AFInAppEventParameterName(aFi1hSDK2);
                }
            }
        }
    }

    public static final void AFInAppEventType(AFi1hSDK aFi1hSDK, AFf1kSDK aFf1kSDK, Observable observable, Object obj) {
        AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, aFi1hSDK.AFInAppEventParameterName.get("source") + " referrer collected via observer", false, 4, null);
        if (observable != null) {
            aFf1kSDK.AFInAppEventParameterName((AFi1hSDK) observable);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.referrer.Referrer");
    }
}
