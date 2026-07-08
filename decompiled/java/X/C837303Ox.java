package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomUsRetryCashierConfigModel;

/* JADX INFO: renamed from: X.03Ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C837303Ox {
    public static final PipoEcomUsRetryCashierConfigModel LIZ = new PipoEcomUsRetryCashierConfigModel(false, false);

    public static final PipoEcomUsRetryCashierConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoEcomUsRetryCashierConfigModel pipoEcomUsRetryCashierConfigModel = LIZ;
        PipoEcomUsRetryCashierConfigModel pipoEcomUsRetryCashierConfigModel2 = (PipoEcomUsRetryCashierConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ecom_us_retry_cashier_config", PipoEcomUsRetryCashierConfigModel.class, pipoEcomUsRetryCashierConfigModel);
        return pipoEcomUsRetryCashierConfigModel2 != null ? pipoEcomUsRetryCashierConfigModel2 : pipoEcomUsRetryCashierConfigModel;
    }
}
