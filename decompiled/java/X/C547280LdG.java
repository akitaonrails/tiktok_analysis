package X;

import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AITheaterTraceConfigExp;

/* JADX INFO: renamed from: X.0LdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547280LdG {
    public static C547270LdF LIZ() {
        AITheaterTraceConfigExp.AITheaterTraceConfig aITheaterTraceConfig = (AITheaterTraceConfigExp.AITheaterTraceConfig) AITheaterTraceConfigExp.LIZIZ.getValue();
        return new C547270LdF(aITheaterTraceConfig.allowLevel, C0C64.LJIILLIIL().LJIIIZ(31744, "ai_theater_trace_enable", true, true), C0C64.LJIILLIIL().LJIIIZ(31744, "ai_theater_trace_force_enable", true, false), C13LP.LLIFFJFJJ(aITheaterTraceConfig.eventBlockList), C13LP.LLIFFJFJJ(aITheaterTraceConfig.businessBlockList));
    }
}
