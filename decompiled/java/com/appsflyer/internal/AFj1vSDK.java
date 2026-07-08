package com.appsflyer.internal;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2204961BRm;
import X.C786410Ut5;
import X.RunnableC20131413po;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1vSDK;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes31.dex */
public final class AFj1vSDK implements AFi1cSDK {
    public static final BitSet AFInAppEventType;
    public final Handler AFInAppEventParameterName;
    public final Object AFKeystoreWrapper;
    public final Map<AFi1dSDK, Map<String, Object>> AFLogger;
    public final Runnable afInfoLog;
    public boolean d;
    public final Map<AFi1dSDK, AFi1dSDK> e;
    public final Runnable force;
    public final Runnable registerClient;
    public boolean unregisterClient;
    public final SensorManager valueOf;
    public final ExecutorService values;

    public static /* synthetic */ void lambda$semisugar$AFLogger$0(AFj1vSDK aFj1vSDK) {
        C1C7U.LIZ("AFj1vSDK@3a55.<init>$1L");
        aFj1vSDK.AFLogger();
        C1C7U.LIZIZ("AFj1vSDK@3a55.<init>$1L");
    }

    public static /* synthetic */ void lambda$semisugar$e$0(AFj1vSDK aFj1vSDK) {
        C1C7U.LIZ("AFj1vSDK@3a55.AFKeystoreWrapper$1L");
        aFj1vSDK.e();
        C1C7U.LIZIZ("AFj1vSDK@3a55.AFKeystoreWrapper$1L");
    }

    public static /* synthetic */ void lambda$semisugar$unregisterClient$0(AFj1vSDK aFj1vSDK) {
        C1C7U.LIZ("AFj1vSDK@3a55.AFLogger$1L");
        aFj1vSDK.unregisterClient();
        C1C7U.LIZIZ("AFj1vSDK@3a55.AFLogger$1L");
    }

    @Override // com.appsflyer.internal.AFi1cSDK
    public final synchronized void AFInAppEventParameterName() {
        C786410Ut5.LJJZZIII(this.AFInAppEventParameterName, this.afInfoLog);
    }

    static {
        BitSet bitSet = new BitSet(6);
        AFInAppEventType = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private /* synthetic */ void AFLogger() {
        synchronized (this.AFKeystoreWrapper) {
            try {
                C786410Ut5.LJJZZIII(this.AFInAppEventParameterName, new RunnableC20131413po(this));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private List<Map<String, Object>> d() {
        synchronized (this.AFKeystoreWrapper) {
            try {
                Iterator<AFi1dSDK> it2 = this.e.values().iterator();
                while (it2.hasNext()) {
                    it2.next().AFInAppEventType(this.AFLogger, true);
                }
                if (this.AFLogger.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.AFLogger.values());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private /* synthetic */ void e() {
        try {
            for (Sensor sensor : C2204961BRm.LJJLI(this.valueOf, -1, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5b9sfuleyw==", new String[]{"01c45"}))) {
                if (valueOf(C2204961BRm.LJJLIIIJLJLI(sensor, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5b9sfuleyw==", new String[]{"01c45"})))) {
                    AFi1dSDK aFi1dSDK = new AFi1dSDK(sensor, this.values);
                    if (!this.e.containsKey(aFi1dSDK)) {
                        this.e.put(aFi1dSDK, aFi1dSDK);
                    }
                    C2204961BRm.LJJLIIIIJ(this.valueOf, this.e.get(aFi1dSDK), sensor, 1, this.AFInAppEventParameterName, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5b9sfuleyw==", new String[]{"01c45"}));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.d = true;
    }

    private List<Map<String, Object>> registerClient() {
        synchronized (this.AFKeystoreWrapper) {
            try {
                if (!this.e.isEmpty() && this.d) {
                    Iterator<AFi1dSDK> it2 = this.e.values().iterator();
                    while (it2.hasNext()) {
                        it2.next().AFInAppEventType(this.AFLogger, false);
                    }
                }
                if (this.AFLogger.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.AFLogger.values());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private /* synthetic */ void unregisterClient() {
        try {
            if (!this.e.isEmpty()) {
                for (AFi1dSDK aFi1dSDK : this.e.values()) {
                    C2204961BRm.LJJLIIIJJI(this.valueOf, aFi1dSDK, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5b9sfuleyw==", new String[]{"01c45"}));
                    aFi1dSDK.AFInAppEventType(this.AFLogger, true);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.d = false;
    }

    public final void AFInAppEventType() {
        C786410Ut5.LJJZZIII(this.AFInAppEventParameterName, new RunnableC20131413po(this));
    }

    public final void AFKeystoreWrapper() {
        C786410Ut5.LJJZZIII(this.AFInAppEventParameterName, new Runnable() { // from class: X.13pn
            @Override // java.lang.Runnable
            public final void run() {
                AFj1vSDK.lambda$semisugar$e$0(this.LL);
            }
        });
    }

    @Override // com.appsflyer.internal.AFi1cSDK
    public final Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listRegisterClient = registerClient();
        if (listRegisterClient.isEmpty()) {
            List<Map<String, Object>> listD = d();
            if (!listD.isEmpty()) {
                concurrentHashMap.put("sensors", listD);
                return concurrentHashMap;
            }
        } else {
            concurrentHashMap.put("sensors", listRegisterClient);
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFi1cSDK
    public final void values() {
        C786410Ut5.LJJZZIII(this.AFInAppEventParameterName, this.afInfoLog);
        C786410Ut5.LJJZZIII(this.AFInAppEventParameterName, this.registerClient);
    }

    public static boolean valueOf(int i) {
        if (i >= 0 && AFInAppEventType.get(i)) {
            return true;
        }
        return false;
    }

    public AFj1vSDK(Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) C786410Ut5.H2(C786410Ut5.N3(context), "sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new BPEAHandler(C786410Ut5.W2(handlerThread)), executorService);
    }

    public AFj1vSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFKeystoreWrapper = new Object();
        BitSet bitSet = AFInAppEventType;
        this.e = new HashMap(bitSet.size());
        this.AFLogger = new ConcurrentHashMap(bitSet.size());
        this.registerClient = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("AFj1vSDK@3a55.<field>$1");
                com_appsflyer_internal_AFj1vSDK$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("AFj1vSDK@3a55.<field>$1");
            }

            public final void com_appsflyer_internal_AFj1vSDK$1__run$___twin___() {
                synchronized (AFj1vSDK.this.AFKeystoreWrapper) {
                    try {
                        AFj1vSDK.this.AFKeystoreWrapper();
                        C786410Ut5.LJLIIL(150L, AFj1vSDK.this.AFInAppEventParameterName, AFj1vSDK.this.force);
                        AFj1vSDK.this.unregisterClient = true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            public static void com_appsflyer_internal_AFj1vSDK$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_appsflyer_internal_AFj1vSDK$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.force = new Runnable() { // from class: X.13pm
            @Override // java.lang.Runnable
            public final void run() {
                AFj1vSDK.lambda$semisugar$AFLogger$0(this.LL);
            }
        };
        this.afInfoLog = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("AFj1vSDK@3a55.<field>$2");
                com_appsflyer_internal_AFj1vSDK$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("AFj1vSDK@3a55.<field>$2");
            }

            public final void com_appsflyer_internal_AFj1vSDK$2__run$___twin___() {
                synchronized (AFj1vSDK.this.AFKeystoreWrapper) {
                    try {
                        if (AFj1vSDK.this.unregisterClient) {
                            AFj1vSDK.this.AFInAppEventParameterName.removeCallbacks(AFj1vSDK.this.registerClient);
                            AFj1vSDK.this.AFInAppEventParameterName.removeCallbacks(AFj1vSDK.this.force);
                            AFj1vSDK.this.AFInAppEventType();
                            AFj1vSDK.this.unregisterClient = false;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            public static void com_appsflyer_internal_AFj1vSDK$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                try {
                    anonymousClass2.com_appsflyer_internal_AFj1vSDK$2__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.valueOf = sensorManager;
        this.AFInAppEventParameterName = handler;
        this.values = executorService;
    }
}
