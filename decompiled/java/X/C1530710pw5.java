package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerSspConfig;

/* JADX INFO: renamed from: X.0pw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530710pw5 {
    public static final PipoContainerSspConfig LIZ = new PipoContainerSspConfig(false, null, null, false, false, false, 90, 90);

    public static final PipoContainerSspConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoContainerSspConfig pipoContainerSspConfig = LIZ;
        PipoContainerSspConfig pipoContainerSspConfig2 = (PipoContainerSspConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_container_ssp_config", PipoContainerSspConfig.class, pipoContainerSspConfig);
        return pipoContainerSspConfig2 != null ? pipoContainerSspConfig2 : pipoContainerSspConfig;
    }
}
