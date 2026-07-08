package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectApi;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.slash.cell.arc.Padding;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashClickConfig;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashTrackConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ggW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175100ggW {
    public static final List LIZ(int i, String str, List list) {
        String str2;
        String str3;
        String string;
        String string2;
        long jLongValue;
        Boolean bool;
        boolean z;
        Object obj;
        String str4;
        boolean z2;
        Long l;
        Double d;
        Double d2;
        List<String> urlList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                PoiCollectApi.PoiDetail poiDetail = (PoiCollectApi.PoiDetail) obj2;
                if (Intrinsics.LJFF(poiDetail.typeLevel, EnumC1184730gw3.REGIONAL.getTypeCode$poi_release())) {
                    str2 = "poi_regional_card";
                } else if (Intrinsics.LJFF(poiDetail.keyCategory, EnumC1177990glB.HOTEL.getCategory())) {
                    str2 = "poi_hotel_card";
                } else {
                    str2 = "poi_common_card";
                }
                String str5 = poiDetail.poiId;
                UrlModel urlModel = poiDetail.cover;
                if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                    str3 = (String) C13LP.LJJJLL(urlList);
                } else {
                    str3 = null;
                }
                String str6 = poiDetail.poiName;
                PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = poiDetail.poiReviewSummary;
                if (poiReviewSummaryModel != null && (d2 = poiReviewSummaryModel.score) != null) {
                    string = d2.toString();
                } else {
                    string = null;
                }
                PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2 = poiDetail.poiReviewSummary;
                if (poiReviewSummaryModel2 != null && (d = poiReviewSummaryModel2.maxScore) != null) {
                    string2 = Integer.valueOf((int) d.doubleValue()).toString();
                } else {
                    string2 = null;
                }
                PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel3 = poiDetail.poiReviewSummary;
                if (poiReviewSummaryModel3 != null && (l = poiReviewSummaryModel3.totalCount) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                PoiDetailTag poiDetailTag = poiDetail.upperTag;
                String str7 = poiDetail.categoryName;
                String str8 = poiDetail.distance;
                List<PoiDetailTag> list2 = poiDetail.poiDetailTag;
                Map<String, PoiDetailTagStyle> map = poiDetail.poiDetailTagStyleMap;
                String str9 = poiDetail.cityCode;
                String str10 = poiDetail.typeLevel;
                String str11 = poiDetail.regionCode;
                String str12 = poiDetail.collectInfo;
                String str13 = poiDetail.poiAddress;
                Boolean bool2 = poiDetail.isCollected;
                boolean z3 = poiDetail.isClaimed;
                String str14 = poiDetail.detailPagePoiDisplay;
                String str15 = poiDetail.keyCategory;
                int i4 = poiDetail.poiStatus;
                String str16 = poiDetail.regionLevel;
                Padding padding = new Padding(8, 8, 16, 16);
                PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel4 = poiDetail.poiReviewSummary;
                if (poiReviewSummaryModel4 != null) {
                    bool = poiReviewSummaryModel4.noRating;
                } else {
                    bool = null;
                }
                PoiCardCellData poiCardCellData = new PoiCardCellData(str5, str3, str6, string, string2, jLongValue, poiDetailTag, str7, null, str8, list2, null, map, str9, str10, str11, str12, str13, bool2, z3, str14, str15, i4, str16, bool, "fav_poi_image", "profile_page", padding);
                int i5 = i2 + i;
                SlashClickConfig slashClickConfig = new SlashClickConfig(null, C2097608Jq.LJIIIIZZ(new Pair("enter_from", "collection_places"), new Pair("enter_method", "click_item")));
                SlashTrackConfig[] slashTrackConfigArr = new SlashTrackConfig[2];
                Pair[] pairArr = new Pair[2];
                if (poiDetail.poiStatus == 3) {
                    z = true;
                } else {
                    z = false;
                }
                String str17 = CardStruct.IStatusCode.DEFAULT;
                if (z) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[0] = new Pair("is_defunct", obj);
                String str18 = "";
                if (str == null) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                pairArr[1] = new Pair("from_poi_id", str4);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                if (poiDetail.poiDetailTag != null && (!r0.isEmpty())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    mapLJIIJ.put("has_highlight_tag", "1");
                }
                slashTrackConfigArr[0] = new SlashTrackConfig("poi_collection_show", mapLJIIJ, "cell_show");
                Pair[] pairArr2 = new Pair[2];
                if (poiDetail.poiStatus == 3) {
                    str17 = "1";
                }
                pairArr2[0] = new Pair("is_defunct", str17);
                if (str != null) {
                    str18 = str;
                }
                pairArr2[1] = new Pair("from_poi_id", str18);
                Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
                if (poiDetail.poiDetailTag != null && (!r0.isEmpty())) {
                    mapLJIIJ2.put("has_highlight_tag", "1");
                }
                slashTrackConfigArr[1] = new SlashTrackConfig("poi_collection_click", mapLJIIJ2, "cell_click");
                arrayList.add(new C1175980ghw(new SlashCellModel("cell", str2, null, null, null, C1697810uHb.LJIIJJI(slashTrackConfigArr), slashClickConfig, null, i5, poiCardCellData, AFwS256S0000000_18.get$arr$(749)), null, null, 14));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }
}
