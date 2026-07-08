package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCheckoutBraintreeConfigSettingsModel;

/* JADX INFO: renamed from: X.03jA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C923003jA {
    public static final PipoCheckoutBraintreeConfigSettingsModel LIZ = new PipoCheckoutBraintreeConfigSettingsModel(Boolean.FALSE, Boolean.TRUE, Boolean.FALSE);

    public static final PipoCheckoutBraintreeConfigSettingsModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoCheckoutBraintreeConfigSettingsModel pipoCheckoutBraintreeConfigSettingsModel = LIZ;
        PipoCheckoutBraintreeConfigSettingsModel pipoCheckoutBraintreeConfigSettingsModel2 = (PipoCheckoutBraintreeConfigSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_checkout_braintree_native_venmo", PipoCheckoutBraintreeConfigSettingsModel.class, pipoCheckoutBraintreeConfigSettingsModel);
        return pipoCheckoutBraintreeConfigSettingsModel2 != null ? pipoCheckoutBraintreeConfigSettingsModel2 : pipoCheckoutBraintreeConfigSettingsModel;
    }
}
