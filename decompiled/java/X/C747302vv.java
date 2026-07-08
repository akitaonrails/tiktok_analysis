package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PriceInfoRequestParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.List;

/* JADX INFO: renamed from: X.02vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C747302vv {
    public static PriceInfoRequestParams LIZ(PaymentInfo paymentInfo, BillInfoData billInfoData, String str) {
        PaymentMethodsData paymentMethodsData;
        Summary summaryLIZIZ;
        List<BillItem> list;
        Price price;
        Price price2;
        C03SE c03se = C03PI.LJIJI;
        String str2 = null;
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        c03se.getClass();
        C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, false, true);
        boolean zBooleanValue = ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue();
        String str3 = (String) c443120HZeLJJJIL.getSecond();
        List list2 = (List) c443120HZeLJJJIL.getThird();
        if (billInfoData != null) {
            summaryLIZIZ = C722002rq.LIZIZ(billInfoData, str3, zBooleanValue, list2, null, str);
        } else {
            summaryLIZIZ = null;
        }
        if (summaryLIZIZ != null) {
            list = summaryLIZIZ.billItems;
            price = summaryLIZIZ.total;
            price2 = summaryLIZIZ.paymentBeforePayPromotion;
            str2 = summaryLIZIZ.invisibleParams;
        } else {
            list = null;
            price = null;
            price2 = null;
        }
        return new PriceInfoRequestParams(list, price, price2, str2);
    }
}
