package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.experiment.BioLinkReportConfig;

/* JADX INFO: renamed from: X.0ikF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254290ikF {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            BioLinkReportConfig bioLinkReportConfig = (BioLinkReportConfig) SettingsManager.LJII("bio_link_report_config", BioLinkReportConfig.class);
            if (bioLinkReportConfig != null) {
                return bioLinkReportConfig.getShowReportJumpTime();
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }
}
