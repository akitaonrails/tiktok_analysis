package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PipoPaymentPromotionTenureParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.036h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7889036h {
    public static final PipoPaymentPromotionTenureParamModel LIZ;

    static {
        new C7889036h();
        LIZ = new PipoPaymentPromotionTenureParamModel(false, null, 3, null);
    }

    public static final boolean LIZ(String str) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoPaymentPromotionTenureParamModel pipoPaymentPromotionTenureParamModel = LIZ;
        PipoPaymentPromotionTenureParamModel pipoPaymentPromotionTenureParamModel2 = (PipoPaymentPromotionTenureParamModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_payment_promotion_tenure_param", PipoPaymentPromotionTenureParamModel.class, pipoPaymentPromotionTenureParamModel);
        if (pipoPaymentPromotionTenureParamModel2 != null) {
            pipoPaymentPromotionTenureParamModel = pipoPaymentPromotionTenureParamModel2;
        }
        if (!pipoPaymentPromotionTenureParamModel.enableTenure) {
            return false;
        }
        List<String> list = pipoPaymentPromotionTenureParamModel.allowPaymentMethodIds;
        if (!list.isEmpty() && !C13LP.LJJJJ(str, list)) {
            return false;
        }
        return true;
    }
}
