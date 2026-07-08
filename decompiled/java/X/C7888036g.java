package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PlanLevelClarificationModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;

/* JADX INFO: renamed from: X.036g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7888036g {
    public static final PlanLevelClarificationModel LIZ;

    static {
        new C7888036g();
        LIZ = new PlanLevelClarificationModel(false, null, 3, null);
    }

    public static final boolean LIZ(PaymentMethod paymentMethod) {
        String str;
        if (paymentMethod == null || (str = paymentMethod.id) == null) {
            return false;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PlanLevelClarificationModel planLevelClarificationModel = LIZ;
        PlanLevelClarificationModel planLevelClarificationModel2 = (PlanLevelClarificationModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_enable_plan_level_clarification", PlanLevelClarificationModel.class, planLevelClarificationModel);
        if (planLevelClarificationModel2 != null) {
            planLevelClarificationModel = planLevelClarificationModel2;
        }
        if (!planLevelClarificationModel.enable || !planLevelClarificationModel.allowPaymentMethodIds.contains(str)) {
            return false;
        }
        return true;
    }
}
