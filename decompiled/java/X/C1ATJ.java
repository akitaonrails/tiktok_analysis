package X;

import Y.ARunnableS102S0200000_33;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS65S0300000_32;
import Y.ARunnableS86S0200000_17;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.livesetting.clientai.LivePitayaClearDelayedTasksOnRoomReleaseSetting;
import com.bytedance.android.livesdk.livesetting.clientai.LivePitayaRemoveTimedOutTasksSetting;
import com.bytedance.android.livesdk.livesetting.clientai.LivePitayaUpdateRequestAllEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS12S1310000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ATJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ATJ implements InterfaceC964460bCm {
    public static InterfaceC1284120jWM LJIIJ;
    public boolean LJII;
    public long LJIIIIZZ;
    public int LIZ = -1;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(9));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(8));
    public ScheduledExecutorService LIZLLL = C807400Vlq.LJFF(ThreadFactoryC589730NBb.LL);
    public final PriorityBlockingQueue<C1ATK> LJ = new PriorityBlockingQueue<>(10, new Comparator() { // from class: X.1ATL
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C1ATK) obj2).LIZLLL - ((C1ATK) obj).LIZLLL;
        }
    });
    public final ConcurrentHashSet<ScheduledFuture<?>> LJFF = new ConcurrentHashSet<>();
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final ConcurrentHashSet<String> LJIIIZ = new ConcurrentHashSet<>();

    public final synchronized void LJII() {
        this.LJ.clear();
        Iterator<ScheduledFuture<?>> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().cancel(false);
        }
        this.LJFF.clear();
    }

    public final IPitayaCore LIZLLL() {
        return (IPitayaCore) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC964460bCm
    public final void LIZIZ() {
        boolean zLJI = MethodIDManager.LJI(137938);
        if (!LivePitayaUpdateRequestAllEnableSetting.INSTANCE.enabled()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            if (LivePitayaEnv.LIZ) {
                LIZLLL().requestUpdateAll();
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // X.InterfaceC964460bCm
    public final void LIZJ(final C1ATK c1atk) {
        final InterfaceC2179811ASt interfaceC2179811ASt = c1atk.LIZJ;
        c1atk.LIZJ = new InterfaceC2179811ASt() { // from class: X.1ASs
            public final long LIZ = SystemClock.elapsedRealtime();
            public final int LIZIZ;
            public final long LIZJ;

            @Override // X.InterfaceC2179811ASt
            public final void LIZ(C21406118pv c21406118pv) throws JSONException {
                long jElapsedRealtime;
                boolean z;
                Object objValueOf;
                int iOptInt;
                String strOptString;
                String version;
                String str = c1atk.LIZ;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.LIZ;
                if (this.LIZLLL.LJIIIIZZ == 0) {
                    jElapsedRealtime = 0;
                } else {
                    jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZLLL.LJIIIIZZ;
                }
                long j = this.LIZJ;
                int i = this.LIZIZ;
                int i2 = c21406118pv.LIZ;
                int i3 = 0;
                if (i2 == -2) {
                    z = true;
                } else {
                    z = false;
                }
                Object summary = 0;
                if (z) {
                    PTYError pTYError = c21406118pv.LIZJ;
                    if (pTYError != null) {
                        objValueOf = Integer.valueOf(pTYError.getCode());
                    } else {
                        objValueOf = null;
                    }
                } else {
                    objValueOf = summary;
                }
                if (c21406118pv.LIZ == -2) {
                    PTYError pTYError2 = c21406118pv.LIZJ;
                    if (pTYError2 != null) {
                        summary = pTYError2.getSummary();
                    } else {
                        summary = null;
                    }
                }
                JSONObject jSONObject = c21406118pv.LIZIZ;
                int iOptInt2 = -1;
                if (jSONObject != null) {
                    iOptInt2 = jSONObject.optInt("code", -1);
                    iOptInt = jSONObject.optInt("version", 1);
                } else {
                    iOptInt = 1;
                }
                if (jSONObject == null || (strOptString = jSONObject.optString("message")) == null) {
                    strOptString = "";
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.putOpt("business", str);
                    if (!c21406118pv.LIZ() || iOptInt2 != 0) {
                        i3 = 1;
                    }
                    jSONObject2.putOpt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i3));
                    jSONObject2.putOpt("business_code", Integer.valueOf(iOptInt2));
                    PTYPackageInfo pTYPackageInfo = c21406118pv.LIZLLL;
                    if (pTYPackageInfo == null || (version = pTYPackageInfo.getVersion()) == null) {
                        version = "";
                    }
                    jSONObject2.putOpt("package_version", version);
                    jSONObject2.putOpt("pitaya_code", objValueOf);
                    jSONObject2.putOpt("algo_data_version", Integer.valueOf(iOptInt));
                    jSONObject2.putOpt("live_client_ai_code", Integer.valueOf(i2));
                    jSONObject2.putOpt("clear_delayed_tasks_opt", Integer.valueOf(LivePitayaClearDelayedTasksOnRoomReleaseSetting.INSTANCE.enabled() ? 1 : 0));
                    C189200o6.m2constructorimpl(jSONObject2.putOpt("remove_timed_out_tasks_opt", Integer.valueOf(LivePitayaRemoveTimedOutTasksSetting.INSTANCE.enabled() ? 1 : 0)));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.putOpt("elapsed_time", Long.valueOf(jElapsedRealtime));
                    C189200o6.m2constructorimpl(jSONObject3.putOpt("total_elapsed_time", Long.valueOf(jElapsedRealtime2)));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.putOpt("pitaya_err_msg", summary);
                    jSONObject4.putOpt("business_err_msg", strOptString);
                    jSONObject4.putOpt("duration_after_enter", Long.valueOf(j));
                    jSONObject4.putOpt("queue_size", Integer.valueOf(i));
                    jSONObject4.putOpt("elapsed_time", Long.valueOf(jElapsedRealtime));
                    C189200o6.m2constructorimpl(jSONObject4.putOpt("total_elapsed_time", Long.valueOf(jElapsedRealtime2)));
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.putOpt("extra", jSONObject4);
                C1CC2.LIZJ("ttlive_client_ai_algorithm_monitor", jSONObject2, jSONObject3, jSONObject5);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("client_ai_algorithm_monitor");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIJZLJL(jSONObject2);
                c474500IjALIZ.LJJIIJZLJL(jSONObject5);
                c474500IjALIZ.LIZ();
                this.LIZLLL.LJIIIIZZ = 0L;
                interfaceC2179811ASt.LIZ(c21406118pv);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
            {
                /*
                    r7 = this;
                    r7.LIZLLL = r8
                    r9 = r9
                    r10 = r10
                    r7.<init>()
                    long r0 = android.os.SystemClock.elapsedRealtime()
                    r7.LIZ = r0
                    java.util.concurrent.PriorityBlockingQueue<X.1ATK> r0 = r8.LJ
                    int r0 = r0.size()
                    r7.LIZIZ = r0
                    com.bytedance.ies.sdk.datachannel.DataChannelGlobal r0 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
                    boolean r0 = X.C500260Jjc.LJIJ(r0)
                    r1 = 0
                    if (r0 == 0) goto L3a
                    com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLI()
                    if (r0 == 0) goto L37
                    long r5 = r0.getCreateTime()
                    r3 = 1000(0x3e8, double:4.94E-321)
                    long r5 = r5 * r3
                L2e:
                    int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r0 == 0) goto L37
                    long r1 = java.lang.System.currentTimeMillis()
                    long r1 = r1 - r5
                L37:
                    r7.LIZJ = r1
                    return
                L3a:
                    X.0INV r0 = X.C0IL2.LIZ
                    com.bytedance.android.livesdkapi.session.EnterRoomLinkSession r0 = r0.LIZ()
                    if (r0 == 0) goto L37
                    com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r0.mEnterRoomConfig
                    if (r0 == 0) goto L37
                    com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
                    if (r0 == 0) goto L37
                    com.bytedance.android.livesdkapi.session.EnterRoomConfig$TimeStamp r0 = r0.timeStamps
                    if (r0 == 0) goto L37
                    long r5 = r0.enterRoomStarTimeReal
                    goto L2e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2179801ASs.<init>(X.1ATJ, X.1ATK, X.1ASt):void");
            }
        };
        long j = c1atk.LJ.LIZ;
        if (j == 0) {
            LJFF(c1atk);
        } else {
            LJIIIIZZ(j, new ARunnableS86S0200000_17(this, c1atk, 5));
        }
    }

    public final void LJFF(C1ATK c1atk) {
        if (this.LJI.get()) {
            LJ(c1atk, new ARunnableS133S0100000_33(c1atk, 14));
            return;
        }
        this.LJ.offer(c1atk);
        if (!this.LJII) {
            LJIIIZ(true);
        }
        long j = c1atk.LJ.LIZIZ;
        if (j > 0) {
            LJIIIIZZ(j, new ARunnableS102S0200000_33(this, c1atk, 6));
        }
    }

    public final synchronized void LJI(int i) {
        if (this.LIZ != i) {
            return;
        }
        if (this.LJI.compareAndSet(false, true)) {
            this.LIZLLL.shutdown();
            this.LIZLLL.shutdownNow();
            this.LJ.clear();
        }
        if (LivePitayaEnv.LIZ) {
            LIZLLL().releaseAllEngines();
        }
    }

    public final void LJIIIZ(boolean z) {
        this.LJII = true;
        ARunnableS133S0100000_33 aRunnableS133S0100000_33 = new ARunnableS133S0100000_33(this, 16);
        LiveClientAISettings liveClientAISettings = LiveClientAISettings.INSTANCE;
        if (liveClientAISettings.getTaskSettings().period > 0 && !z) {
            LJIIIIZZ(liveClientAISettings.getTaskSettings().period, aRunnableS133S0100000_33);
        } else {
            aRunnableS133S0100000_33.run();
        }
    }

    @Override // X.InterfaceC964460bCm
    public final void removeMessageHandler(String str) {
        LIZLLL().removeMessageHandler(str);
    }

    @Override // X.InterfaceC964460bCm
    public final synchronized void restart(int i) {
        this.LIZ = i;
        if (!this.LJI.get()) {
            return;
        }
        this.LJII = false;
        this.LJI.set(false);
        this.LJ.clear();
        Iterator<ScheduledFuture<?>> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().cancel(false);
        }
        this.LJFF.clear();
        this.LIZLLL = C807400Vlq.LJFF(ThreadFactoryC589730NBb.LL);
    }

    public final void LJ(C1ATK c1atk, Runnable runnable) {
        if (c1atk.LJ.LIZJ) {
            RunnableC823120WQs.LIZIZ(runnable);
        } else if (Intrinsics.LJFF(C786410Ut5.u3(), ((Handler) this.LIZJ.getValue()).getLooper().getThread())) {
            runnable.run();
        } else {
            C786410Ut5.LJL((Handler) this.LIZJ.getValue(), runnable);
        }
    }

    public final void LJIIIIZZ(long j, Runnable runnable) {
        Object objSchedule;
        if (this.LIZLLL.isShutdown()) {
            return;
        }
        try {
            if (LivePitayaClearDelayedTasksOnRoomReleaseSetting.INSTANCE.enabled()) {
                AtomicReference atomicReference = new AtomicReference();
                ScheduledFuture<?> scheduledFutureSchedule = this.LIZLLL.schedule(new ARunnableS65S0300000_32(runnable, atomicReference, this, 5), j, TimeUnit.MILLISECONDS);
                atomicReference.set(scheduledFutureSchedule);
                objSchedule = Boolean.valueOf(this.LJFF.add(scheduledFutureSchedule));
            } else {
                objSchedule = this.LIZLLL.schedule(runnable, j, TimeUnit.MILLISECONDS);
            }
            C189200o6.m2constructorimpl(objSchedule);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC964460bCm
    public final void registerMessageHandler(String str, PTYMessageHandler pTYMessageHandler) {
        LIZLLL().registerMessageHandler(str, pTYMessageHandler);
    }

    @Override // X.InterfaceC964460bCm
    public final void LIZ(String str, Function0 function0, Function1 function1) {
        LivePitayaEnv.LJFF(new AwS12S1310000_23(this, str, function0, function1, 0), new C5185020h(function1, (Function1<? super PTYError, Unit>) 2), false, false);
    }
}
