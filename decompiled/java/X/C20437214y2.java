package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.ActivityDisplay;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.ExpansionVoucher;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.HighlightData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PromotionDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.VoucherInfo;

/* JADX INFO: renamed from: X.14y2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20437214y2 {
    public static final String LIZ(HighlightData highlightData) {
        ExpansionVoucher expansionVoucher;
        VoucherInfo voucherInfo;
        PromotionDaInfo promotionDaInfo;
        String str;
        PromotionDaInfo promotionDaInfo2;
        String str2;
        PromotionDaInfo promotionDaInfo3;
        String str3;
        Integer num = highlightData.promotionType;
        if (num != null) {
            if (num.intValue() == 0) {
                VoucherInfo voucherInfo2 = highlightData.voucher;
                if (voucherInfo2 != null && (promotionDaInfo3 = (PromotionDaInfo) voucherInfo2.LIZ.getValue()) != null && (str3 = promotionDaInfo3.promotionContainerType) != null) {
                    return str3;
                }
            } else if (num.intValue() == 1) {
                ActivityDisplay activityDisplay = highlightData.activity;
                if (activityDisplay != null && (promotionDaInfo2 = (PromotionDaInfo) activityDisplay.LIZ.getValue()) != null && (str2 = promotionDaInfo2.promotionContainerType) != null) {
                    return str2;
                }
            } else if (num.intValue() == 2 && (expansionVoucher = highlightData.expansionVoucher) != null && (voucherInfo = expansionVoucher.finalVoucherInfo) != null && (promotionDaInfo = (PromotionDaInfo) voucherInfo.LIZ.getValue()) != null && (str = promotionDaInfo.promotionContainerType) != null) {
                return str;
            }
        }
        return "";
    }
}
