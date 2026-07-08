package Y;

import X.C1407170mip;
import X.C1760620vuu;
import X.C1761680vwc;
import X.EnumC1407150min;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTranslation;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes27.dex */
public class AkS73S1200000_26 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS73S1200000_26 akS73S1200000_26, Object obj) {
        boolean zBooleanValue;
        int iIntValue;
        Integer num;
        ListReviewData listReviewData = (ListReviewData) obj;
        ArrayList arrayList = new ArrayList();
        List<ReviewItemStruct> list = listReviewData.reviewItems;
        if (list != null) {
            C1760620vuu c1760620vuu = (C1760620vuu) akS73S1200000_26.l1;
            String str = akS73S1200000_26.s0;
            Integer num2 = (Integer) akS73S1200000_26.l2;
            for (ReviewItemStruct reviewItemStruct : list) {
                ReviewCardUI reviewCardUI = listReviewData.reviewABTest;
                PlatformLinkInfo platformLinkInfo = listReviewData.platformLinkInfo;
                C1407170mip c1407170mip = EnumC1407150min.Companion;
                ReviewTranslation reviewTranslation = reviewItemStruct.translation;
                if (reviewTranslation != null) {
                    num = reviewTranslation.translationType;
                } else {
                    num = null;
                }
                c1407170mip.getClass();
                c1760620vuu.LJJIJLIJ(reviewItemStruct, arrayList, str, num2, reviewCardUI, platformLinkInfo, C1407170mip.LIZIZ(num));
            }
        }
        Boolean bool = listReviewData.hasMore;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        Integer num3 = listReviewData.nextCursor;
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = 0;
        }
        return new Pair(arrayList, new C1761680vwc(zBooleanValue, iIntValue));
    }

    public static final Object apply$1(AkS73S1200000_26 akS73S1200000_26, Object obj) {
        boolean zBooleanValue;
        int iIntValue;
        ListShopReviewData listShopReviewData = (ListShopReviewData) obj;
        ArrayList arrayList = new ArrayList();
        List<ShopReviewItemStruct> list = listShopReviewData.reviewItems;
        if (list != null) {
            C1760620vuu c1760620vuu = (C1760620vuu) akS73S1200000_26.l1;
            String str = akS73S1200000_26.s0;
            Integer num = (Integer) akS73S1200000_26.l2;
            Iterator<ShopReviewItemStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                ReviewItemStruct reviewItemStruct = it2.next().reviewItemStruct;
                if (reviewItemStruct != null) {
                    c1760620vuu.LJJIJLIJ(reviewItemStruct, arrayList, str, num, listShopReviewData.reviewABTest, null, null);
                }
            }
        }
        Boolean bool = listShopReviewData.hasMore;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        Integer num2 = listShopReviewData.nextCursor;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        return new Pair(arrayList, new C1761680vwc(zBooleanValue, iIntValue));
    }

    public AkS73S1200000_26(C1760620vuu c1760620vuu, String str, Integer num, int i) {
        this.$t = i;
        this.l1 = c1760620vuu;
        this.s0 = str;
        this.l2 = num;
    }
}
