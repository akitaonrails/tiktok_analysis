package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.OptimizeVideoAdaptationStrategySettingsConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0COW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COW extends C09AY implements Function0<OptimizeVideoAdaptationStrategySettingsConfig> {
    public C0COW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.experiment.OptimizeVideoAdaptationStrategySettingsConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final OptimizeVideoAdaptationStrategySettingsConfig invoke() {
        if (C293840BfS.LIZIZ) {
            return C0COX.LIZ;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        OptimizeVideoAdaptationStrategySettingsConfig optimizeVideoAdaptationStrategySettingsConfig = C0COX.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("optimize_android_video_adaptation_strategy_settings", OptimizeVideoAdaptationStrategySettingsConfig.class, optimizeVideoAdaptationStrategySettingsConfig);
        return LJIIIIZZ == 0 ? optimizeVideoAdaptationStrategySettingsConfig : LJIIIIZZ;
    }
}
