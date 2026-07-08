package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cla.experiments.captions.ClaPrefetchConfig;

/* JADX INFO: renamed from: X.0SKG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKG {
    public static final ClaPrefetchConfig LIZ;

    static {
        ClaPrefetchConfig claPrefetchConfig = new ClaPrefetchConfig(null, 0, 0, 0, 0, 0L, 0L, 0, false, false, false, false, false, 8191, null);
        ClaPrefetchConfig claPrefetchConfig2 = (ClaPrefetchConfig) SettingsManager.LIZLLL().LJIIIIZZ("cla_prefetch_config", ClaPrefetchConfig.class, claPrefetchConfig);
        if (claPrefetchConfig2 != null) {
            claPrefetchConfig = claPrefetchConfig2;
        }
        LIZ = claPrefetchConfig;
    }
}
