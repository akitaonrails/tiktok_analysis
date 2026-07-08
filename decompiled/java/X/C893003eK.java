package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.ab.PipoCheckoutBraintreePaypalConfigModel;

/* JADX INFO: renamed from: X.03eK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C893003eK {
    public static final PipoCheckoutBraintreePaypalConfigModel LIZ = new PipoCheckoutBraintreePaypalConfigModel(false, "production_6mj39zbn_qbs7xcc9zjqb4fbq");

    public static final PipoCheckoutBraintreePaypalConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoCheckoutBraintreePaypalConfigModel pipoCheckoutBraintreePaypalConfigModel = LIZ;
        PipoCheckoutBraintreePaypalConfigModel pipoCheckoutBraintreePaypalConfigModel2 = (PipoCheckoutBraintreePaypalConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_checkout_braintree_paypal_config", PipoCheckoutBraintreePaypalConfigModel.class, pipoCheckoutBraintreePaypalConfigModel);
        return pipoCheckoutBraintreePaypalConfigModel2 != null ? pipoCheckoutBraintreePaypalConfigModel2 : pipoCheckoutBraintreePaypalConfigModel;
    }
}
