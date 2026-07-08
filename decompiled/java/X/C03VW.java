package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoExpressCheckoutPaymentResultPageConfigModel;

/* JADX INFO: renamed from: X.03VW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03VW {
    public static final PipoExpressCheckoutPaymentResultPageConfigModel LIZ = new PipoExpressCheckoutPaymentResultPageConfigModel(300, false, null, null, null, false);

    public static final PipoExpressCheckoutPaymentResultPageConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoExpressCheckoutPaymentResultPageConfigModel pipoExpressCheckoutPaymentResultPageConfigModel = LIZ;
        PipoExpressCheckoutPaymentResultPageConfigModel pipoExpressCheckoutPaymentResultPageConfigModel2 = (PipoExpressCheckoutPaymentResultPageConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_express_checkout_payment_result_page_config", PipoExpressCheckoutPaymentResultPageConfigModel.class, pipoExpressCheckoutPaymentResultPageConfigModel);
        return pipoExpressCheckoutPaymentResultPageConfigModel2 != null ? pipoExpressCheckoutPaymentResultPageConfigModel2 : pipoExpressCheckoutPaymentResultPageConfigModel;
    }
}
