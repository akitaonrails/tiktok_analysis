package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cla.experiments.captions.ClaDiskCacheConfig;

/* JADX INFO: renamed from: X.162J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162J {
    public static final ClaDiskCacheConfig LIZ;

    static {
        ClaDiskCacheConfig claDiskCacheConfig = new ClaDiskCacheConfig(false, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        ClaDiskCacheConfig claDiskCacheConfig2 = (ClaDiskCacheConfig) SettingsManager.LIZLLL().LJIIIIZZ("cla_disk_cache_config", ClaDiskCacheConfig.class, claDiskCacheConfig);
        if (claDiskCacheConfig2 != null) {
            claDiskCacheConfig = claDiskCacheConfig2;
        }
        LIZ = claDiskCacheConfig;
    }
}
