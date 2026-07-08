package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.lemon.experiment.FypLemon8BigCardFrequencyConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2275651E5j extends C09AY implements Function0<FypLemon8BigCardFrequencyConfig> {
    public C2275651E5j() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.lemon.experiment.FypLemon8BigCardFrequencyConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FypLemon8BigCardFrequencyConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FypLemon8BigCardFrequencyConfig fypLemon8BigCardFrequencyConfig = C2275641E5i.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_fyp_lemon8_big_card_frequency", FypLemon8BigCardFrequencyConfig.class, fypLemon8BigCardFrequencyConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : fypLemon8BigCardFrequencyConfig;
    }
}
