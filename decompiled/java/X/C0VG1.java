package X;

import com.ss.android.ugc.aweme.experiment.TTKLSUserTraceConfig;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VG1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VG1 extends C09AY implements Function0<TTKLSUserTraceConfig.Config> {
    public C0VG1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TTKLSUserTraceConfig.Config invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        TTKLSUserTraceConfig.Config config = TTKLSUserTraceConfig.LIZ;
        TTKLSUserTraceConfig.Config config2 = (TTKLSUserTraceConfig.Config) c0c64LJIILLIIL.LJJII(TTKLSUserTraceConfig.Config.class, config, "ttkls_user_trace_config", true);
        if (config2 != null) {
            config = config2;
        }
        List<String> list = config.ttklsEvents;
        if (list != null) {
            TTKLSUserTraceConfig.LIZIZ.addAll(list);
        }
        return config;
    }
}
