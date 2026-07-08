package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentNeedFinishPaymentDeeplinkConfigModel;
import java.util.Collections;

/* JADX INFO: renamed from: X.03PU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03PU {
    public static final EcPaymentNeedFinishPaymentDeeplinkConfigModel LIZ = new EcPaymentNeedFinishPaymentDeeplinkConfigModel(null, false, false, 0, null, null, Collections.singletonList("pm_pi_ew_aupay_c_r"), "aweme://ec", 63, null);

    public static final String LIZLLL() {
        String str = LJ().backSchema;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final EcPaymentNeedFinishPaymentDeeplinkConfigModel LJ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPaymentNeedFinishPaymentDeeplinkConfigModel ecPaymentNeedFinishPaymentDeeplinkConfigModel = LIZ;
        EcPaymentNeedFinishPaymentDeeplinkConfigModel ecPaymentNeedFinishPaymentDeeplinkConfigModel2 = (EcPaymentNeedFinishPaymentDeeplinkConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_payment_need_finish_payment_deeplink_config", EcPaymentNeedFinishPaymentDeeplinkConfigModel.class, ecPaymentNeedFinishPaymentDeeplinkConfigModel);
        return ecPaymentNeedFinishPaymentDeeplinkConfigModel2 != null ? ecPaymentNeedFinishPaymentDeeplinkConfigModel2 : ecPaymentNeedFinishPaymentDeeplinkConfigModel;
    }

    public static final boolean LIZ(String str) {
        if (C13LP.LJJJJ(str, LJ().supportedMethods) && LJ().needPoll) {
            C03VQ.LIZ.getClass();
            if (C03VQ.LJIIJ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(String str) {
        if (C13LP.LJJJJ(str, LJ().supportedMethods) && LJ().enable) {
            C03VQ.LIZ.getClass();
            if (C03VQ.LJIIJ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZJ(String str) {
        if (C13LP.LJJJJ(str, LJ().supportedMethods) && LJ().needPoll) {
            return true;
        }
        return false;
    }
}
