package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.minis.exp.MinisPreloadConfig;

/* JADX INFO: renamed from: X.0pt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528840pt4 {
    public static final MinisPreloadConfig LIZ = new MinisPreloadConfig(0, null, null, 0, null, null, null, 127, null);

    public static MinisPreloadConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MinisPreloadConfig minisPreloadConfig = LIZ;
        MinisPreloadConfig minisPreloadConfig2 = (MinisPreloadConfig) settingsManagerLIZLLL.LJIIIIZZ("minis_preload_config", MinisPreloadConfig.class, minisPreloadConfig);
        return minisPreloadConfig2 != null ? minisPreloadConfig2 : minisPreloadConfig;
    }
}
