package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECCommonPreloadConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.080l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20477080l extends C09AY implements Function0<ECCommonPreloadConfig> {
    public C20477080l() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECCommonPreloadConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ECCommonPreloadConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECCommonPreloadConfig eCCommonPreloadConfig = C20476080k.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_common_preload_config", ECCommonPreloadConfig.class, eCCommonPreloadConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : eCCommonPreloadConfig;
    }
}
