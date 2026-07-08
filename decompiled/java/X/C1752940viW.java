package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CoverData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopProductData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend.ShopRecommendVO;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0viW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752940viW {
    public static final void LIZ(ShopRecommendVO shopRecommendVO) {
        List<Feed> list;
        CoverData coverData;
        CommonFeedData commonFeedData = shopRecommendVO.shopRecommendData;
        if (commonFeedData != null && (list = commonFeedData.feedList) != null) {
            Iterator<Feed> it2 = list.iterator();
            while (it2.hasNext()) {
                ShopProductData shopProductData = it2.next().shopProduct;
                if (shopProductData != null && (coverData = shopProductData.cover) != null && coverData.image != null) {
                    Image image = shopProductData.cover.image;
                    EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.PDP_SHOP_RECOMMEND_PRODUCT;
                    C1334210kp9.LIZ(image, enumC1769850w9n, enumC1769850w9n, null, null, null, 248);
                }
            }
        }
    }
}
