package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.1D3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3Z {
    public static final C1D3W LIZ() {
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("ec_sv_re_engage_recommendation_option", 0);
        return iLJ != 0 ? iLJ != 1 ? iLJ != 2 ? C1D3W.DISABLED : C1D3W.PRECISE_SETTING : C1D3W.BROADER_SETTING : C1D3W.DISABLED;
    }
}
