package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.minis.payment.MinisPaymentConfigModel;

/* JADX INFO: renamed from: X.0y10, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841280y10 {
    public static final MinisPaymentConfigModel LIZ = new MinisPaymentConfigModel(30000, 200, null, null, null, null, null, null, null, null, null, 2044, null);

    public static final MinisPaymentConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MinisPaymentConfigModel minisPaymentConfigModel = LIZ;
        MinisPaymentConfigModel minisPaymentConfigModel2 = (MinisPaymentConfigModel) settingsManagerLIZLLL.LJIIIIZZ("minis_payment_config", MinisPaymentConfigModel.class, minisPaymentConfigModel);
        return minisPaymentConfigModel2 != null ? minisPaymentConfigModel2 : minisPaymentConfigModel;
    }
}
