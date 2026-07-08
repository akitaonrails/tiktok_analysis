package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.FeedAdaptionRefactorSettingsConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15d8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20562415d8 extends C09AY implements Function0<FeedAdaptionRefactorSettingsConfig> {
    public C20562415d8() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.experiment.FeedAdaptionRefactorSettingsConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedAdaptionRefactorSettingsConfig invoke() {
        if (C293840BfS.LIZIZ) {
            return new FeedAdaptionRefactorSettingsConfig(false, true, 0.2f, true, false, false, false, false, true, true, true);
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FeedAdaptionRefactorSettingsConfig feedAdaptionRefactorSettingsConfig = C20562515d9.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("feed_adaption_refactor_exp_settings", FeedAdaptionRefactorSettingsConfig.class, feedAdaptionRefactorSettingsConfig);
        return LJIIIIZZ == 0 ? feedAdaptionRefactorSettingsConfig : LJIIIIZZ;
    }
}
