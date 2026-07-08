package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutAnchoredPaymentMethodConfigModel;

/* JADX INFO: renamed from: X.03XU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03XU {
    public static final EcomCheckoutAnchoredPaymentMethodConfigModel LIZ = new EcomCheckoutAnchoredPaymentMethodConfigModel(true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, C1697810uHb.LJIIJJI("pm_pi_ew_pipocredit_c_d", "pm_pi_ew_pipowallet_c_d"), true, true, true, 3, true, 0.73f, 0.9f, true, true, true, true, true, true, true, true, true, true);

    public static final boolean LIZ() {
        return LIZIZ().enableResort;
    }

    public static final EcomCheckoutAnchoredPaymentMethodConfigModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomCheckoutAnchoredPaymentMethodConfigModel ecomCheckoutAnchoredPaymentMethodConfigModel = LIZ;
        EcomCheckoutAnchoredPaymentMethodConfigModel ecomCheckoutAnchoredPaymentMethodConfigModel2 = (EcomCheckoutAnchoredPaymentMethodConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_checkout_anchored_payment_method_config", EcomCheckoutAnchoredPaymentMethodConfigModel.class, ecomCheckoutAnchoredPaymentMethodConfigModel);
        return ecomCheckoutAnchoredPaymentMethodConfigModel2 != null ? ecomCheckoutAnchoredPaymentMethodConfigModel2 : ecomCheckoutAnchoredPaymentMethodConfigModel;
    }
}
