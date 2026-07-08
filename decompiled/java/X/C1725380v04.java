package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerEventReportConfig;

/* JADX INFO: renamed from: X.0v04, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725380v04 {
    public static final PipoContainerEventReportConfig LIZ = new PipoContainerEventReportConfig(true, true, true, true, true, false, true, true, C1697810uHb.LJIILJJIL("url_path", "step", "load_latency", "stay_duration"));

    public static final PipoContainerEventReportConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoContainerEventReportConfig pipoContainerEventReportConfig = LIZ;
        PipoContainerEventReportConfig pipoContainerEventReportConfig2 = (PipoContainerEventReportConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_container_event_report_config", PipoContainerEventReportConfig.class, pipoContainerEventReportConfig);
        return pipoContainerEventReportConfig2 != null ? pipoContainerEventReportConfig2 : pipoContainerEventReportConfig;
    }
}
