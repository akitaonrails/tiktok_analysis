package X;

import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;

/* JADX INFO: renamed from: X.0oet, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481610oet {
    public static IPlayerEventReportService LIZ;
    public static ISimReporterConfig LIZIZ;

    public static synchronized IPlayerEventReportService LIZ() {
        if (LIZIZ == null) {
            ISimReporterConfig iSimReporterConfig = (ISimReporterConfig) InjectedConfigManager.getConfig(ISimReporterConfig.class);
            LIZIZ = iSimReporterConfig;
            if (iSimReporterConfig == null) {
                LIZIZ = new C1481880ofK();
            }
        }
        if (LIZIZ == null) {
            if (C1475000oUE.LIZIZ().isDebug()) {
                throw new RuntimeException("SimReporterService getInstance NULL.");
            }
            C1475000oUE.LJIIIIZZ().ensureNotReachHere(new Exception(), "SimReporterService getInstance NULL.");
        }
        if (LIZ == null) {
            C1481790ofB c1481790ofB = IPlayerEventReportService.LIZ;
            EnumC1481830ofF reporterType = LIZIZ.getReporterType();
            c1481790ofB.getClass();
            IPlayerEventReportService iPlayerEventReportServiceLIZ = C1481790ofB.LIZ(reporterType);
            LIZ = iPlayerEventReportServiceLIZ;
            iPlayerEventReportServiceLIZ.initConfig(LIZIZ);
        }
        return LIZ;
    }
}
