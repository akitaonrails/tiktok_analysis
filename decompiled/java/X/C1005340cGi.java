package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdProductCarousel;
import com.ss.android.ugc.aweme.feed.model.search.SearchCarouselAdsProductInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0cGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005340cGi {
    public static final List<C03IT> LIZ(Aweme aweme) {
        AwemeSearchAdModel searchAdInfo;
        SearchAdProductCarousel searchAdProductCarousel;
        List<SearchCarouselAdsProductInfo> productList;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (searchAdProductCarousel = searchAdInfo.productCarousel) != null && (productList = searchAdProductCarousel.getProductList()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(productList, 10));
            Iterator<SearchCarouselAdsProductInfo> it2 = productList.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C03IT(it2.next().getUrlList()));
            }
            return arrayList;
        }
        return null;
    }
}
