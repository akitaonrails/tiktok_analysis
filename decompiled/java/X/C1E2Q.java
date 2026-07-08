package X;

import com.ss.android.ugc.aweme.experiment.NUJAutoRefreshConfig;
import com.ss.android.ugc.aweme.experiment.NUJAutoRefreshConfigExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E2Q extends C09AY implements Function0<NUJAutoRefreshConfig> {
    public C1E2Q() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.NUJAutoRefreshConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final NUJAutoRefreshConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        NUJAutoRefreshConfig nUJAutoRefreshConfig = NUJAutoRefreshConfigExp.none;
        ?? LJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "nuj_auto_refresh_config", 31744, NUJAutoRefreshConfig.class, nUJAutoRefreshConfig, 1);
        return LJJIIJ != 0 ? LJJIIJ : nUJAutoRefreshConfig;
    }
}
