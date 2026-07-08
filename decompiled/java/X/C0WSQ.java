package X;

import Y.ARunnableS46S0300000_13;
import com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfig;
import com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfigs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0WSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WSQ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1187));

    public static void LIZ(AbstractC1247804uS abstractC1247804uS, C0WSS c0wss, C0WSC c0wsc) {
        PerfSlaConfig perfSlaConfig;
        c0wss.LIZ.cancel(false);
        if (!c0wss.LIZIZ.get()) {
            PerfSlaConfigs perfSlaConfigs = C1247904uT.LIZ;
            if (abstractC1247804uS instanceof C1247704uR) {
                PerfSlaConfig perfSlaConfig2 = perfSlaConfigs.init;
                if (perfSlaConfig2 != null) {
                    C0WSR.LIZ(perfSlaConfig2.successSampleRate, perfSlaConfig2.thresholdMs, c0wsc, C0WSF.SUCCESS, "init", null, perfSlaConfig2.tag);
                    return;
                }
                return;
            }
            if (!(abstractC1247804uS instanceof C1247604uQ) || (perfSlaConfig = perfSlaConfigs.controlExecution) == null) {
                return;
            }
            C0WSR.LIZ(perfSlaConfig.successSampleRate, perfSlaConfig.thresholdMs, c0wsc, C0WSF.SUCCESS, "execution", ((C1247604uQ) abstractC1247804uS).LIZ, perfSlaConfig.tag);
        }
    }

    public static Object LIZIZ(AbstractC1247804uS abstractC1247804uS, long j, C0WSC c0wsc, Function0 function0) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C0WSS c0wss = new C0WSS(((ScheduledExecutorService) LIZ.getValue()).schedule(new ARunnableS46S0300000_13(atomicBoolean, abstractC1247804uS, c0wsc, 16), j, TimeUnit.MILLISECONDS), atomicBoolean);
        try {
            Object objInvoke = function0.invoke();
            LIZ(abstractC1247804uS, c0wss, c0wsc);
            return objInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ(abstractC1247804uS, c0wss, c0wsc);
            throw th;
        }
    }
}
