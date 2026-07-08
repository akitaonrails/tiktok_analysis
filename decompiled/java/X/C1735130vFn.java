package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.compliance.EcComplianceConfigModel;

/* JADX INFO: renamed from: X.0vFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735130vFn {
    public static final EcComplianceConfigModel LIZ = new EcComplianceConfigModel(null, null, null, null, null, null, null, null);

    public static final EcComplianceConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcComplianceConfigModel ecComplianceConfigModel = LIZ;
        EcComplianceConfigModel ecComplianceConfigModel2 = (EcComplianceConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_compliance_config", EcComplianceConfigModel.class, ecComplianceConfigModel);
        return ecComplianceConfigModel2 != null ? ecComplianceConfigModel2 : ecComplianceConfigModel;
    }
}
