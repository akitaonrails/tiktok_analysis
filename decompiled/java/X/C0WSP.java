package X;

import com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfig;
import com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfigs;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.AwS257S0300000_13;

/* JADX INFO: renamed from: X.0WSP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WSP {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(C0WSB c0wsb, AwS257S0300000_13 awS257S0300000_13) {
        long j;
        PerfSlaConfigs perfSlaConfigs = C1247904uT.LIZ;
        PerfSlaConfig perfSlaConfig = perfSlaConfigs.init;
        if (perfSlaConfig == null) {
            awS257S0300000_13.invoke();
            return;
        }
        if (!perfSlaConfig.enable) {
            awS257S0300000_13.invoke();
            return;
        }
        if (perfSlaConfig.enableDiscard) {
            C1247704uR c1247704uR = C1247704uR.LIZ;
            if (!C1247504uP.LIZIZ(c1247704uR)) {
                if (c0wsb != null) {
                    c0wsb.LJFF = C0WSF.DROPPED;
                }
                C0WSR.LIZIZ(c1247704uR, perfSlaConfigs, c0wsb);
                return;
            }
        }
        C1247704uR c1247704uR2 = C1247704uR.LIZ;
        PerfSlaConfig perfSlaConfig2 = C1247904uT.LIZ.init;
        if (perfSlaConfig2 != null) {
            j = perfSlaConfig2.thresholdMs;
        } else {
            j = 50000;
        }
        C0WSQ.LIZIZ(c1247704uR2, j, c0wsb, awS257S0300000_13);
    }

    public static final Object LIZ(String str, C0WSC c0wsc, C0WZN c0wzn) {
        long j;
        PerfSlaConfigs perfSlaConfigs = C1247904uT.LIZ;
        PerfSlaConfig perfSlaConfig = perfSlaConfigs.controlExecution;
        if (perfSlaConfig == null) {
            return c0wzn.invoke();
        }
        if (!perfSlaConfig.enable) {
            return c0wzn.invoke();
        }
        if (perfSlaConfig.enableDiscard && !C1247504uP.LIZIZ(new C1247604uQ(str))) {
            if (c0wsc != null) {
                c0wsc.LJ(C0WSF.DROPPED);
            }
            C0WSR.LIZIZ(new C1247604uQ(str), perfSlaConfigs, c0wsc);
            return null;
        }
        C1247604uQ c1247604uQ = new C1247604uQ(str);
        PerfSlaConfig perfSlaConfig2 = C1247904uT.LIZ.controlExecution;
        if (perfSlaConfig2 != null) {
            j = perfSlaConfig2.thresholdMs;
        } else {
            j = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        return C0WSQ.LIZIZ(c1247604uQ, j, c0wsc, c0wzn);
    }
}
