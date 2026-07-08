package X;

import com.ss.android.ugc.aweme.poi.detail.cells.AddressInfo;
import com.ss.android.ugc.aweme.poi.detail.cells.FeedProductInfo;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.slash.cell.arc.Padding;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ghF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175550ghF {
    public static final PoiCardCellData LIZ(PoiGeneralCard poiGeneralCard, Padding padding, Map<String, PoiDetailTagStyle> map, boolean z, String str, String str2) {
        long jLongValue;
        FeedProductInfo productInfo;
        String poiId = poiGeneralCard.getPoiId();
        String coverImg = poiGeneralCard.getCoverImg();
        String poiName = poiGeneralCard.getPoiName();
        String reviewScore = poiGeneralCard.getReviewScore();
        String reviewMaxScore = poiGeneralCard.getReviewMaxScore();
        Long reviewCount = poiGeneralCard.getReviewCount();
        if (reviewCount != null) {
            jLongValue = reviewCount.longValue();
        } else {
            jLongValue = 0;
        }
        PoiDetailTag upperTag = poiGeneralCard.getUpperTag();
        String categoryName = poiGeneralCard.getCategoryName();
        AddressInfo addressInfo = poiGeneralCard.getAddressInfo();
        List<PoiDetailTag> poiTags = poiGeneralCard.getPoiTags();
        if (z) {
            productInfo = poiGeneralCard.getProductInfo();
        } else {
            productInfo = null;
        }
        return new PoiCardCellData(poiId, coverImg, poiName, reviewScore, reviewMaxScore, jLongValue, upperTag, categoryName, addressInfo, null, poiTags, productInfo, map, poiGeneralCard.getCityCode(), poiGeneralCard.getTypeLevel(), poiGeneralCard.getRegionCode(), poiGeneralCard.getCollectInfo(), poiGeneralCard.getFormattedAddress(), poiGeneralCard.isCollected(), poiGeneralCard.isClaimed(), null, poiGeneralCard.getTtKeyCategory(), poiGeneralCard.getPoiStatus(), poiGeneralCard.getRegionLevel(), poiGeneralCard.getNoRating(), str, str2, padding);
    }
}
