package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentOriginDataConfigItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionConfigModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03S0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03S0 {
    public static final EcomPaymentPromotionMergeModel LIZ;

    static {
        Boolean bool = Boolean.FALSE;
        LIZ = new EcomPaymentPromotionMergeModel(C1697810uHb.LJIIJJI(new EcomPaymentOriginDataConfigItem("pm_pi_ew_paypal_all", "pm_pi_ew_paypal_c_r", "pm_pi_ew_paypal_c_d", bool), new EcomPaymentOriginDataConfigItem("pm_pi_ew_gcash_all", "pm_pi_ew_gcash_c_r", "pm_pi_ew_gcash_c_d", bool)), new EcomPaymentPromotionConfigModel(C1697810uHb.LJIIJJI("pm_pi_ew_paypal_c_r", "pm_pi_ew_gcash_c_r"), bool), Collections.singletonList("pm_pi_ew_gcash_c_d"));
    }

    public static final EcomPaymentPromotionMergeModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel = LIZ;
        EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel2 = (EcomPaymentPromotionMergeModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_payment_promotion_merge_config", EcomPaymentPromotionMergeModel.class, ecomPaymentPromotionMergeModel);
        return ecomPaymentPromotionMergeModel2 != null ? ecomPaymentPromotionMergeModel2 : ecomPaymentPromotionMergeModel;
    }

    public static boolean LIZ(String str) {
        List<String> list;
        EcomPaymentPromotionConfigModel ecomPaymentPromotionConfigModel = LIZIZ().promotionConfigs;
        if (ecomPaymentPromotionConfigModel != null && (list = ecomPaymentPromotionConfigModel.extraPromotionFlowPmids) != null && C13LP.LJJJJ(str, list)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(PaymentMethod paymentMethod) {
        List<EcomPaymentOriginDataConfigItem> list;
        EcomPaymentOriginDataConfigItem next;
        String str;
        List<String> list2;
        boolean z;
        if (paymentMethod == null || (list = LIZIZ().paymentOriginDataConfigs) == null) {
            return false;
        }
        Iterator<EcomPaymentOriginDataConfigItem> it2 = list.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!Intrinsics.LJFF(next.displayPmId, paymentMethod.id));
        EcomPaymentOriginDataConfigItem ecomPaymentOriginDataConfigItem = next;
        if (ecomPaymentOriginDataConfigItem == null || (str = ecomPaymentOriginDataConfigItem.mergedPmId) == null || (list2 = LIZIZ().bindPayConfigs) == null) {
            return false;
        }
        if (!list2.isEmpty()) {
            Iterator<String> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next(), str)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (boolValueOf == null || !boolValueOf.booleanValue()) {
            return false;
        }
        return true;
    }
}
