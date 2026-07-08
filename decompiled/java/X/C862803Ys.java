package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentBnplOptConfigModel;

/* JADX INFO: renamed from: X.03Ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C862803Ys {
    public static final EcPaymentBnplOptConfigModel LIZ = new EcPaymentBnplOptConfigModel(true, false, false);

    public static final EcPaymentBnplOptConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPaymentBnplOptConfigModel ecPaymentBnplOptConfigModel = LIZ;
        EcPaymentBnplOptConfigModel ecPaymentBnplOptConfigModel2 = (EcPaymentBnplOptConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_payment_bnpl_opt_config", EcPaymentBnplOptConfigModel.class, ecPaymentBnplOptConfigModel);
        return ecPaymentBnplOptConfigModel2 != null ? ecPaymentBnplOptConfigModel2 : ecPaymentBnplOptConfigModel;
    }
}
