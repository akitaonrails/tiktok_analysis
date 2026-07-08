package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.trace.TraceLogConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VGC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGC extends C09AY implements Function0<TraceLogConfig> {
    public C0VGC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TraceLogConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            TraceLogConfig traceLogConfig = C0VGB.LIZ;
            TraceLogConfig traceLogConfig2 = (TraceLogConfig) c0c64LJIILLIIL.LJJII(TraceLogConfig.class, traceLogConfig, "ttk_trace_log_configs", true);
            return traceLogConfig2 != null ? traceLogConfig2 : traceLogConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C0VGB.LIZ;
        }
    }
}
