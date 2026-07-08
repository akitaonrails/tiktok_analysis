package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BigSaleTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.FlashDealTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ShopBagTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SingleTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SizeChartTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;

/* JADX INFO: renamed from: X.0v7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729950v7R {
    public static TemplateItem LIZ(RespTemplateItem respTemplateItem) {
        Integer num = respTemplateItem.type;
        if (num != null) {
            if (num.intValue() == 1) {
                MultiTextTemplateItem.Companion.getClass();
                return C1730360v86.LIZ(respTemplateItem, true);
            }
            if (num.intValue() == 2) {
                SingleTextTemplateItem.Companion.getClass();
                return C1730390v89.LIZ(respTemplateItem, true);
            }
            if (num.intValue() == 3) {
                ProductTemplateItem.Companion.getClass();
                return C1730370v87.LIZ(respTemplateItem, true);
            }
            if (num.intValue() == 4) {
                DiscountTemplateItem.Companion.getClass();
                return C1730330v83.LIZ(respTemplateItem, true);
            }
            if (num.intValue() == 5) {
                SizeChartTemplateItem.Companion.getClass();
                return C1730510v8L.LIZ(respTemplateItem, true);
            }
            if (num.intValue() == 6) {
                ShopBagTemplateItem.Companion.getClass();
                return C1730380v88.LIZ(respTemplateItem, true);
            }
            if (num.intValue() == 7) {
                BigSaleTemplateItem.Companion.getClass();
                return C1730320v82.LIZ(respTemplateItem, true);
            }
            if (num.intValue() == 8) {
                FlashDealTemplateItem.Companion.getClass();
                return C1730340v84.LIZ(respTemplateItem, true);
            }
            if (num.intValue() == 9) {
                LiveGiveawayTemplateItem.Companion.getClass();
                return C1730350v85.LIZ(respTemplateItem, true);
            }
            return null;
        }
        return null;
    }
}
