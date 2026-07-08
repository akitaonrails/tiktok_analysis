package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.tako.setting.TakoOnboardingParams;

/* JADX INFO: renamed from: X.14Io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20242814Io {
    public static final TakoOnboardingParams LIZ = new TakoOnboardingParams(0, "", "", "", "", "");

    public static TakoOnboardingParams LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TakoOnboardingParams takoOnboardingParams = LIZ;
        TakoOnboardingParams takoOnboardingParams2 = (TakoOnboardingParams) settingsManagerLIZLLL.LJIIIIZZ("tako_onboarding_config", TakoOnboardingParams.class, takoOnboardingParams);
        return takoOnboardingParams2 != null ? takoOnboardingParams2 : takoOnboardingParams;
    }
}
