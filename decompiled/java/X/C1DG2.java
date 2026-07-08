package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.diagnosis.MainThreadTraceConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DG2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DG2 extends C09AY implements Function0<MainThreadTraceConfig> {
    public C1DG2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final MainThreadTraceConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            MainThreadTraceConfig mainThreadTraceConfig = C1DG1.LIZ;
            MainThreadTraceConfig mainThreadTraceConfig2 = (MainThreadTraceConfig) c0c64LJIILLIIL.LJJIIJ(true, "cold_boot_trace_config", 31744, MainThreadTraceConfig.class, mainThreadTraceConfig, 2);
            return mainThreadTraceConfig2 != null ? mainThreadTraceConfig2 : mainThreadTraceConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1DG1.LIZ;
        }
    }
}
