package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.1D3Y, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3Y {
    public static final C1D3V LIZ() {
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("ec_sv_re_engage_recommendation_option_ads", 0);
        return iLJ != 0 ? iLJ != 1 ? iLJ != 2 ? C1D3V.DISABLED : C1D3V.PRECISE_SETTING : C1D3V.BROADER_SETTING : C1D3V.DISABLED;
    }
}
