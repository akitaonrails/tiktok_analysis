package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutOcpOptModel;

/* JADX INFO: renamed from: X.03QK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03QK {
    public static final EcomCheckoutOcpOptModel LIZ = new EcomCheckoutOcpOptModel(false, false, null, false, false, 31, null);

    public static final EcomCheckoutOcpOptModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomCheckoutOcpOptModel ecomCheckoutOcpOptModel = LIZ;
        EcomCheckoutOcpOptModel ecomCheckoutOcpOptModel2 = (EcomCheckoutOcpOptModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_checkout_ocp_opt", EcomCheckoutOcpOptModel.class, ecomCheckoutOcpOptModel);
        return ecomCheckoutOcpOptModel2 != null ? ecomCheckoutOcpOptModel2 : ecomCheckoutOcpOptModel;
    }
}
