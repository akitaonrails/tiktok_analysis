package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomReportApplistInRiskModel;

/* JADX INFO: renamed from: X.03SH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03SH {
    public static final PipoEcomReportApplistInRiskModel LIZ = new PipoEcomReportApplistInRiskModel(Boolean.FALSE, null);

    public static final PipoEcomReportApplistInRiskModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoEcomReportApplistInRiskModel pipoEcomReportApplistInRiskModel = LIZ;
        PipoEcomReportApplistInRiskModel pipoEcomReportApplistInRiskModel2 = (PipoEcomReportApplistInRiskModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ecom_report_applist_in_risk", PipoEcomReportApplistInRiskModel.class, pipoEcomReportApplistInRiskModel);
        return pipoEcomReportApplistInRiskModel2 != null ? pipoEcomReportApplistInRiskModel2 : pipoEcomReportApplistInRiskModel;
    }
}
