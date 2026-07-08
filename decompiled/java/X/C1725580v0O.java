package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerRetentionPopupConfig;

/* JADX INFO: renamed from: X.0v0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725580v0O {
    public static final PipoContainerRetentionPopupConfig LIZ = new PipoContainerRetentionPopupConfig(false, null, null);

    public static final PipoContainerRetentionPopupConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoContainerRetentionPopupConfig pipoContainerRetentionPopupConfig = LIZ;
        PipoContainerRetentionPopupConfig pipoContainerRetentionPopupConfig2 = (PipoContainerRetentionPopupConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_container_retention_popup_config", PipoContainerRetentionPopupConfig.class, pipoContainerRetentionPopupConfig);
        return pipoContainerRetentionPopupConfig2 != null ? pipoContainerRetentionPopupConfig2 : pipoContainerRetentionPopupConfig;
    }
}
