package com.appsflyer.internal;

import X.C1C7U;
import X.C2179971ATj;
import X.C2456309jt;
import X.C2516609tc;
import X.C786410Ut5;
import X.C820260WFs;
import android.os.Looper;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes31.dex */
public final class AFe1cSDK {
    public final ExecutorService values;
    public Executor valueOf = C786410Ut5.h4();
    public final Timer AFInAppEventType = new PthreadTimer("rnal/AFe1cSDK", true);
    public final List<AFe1fSDK> AFInAppEventParameterName = new CopyOnWriteArrayList();
    public final Set<AFf1zSDK> AFKeystoreWrapper = new CopyOnWriteArraySet();
    public final Set<AFf1zSDK> d = Collections.newSetFromMap(new ConcurrentHashMap());
    public final NavigableSet<AFe1dSDK<?>> e = new ConcurrentSkipListSet();
    public final NavigableSet<AFe1dSDK<?>> unregisterClient = new ConcurrentSkipListSet();
    public final List<AFe1dSDK<?>> AFLogger = new ArrayList();
    public final Set<AFe1dSDK<?>> registerClient = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1cSDK$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("AFe1cSDK@210e.<field>$1");
            com_appsflyer_internal_AFe1cSDK$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("AFe1cSDK@210e.<field>$1");
        }

        public final void com_appsflyer_internal_AFe1cSDK$1__run$___twin___() {
            synchronized (AFe1cSDK.this.e) {
                try {
                    final AFe1dSDK<?> aFe1dSDKPollFirst = AFe1cSDK.this.e.pollFirst();
                    if (aFe1dSDKPollFirst == null) {
                        return;
                    }
                    AFe1cSDK.this.registerClient.add(aFe1dSDKPollFirst);
                    long jAFInAppEventParameterName = aFe1dSDKPollFirst.AFInAppEventParameterName();
                    AFf1xSDK aFf1xSDK = new AFf1xSDK(C786410Ut5.u3());
                    if (jAFInAppEventParameterName > 0) {
                        AFe1cSDK.this.AFInAppEventType.schedule(aFf1xSDK, jAFInAppEventParameterName);
                    }
                    final AFe1cSDK aFe1cSDK = AFe1cSDK.this;
                    aFe1cSDK.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("AFe1cSDK@210e.<field>$3");
                            com_appsflyer_internal_AFe1cSDK$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            C1C7U.LIZIZ("AFe1cSDK@210e.<field>$3");
                        }

                        public final void com_appsflyer_internal_AFe1cSDK$3__run$___twin___() {
                            Iterator<AFe1fSDK> it2 = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                            while (it2.hasNext()) {
                                it2.next().values(aFe1dSDKPollFirst);
                            }
                        }

                        public static void com_appsflyer_internal_AFe1cSDK$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                            try {
                                anonymousClass3.com_appsflyer_internal_AFe1cSDK$3__run$___twin___();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    });
                    if (!AFe1cSDK.this.e.isEmpty()) {
                        AFe1cSDK aFe1cSDK2 = AFe1cSDK.this;
                        aFe1cSDK2.values.submit(aFe1cSDK2.new AnonymousClass1());
                    }
                    try {
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "starting task execution: ".concat(String.valueOf(aFe1dSDKPollFirst)));
                        final AFe1bSDK aFe1bSDKAFLogger = aFe1dSDKPollFirst.AFLogger();
                        aFf1xSDK.cancel();
                        final AFe1cSDK aFe1cSDK3 = AFe1cSDK.this;
                        aFe1cSDK3.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("AFe1cSDK@210e.<field>$4");
                                com_appsflyer_internal_AFe1cSDK$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                C1C7U.LIZIZ("AFe1cSDK@210e.<field>$4");
                            }

                            public final void com_appsflyer_internal_AFe1cSDK$4__run$___twin___() {
                                AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "execution finished for " + aFe1dSDKPollFirst + ", result: " + aFe1bSDKAFLogger);
                                AFe1cSDK.this.registerClient.remove(aFe1dSDKPollFirst);
                                Iterator<AFe1fSDK> it2 = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                                while (it2.hasNext()) {
                                    it2.next().values(aFe1dSDKPollFirst, aFe1bSDKAFLogger);
                                }
                                if (aFe1bSDKAFLogger == AFe1bSDK.SUCCESS) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(aFe1dSDKPollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (!aFe1dSDKPollFirst.valueOf()) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(aFe1dSDKPollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (AFe1cSDK.AFInAppEventType(aFe1dSDKPollFirst)) {
                                    synchronized (AFe1cSDK.this.e) {
                                        try {
                                            AFe1cSDK.this.AFLogger.add(aFe1dSDKPollFirst);
                                            for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }
                            }

                            public static void com_appsflyer_internal_AFe1cSDK$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                                try {
                                    anonymousClass4.com_appsflyer_internal_AFe1cSDK$4__run$___twin___();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    if (!C2179971ATj.LIZ(th)) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFe1dSDKPollFirst)));
                        final AFe1bSDK aFe1bSDK = AFe1bSDK.TIMEOUT;
                        aFe1dSDKPollFirst.values = aFe1bSDK;
                        final AFe1cSDK aFe1cSDK4 = AFe1cSDK.this;
                        aFe1cSDK4.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("AFe1cSDK@210e.<field>$4");
                                com_appsflyer_internal_AFe1cSDK$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                C1C7U.LIZIZ("AFe1cSDK@210e.<field>$4");
                            }

                            public final void com_appsflyer_internal_AFe1cSDK$4__run$___twin___() {
                                AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "execution finished for " + aFe1dSDKPollFirst + ", result: " + aFe1bSDK);
                                AFe1cSDK.this.registerClient.remove(aFe1dSDKPollFirst);
                                Iterator<AFe1fSDK> it2 = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                                while (it2.hasNext()) {
                                    it2.next().values(aFe1dSDKPollFirst, aFe1bSDK);
                                }
                                if (aFe1bSDK == AFe1bSDK.SUCCESS) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(aFe1dSDKPollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (!aFe1dSDKPollFirst.valueOf()) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(aFe1dSDKPollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (AFe1cSDK.AFInAppEventType(aFe1dSDKPollFirst)) {
                                    synchronized (AFe1cSDK.this.e) {
                                        try {
                                            AFe1cSDK.this.AFLogger.add(aFe1dSDKPollFirst);
                                            for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }
                            }

                            public static void com_appsflyer_internal_AFe1cSDK$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                                try {
                                    anonymousClass4.com_appsflyer_internal_AFe1cSDK$4__run$___twin___();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    if (!C2179971ATj.LIZ(th)) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    } catch (InterruptedException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFe1dSDKPollFirst)));
                        final AFe1bSDK aFe1bSDK2 = AFe1bSDK.TIMEOUT;
                        aFe1dSDKPollFirst.values = aFe1bSDK2;
                        final AFe1cSDK aFe1cSDK42 = AFe1cSDK.this;
                        aFe1cSDK42.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("AFe1cSDK@210e.<field>$4");
                                com_appsflyer_internal_AFe1cSDK$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                C1C7U.LIZIZ("AFe1cSDK@210e.<field>$4");
                            }

                            public final void com_appsflyer_internal_AFe1cSDK$4__run$___twin___() {
                                AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "execution finished for " + aFe1dSDKPollFirst + ", result: " + aFe1bSDK2);
                                AFe1cSDK.this.registerClient.remove(aFe1dSDKPollFirst);
                                Iterator<AFe1fSDK> it2 = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                                while (it2.hasNext()) {
                                    it2.next().values(aFe1dSDKPollFirst, aFe1bSDK2);
                                }
                                if (aFe1bSDK2 == AFe1bSDK.SUCCESS) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(aFe1dSDKPollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (!aFe1dSDKPollFirst.valueOf()) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(aFe1dSDKPollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (AFe1cSDK.AFInAppEventType(aFe1dSDKPollFirst)) {
                                    synchronized (AFe1cSDK.this.e) {
                                        try {
                                            AFe1cSDK.this.AFLogger.add(aFe1dSDKPollFirst);
                                            for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }
                            }

                            public static void com_appsflyer_internal_AFe1cSDK$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                                try {
                                    anonymousClass4.com_appsflyer_internal_AFe1cSDK$4__run$___twin___();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    if (!C2179971ATj.LIZ(th)) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        aFf1xSDK.cancel();
                        final AFe1cSDK aFe1cSDK5 = AFe1cSDK.this;
                        final AFe1bSDK aFe1bSDK3 = AFe1bSDK.FAILURE;
                        aFe1cSDK5.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("AFe1cSDK@210e.<field>$4");
                                com_appsflyer_internal_AFe1cSDK$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                C1C7U.LIZIZ("AFe1cSDK@210e.<field>$4");
                            }

                            public final void com_appsflyer_internal_AFe1cSDK$4__run$___twin___() {
                                AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "execution finished for " + aFe1dSDKPollFirst + ", result: " + aFe1bSDK3);
                                AFe1cSDK.this.registerClient.remove(aFe1dSDKPollFirst);
                                Iterator<AFe1fSDK> it2 = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                                while (it2.hasNext()) {
                                    it2.next().values(aFe1dSDKPollFirst, aFe1bSDK3);
                                }
                                if (aFe1bSDK3 == AFe1bSDK.SUCCESS) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(aFe1dSDKPollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (!aFe1dSDKPollFirst.valueOf()) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(aFe1dSDKPollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (AFe1cSDK.AFInAppEventType(aFe1dSDKPollFirst)) {
                                    synchronized (AFe1cSDK.this.e) {
                                        try {
                                            AFe1cSDK.this.AFLogger.add(aFe1dSDKPollFirst);
                                            for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            throw th2;
                                        }
                                    }
                                }
                            }

                            public static void com_appsflyer_internal_AFe1cSDK$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                                try {
                                    anonymousClass4.com_appsflyer_internal_AFe1cSDK$4__run$___twin___();
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    if (!C2179971ATj.LIZ(th2)) {
                                        throw th2;
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }

        public AnonymousClass1() {
        }

        public static void com_appsflyer_internal_AFe1cSDK$1_com_ss_android_ugc_aweme_lancet_AppsFlyerOptLancet_zza(AnonymousClass1 anonymousClass1) {
            Set services;
            int i = C2516609tc.LIZ;
            if (i > 0 && C2456309jt.LIZ() && !C820260WFs.LIZ && C820260WFs.LIZIZ > 0 && C820260WFs.LIZ() > 10000 && (services = ServiceManager.get().getServices(IFeedCacheLoaderService.class)) != null) {
                Iterator it2 = services.iterator();
                if (it2.hasNext() && ((IFeedCacheLoaderService) it2.next()).LJII()) {
                    try {
                        if (Looper.getMainLooper() != Looper.myLooper()) {
                            Thread.sleep(i);
                        }
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            anonymousClass1.com_appsflyer_internal_AFe1cSDK$1__run$___twin___();
        }

        public static void com_appsflyer_internal_AFe1cSDK$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            try {
                com_appsflyer_internal_AFe1cSDK$1_com_ss_android_ugc_aweme_lancet_AppsFlyerOptLancet_zza(anonymousClass1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1cSDK$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        public /* synthetic */ AFe1dSDK values;

        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("AFe1cSDK@210e.<field>$2");
            com_appsflyer_internal_AFe1cSDK$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("AFe1cSDK@210e.<field>$2");
        }

        public final void com_appsflyer_internal_AFe1cSDK$2__run$___twin___() {
            boolean zAdd;
            synchronized (AFe1cSDK.this.e) {
                try {
                    if (AFe1cSDK.this.registerClient.contains(this.values)) {
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "tried to add already running task: " + this.values);
                        return;
                    }
                    if (AFe1cSDK.this.e.contains(this.values) || AFe1cSDK.this.unregisterClient.contains(this.values)) {
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "tried to add already scheduled task: " + this.values);
                        return;
                    }
                    AFe1cSDK aFe1cSDK = AFe1cSDK.this;
                    AFe1dSDK aFe1dSDK = this.values;
                    for (AFf1zSDK aFf1zSDK : aFe1dSDK.AFInAppEventParameterName) {
                        if (aFe1cSDK.d.contains(aFf1zSDK)) {
                            aFe1dSDK.valueOf.add(aFf1zSDK);
                        }
                    }
                    if (AFe1cSDK.this.valueOf((AFe1dSDK<?>) this.values)) {
                        zAdd = AFe1cSDK.this.e.add(this.values);
                        if (zAdd) {
                            AFe1cSDK aFe1cSDK2 = AFe1cSDK.this;
                            aFe1cSDK2.e.addAll(aFe1cSDK2.AFLogger);
                            AFe1cSDK.this.AFLogger.clear();
                        } else {
                            AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "task not added, it's already in the queue: " + this.values);
                        }
                    } else {
                        zAdd = AFe1cSDK.this.unregisterClient.add(this.values);
                        if (zAdd) {
                            AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "new task was blocked: " + this.values);
                            this.values.values();
                            AFe1cSDK aFe1cSDK22 = AFe1cSDK.this;
                            aFe1cSDK22.e.addAll(aFe1cSDK22.AFLogger);
                            AFe1cSDK.this.AFLogger.clear();
                        }
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "task not added, it's already in the queue: " + this.values);
                    }
                    if (!zAdd) {
                        AFLogger.INSTANCE.w(AFg1aSDK.QUEUE, "QUEUE: tried to add already pending task: " + this.values);
                        return;
                    }
                    AFe1cSDK.this.d.add(this.values.AFInAppEventType);
                    AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "new task added: " + this.values);
                    Iterator<AFe1fSDK> it2 = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    AFe1cSDK aFe1cSDK3 = AFe1cSDK.this;
                    aFe1cSDK3.values.submit(aFe1cSDK3.new AnonymousClass1());
                    AFe1cSDK aFe1cSDK4 = AFe1cSDK.this;
                    synchronized (aFe1cSDK4.e) {
                        try {
                            for (int size = (aFe1cSDK4.e.size() + aFe1cSDK4.unregisterClient.size()) - 40; size > 0; size--) {
                                boolean z = !aFe1cSDK4.unregisterClient.isEmpty();
                                if (true ^ aFe1cSDK4.e.isEmpty()) {
                                    if (!z) {
                                        aFe1cSDK4.AFInAppEventParameterName(aFe1cSDK4.e);
                                    } else if (aFe1cSDK4.e.first().compareTo(aFe1cSDK4.unregisterClient.first()) > 0) {
                                        aFe1cSDK4.AFInAppEventParameterName(aFe1cSDK4.e);
                                    } else {
                                        aFe1cSDK4.AFInAppEventParameterName(aFe1cSDK4.unregisterClient);
                                    }
                                } else if (z) {
                                    aFe1cSDK4.AFInAppEventParameterName(aFe1cSDK4.unregisterClient);
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }

        public static void com_appsflyer_internal_AFe1cSDK$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
            try {
                anonymousClass2.com_appsflyer_internal_AFe1cSDK$2__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public AnonymousClass2(AFe1dSDK aFe1dSDK) {
            this.values = aFe1dSDK;
        }
    }

    public AFe1cSDK(ExecutorService executorService) {
        this.values = executorService;
    }

    public static boolean AFInAppEventType(AFe1dSDK<?> aFe1dSDK) {
        if ((aFe1dSDK instanceof AFf1iSDK) && aFe1dSDK.AFInAppEventType == AFf1zSDK.ARS_VALIDATE) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void valueOf(AFe1cSDK aFe1cSDK) {
        synchronized (aFe1cSDK.e) {
            try {
                Iterator<AFe1dSDK<?>> it2 = aFe1cSDK.unregisterClient.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    AFe1dSDK<?> next = it2.next();
                    if (aFe1cSDK.valueOf(next)) {
                        it2.remove();
                        aFe1cSDK.e.add(next);
                        z = true;
                    }
                }
                if (z) {
                    aFe1cSDK.values.submit(aFe1cSDK.new AnonymousClass1());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void AFInAppEventParameterName(NavigableSet<AFe1dSDK<?>> navigableSet) {
        AFe1dSDK<?> aFe1dSDKPollFirst = navigableSet.pollFirst();
        this.AFKeystoreWrapper.add(aFe1dSDKPollFirst.AFInAppEventType);
        Iterator<AFe1fSDK> it2 = this.AFInAppEventParameterName.iterator();
        while (it2.hasNext()) {
            it2.next().AFInAppEventType(aFe1dSDKPollFirst);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean valueOf(AFe1dSDK<?> aFe1dSDK) {
        return this.AFKeystoreWrapper.containsAll(aFe1dSDK.valueOf);
    }
}
