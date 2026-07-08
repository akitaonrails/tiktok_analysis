package X;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveKeyApiOpt;
import com.bytedance.android.livesdk.performance.LiveJatoSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Ade, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183961Ade {
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static volatile long LJIIIIZZ;
    public static volatile long LJIIIZ;
    public static volatile int LJIIJ;
    public static final C2183961Ade LIZ = new C2183961Ade();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final C0N48 LIZJ = C0N48.LL;
    public static final C0N49 LIZLLL = C0N49.LL;
    public static final C0N47 LJI = C0N47.LL;
    public static final C0N46 LJII = C0N46.LL;

    public final void LIZJ() {
        if (LiveKeyApiOpt.isEnableRoomEnterCpuBoost()) {
            if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.0N4N
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveJatoHelper@2a6.onEnterWatchRoom$1");
                        try {
                            C2183961Ade.LIZ.LIZJ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveJatoHelper@2a6.onEnterWatchRoom$1");
                    }
                });
                return;
            }
            if (JatoXL.isInited()) {
                long roomEnterCpuBoostTimeoutMs = LiveKeyApiOpt.getRoomEnterCpuBoostTimeoutMs();
                if (roomEnterCpuBoostTimeoutMs <= 0) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (this) {
                    try {
                        if (jElapsedRealtime - LJIIIZ < LiveKeyApiOpt.getRoomEnterCpuBoostDebounceMs()) {
                            return;
                        }
                        LJIIIZ = jElapsedRealtime;
                        boolean zIsEnableRoomEnterBindBigCore = LiveKeyApiOpt.isEnableRoomEnterBindBigCore();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onEnterWatchRoom start cpuBoost timeout=");
                        sbLIZ.append(roomEnterCpuBoostTimeoutMs);
                        sbLIZ.append(" bindBigCore=");
                        sbLIZ.append(zIsEnableRoomEnterBindBigCore);
                        C20441214yg.LIZIZ("LiveJatoHelper", C2188811AlT.LIZIZ(sbLIZ));
                        LJ = true;
                        JatoXL.tryCpuBoost(roomEnterCpuBoostTimeoutMs);
                        if (zIsEnableRoomEnterBindBigCore) {
                            CpusetManager.bindBigCore();
                            LJFF = true;
                        }
                        BPEAHandler bPEAHandler = LIZIZ;
                        C0N47 c0n47 = LJI;
                        bPEAHandler.removeCallbacks(c0n47);
                        C786410Ut5.LJLIIL(roomEnterCpuBoostTimeoutMs, bPEAHandler, c0n47);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    public static void LIZ(String str) {
        if (!LJ) {
            return;
        }
        LJ = false;
        LIZIZ.removeCallbacks(LJI);
        if (LJFF) {
            CpusetManager.resetCoreBind();
            LJFF = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endWatchRoomBoost reason=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveJatoHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(String str) {
        Application application;
        Context context;
        IHostPerformanceOpt iHostPerformanceOpt;
        if (!JatoXL.isInited()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this) {
            try {
                if (jElapsedRealtime - LJIIIIZZ < LiveJatoSetting.getDebounceIntervalMs()) {
                    return;
                }
                LJIIIIZZ = jElapsedRealtime;
                long durationMs = LiveJatoSetting.getDurationMs();
                if (durationMs <= 0) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("trigger onEnterPage, source=");
                sbLIZ.append(str);
                sbLIZ.append(", duration=");
                sbLIZ.append(durationMs);
                sbLIZ.append(", gc=");
                sbLIZ.append(LiveJatoSetting.isGcEnable());
                sbLIZ.append(", jit=");
                sbLIZ.append(LiveJatoSetting.isJitEnable());
                sbLIZ.append(", cpu=");
                sbLIZ.append(LiveJatoSetting.isCpuBoostEnable());
                sbLIZ.append(", bindCore=");
                sbLIZ.append(LiveJatoSetting.isBindCoreEnable());
                sbLIZ.append(", renderThread=");
                sbLIZ.append(LiveJatoSetting.isRenderThreadEnable());
                sbLIZ.append(", thread=");
                sbLIZ.append(LiveJatoSetting.isThreadEnable());
                C20441214yg.LIZIZ("LiveJatoHelper", C2188811AlT.LIZIZ(sbLIZ));
                if (LiveJatoSetting.isGcEnable()) {
                    JatoXL.requestBlockGc(durationMs);
                }
                if (LiveJatoSetting.isJitEnable() && (iHostPerformanceOpt = (IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class)) != null) {
                    iHostPerformanceOpt.MS1(durationMs);
                }
                if (LiveJatoSetting.isCpuBoostEnable()) {
                    JatoXL.tryCpuBoost(durationMs);
                }
                if (LiveJatoSetting.isBindCoreEnable()) {
                    CpusetManager.bindBigCore();
                    BPEAHandler bPEAHandler = LIZIZ;
                    C0N48 c0n48 = LIZJ;
                    bPEAHandler.removeCallbacks(c0n48);
                    C786410Ut5.LJLIIL(durationMs, bPEAHandler, c0n48);
                }
                if (LiveJatoSetting.isRenderThreadEnable()) {
                    IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                    Context contextN3 = null;
                    if (iHostAppContext != null && (context = iHostAppContext.context()) != null) {
                        contextN3 = C786410Ut5.N3(context);
                    }
                    if ((contextN3 instanceof Application) && (application = (Application) contextN3) != null) {
                        JatoXL.boostRenderThread(application, -20);
                        BPEAHandler bPEAHandler2 = LIZIZ;
                        C0N49 c0n49 = LIZLLL;
                        bPEAHandler2.removeCallbacks(c0n49);
                        C786410Ut5.LJLIIL(durationMs, bPEAHandler2, c0n49);
                    }
                }
                if (LiveJatoSetting.isThreadEnable()) {
                    int iMyTid = Process.myTid();
                    JatoXL.setPriority(iMyTid, -20);
                    LJIIJ = iMyTid;
                    BPEAHandler bPEAHandler3 = LIZIZ;
                    C0N46 c0n46 = LJII;
                    bPEAHandler3.removeCallbacks(c0n46);
                    C786410Ut5.LJLIIL(durationMs, bPEAHandler3, c0n46);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
