package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutPaymentCodeOrderRefactorConfigModel;

/* JADX INFO: renamed from: X.03Ot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C836903Ot {
    public static final EcomCheckoutPaymentCodeOrderRefactorConfigModel LIZ = new EcomCheckoutPaymentCodeOrderRefactorConfigModel(null, 1, null);

    public static final EcomCheckoutPaymentCodeOrderRefactorConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomCheckoutPaymentCodeOrderRefactorConfigModel ecomCheckoutPaymentCodeOrderRefactorConfigModel = LIZ;
        EcomCheckoutPaymentCodeOrderRefactorConfigModel ecomCheckoutPaymentCodeOrderRefactorConfigModel2 = (EcomCheckoutPaymentCodeOrderRefactorConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_checkout_payment_code_order_refactor_config", EcomCheckoutPaymentCodeOrderRefactorConfigModel.class, ecomCheckoutPaymentCodeOrderRefactorConfigModel);
        return ecomCheckoutPaymentCodeOrderRefactorConfigModel2 != null ? ecomCheckoutPaymentCodeOrderRefactorConfigModel2 : ecomCheckoutPaymentCodeOrderRefactorConfigModel;
    }
}
