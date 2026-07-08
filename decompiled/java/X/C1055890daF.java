package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.libra.FeedEcCardEnhancedPreloadConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0daF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055890daF extends C09AY implements Function0<FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig> {
    public C1055890daF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig invoke() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig enhancedPreloadConfig = FeedEcCardEnhancedPreloadConfig.LIZ;
            FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig enhancedPreloadConfig2 = (FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig) settingsManagerLIZLLL.LJIIIIZZ("feed_ec_card_enhanced_preload_config", FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig.class, enhancedPreloadConfig);
            return enhancedPreloadConfig2 != null ? enhancedPreloadConfig2 : enhancedPreloadConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return FeedEcCardEnhancedPreloadConfig.LIZ;
        }
    }
}
