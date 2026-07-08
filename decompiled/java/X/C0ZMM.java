package X;

import com.ss.android.ugc.aweme.im.lightinteract.impl.exp.LightInteractionBirthdayDebugSettingsData;
import com.ss.android.ugc.aweme.im.strategy.experiment.StrategyConfigurationConfig;

/* JADX INFO: renamed from: X.0ZMM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZMM implements InterfaceC1513805wG {
    public static final C0ZMM LL = new C0ZMM();

    @Override // X.InterfaceC1513805wG
    public final boolean LJIIJ() {
        C0ZMY.LIZ.getClass();
        return ((StrategyConfigurationConfig) C0ZMY.LIZJ.getValue()).useLocalTime;
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJIJL() {
        return ((Number) C271480AkU.LIZ.getValue()).intValue() != 0;
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJIL() {
        return ((Number) C271490AkV.LIZ.getValue()).intValue() != 0;
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJJ() {
        return ((LightInteractionBirthdayDebugSettingsData) C0ZMN.LIZIZ.getValue()).skipRequestFrequencyControl;
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJJLL() {
        C0ZMY.LIZ.getClass();
        return ((StrategyConfigurationConfig) C0ZMY.LIZJ.getValue()).messageLocalTime;
    }

    public static boolean LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "light_interaction_frequency_cache", true) != 0;
    }

    @Override // X.InterfaceC1513805wG
    public final int LJJLIIIJLJLI() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_light_interaction_affinity_count", true);
    }
}
