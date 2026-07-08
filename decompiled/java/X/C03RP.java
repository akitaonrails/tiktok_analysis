package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.BNPLActivateModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;

/* JADX INFO: renamed from: X.03RP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RP {
    public static final BNPLActivateModel LIZ = new BNPLActivateModel(false, null, false, 0, false, false, false, false, false, false, false, false, false, 8191, null);

    public static final BNPLActivateModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BNPLActivateModel bNPLActivateModel = LIZ;
        BNPLActivateModel bNPLActivateModel2 = (BNPLActivateModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_payment_bnpl_activate_config", BNPLActivateModel.class, bNPLActivateModel);
        return bNPLActivateModel2 != null ? bNPLActivateModel2 : bNPLActivateModel;
    }

    public static final boolean LIZ(PaymentMethod paymentMethod) {
        if (paymentMethod == null || !LIZIZ().enable) {
            return false;
        }
        if (!C13LP.LJJJJ(paymentMethod.id, LIZIZ().pmList)) {
            return false;
        }
        return true;
    }
}
