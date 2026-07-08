package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoPrefetchSettingConfig;

/* JADX INFO: renamed from: X.0v19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726050v19 {
    public static final PipoPrefetchSettingConfig LIZ = new PipoPrefetchSettingConfig(true, null, null);

    public static final PipoPrefetchSettingConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoPrefetchSettingConfig pipoPrefetchSettingConfig = LIZ;
        PipoPrefetchSettingConfig pipoPrefetchSettingConfig2 = (PipoPrefetchSettingConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_container_prefetch_config", PipoPrefetchSettingConfig.class, pipoPrefetchSettingConfig);
        return pipoPrefetchSettingConfig2 != null ? pipoPrefetchSettingConfig2 : pipoPrefetchSettingConfig;
    }
}
