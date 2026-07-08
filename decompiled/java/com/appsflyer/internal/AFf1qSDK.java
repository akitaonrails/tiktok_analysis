package com.appsflyer.internal;

import X.C2097608Jq;
import X.C259800zU;
import X.C822650WOx;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1qSDK extends AFe1dSDK<Unit> {
    public final String AFLogger;
    public final AFd1lSDK d;
    public final AFg1wSDK e;
    public final AFg1mSDK registerClient;
    public final AFd1sSDK unregisterClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1bSDK] */
    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        MeasurementManager measurementManager;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = AFe1bSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.d.AFKeystoreWrapper;
            if (context != null && (measurementManager = (MeasurementManager) context.getSystemService(MeasurementManager.class)) != null) {
                new AFj1xSDK(this.unregisterClient, null, 2, null);
                Uri.Builder builderBuildUpon = UriProtector.parse(AFj1xSDK.valueOf()).buildUpon();
                Context context2 = this.unregisterClient.valueOf.AFKeystoreWrapper;
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_name", this.AFLogger), new Pair("app_id", this.unregisterClient.valueOf.AFKeystoreWrapper.getPackageName()), new Pair("app_version", AFb1uSDK.AFInAppEventType(context2, context2.getPackageName())), new Pair("sdk_version", AFd1sSDK.AFInAppEventType()), new Pair("api_version", AFd1sSDK.values()), new Pair("timestamp", String.valueOf(this.registerClient.AFInAppEventType())), new Pair("request_id", AFd1sSDK.valueOf()));
                AFd1sSDK aFd1sSDK = this.unregisterClient;
                String strValueOf = AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper);
                if (strValueOf != null) {
                    mapLJIIJ.put("appsflyer_id", strValueOf);
                }
                Long lAFInAppEventParameterName = this.registerClient.AFInAppEventParameterName();
                if (lAFInAppEventParameterName != null) {
                    mapLJIIJ.put("install_time", String.valueOf(lAFInAppEventParameterName.longValue()));
                }
                for (Map.Entry entry : ((LinkedHashMap) mapLJIIJ).entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                measurementManager.registerTrigger(builderBuildUpon.build(), new C822650WOx(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue()), new AFa1tSDK(c259800zU, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            valueOf(th);
        }
        return (AFe1bSDK) c259800zU.element;
    }

    public final class AFa1tSDK implements OutcomeReceiver<Object, Exception> {
        public /* synthetic */ C259800zU<AFe1bSDK> AFInAppEventParameterName;
        public /* synthetic */ CountDownLatch valueOf;
        public /* synthetic */ AFf1qSDK values;

        @Override // android.os.OutcomeReceiver
        public final /* synthetic */ void onError(Throwable th) {
            AFf1qSDK.valueOf(th);
            this.valueOf.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1bSDK] */
        @Override // android.os.OutcomeReceiver
        public final void onResult(Object obj) {
            this.AFInAppEventParameterName.element = AFe1bSDK.SUCCESS;
            this.valueOf.countDown();
        }

        public AFa1tSDK(C259800zU<AFe1bSDK> c259800zU, CountDownLatch countDownLatch, AFf1qSDK aFf1qSDK) {
            this.AFInAppEventParameterName = c259800zU;
            this.valueOf = countDownLatch;
            this.values = aFf1qSDK;
        }
    }

    public static void valueOf(Throwable th) {
        AFLogger.INSTANCE.e(AFg1aSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, true, true);
    }

    public AFf1qSDK(AFd1kSDK aFd1kSDK, String str) {
        super(AFf1zSDK.REGISTER_TRIGGER, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.CONVERSION}, "RegisterTrigger");
        this.AFLogger = str;
        this.unregisterClient = aFd1kSDK.AFInAppEventType();
        this.d = aFd1kSDK.w();
        this.registerClient = aFd1kSDK.e();
        this.e = aFd1kSDK.i();
    }
}
