package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EComUsPostBillingAddressModel;

/* JADX INFO: renamed from: X.03ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C869903ab {
    public static final EComUsPostBillingAddressModel LIZ = new EComUsPostBillingAddressModel(false, false);

    public static final EComUsPostBillingAddressModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EComUsPostBillingAddressModel eComUsPostBillingAddressModel = LIZ;
        EComUsPostBillingAddressModel eComUsPostBillingAddressModel2 = (EComUsPostBillingAddressModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_us_post_billing_address", EComUsPostBillingAddressModel.class, eComUsPostBillingAddressModel);
        return eComUsPostBillingAddressModel2 != null ? eComUsPostBillingAddressModel2 : eComUsPostBillingAddressModel;
    }
}
