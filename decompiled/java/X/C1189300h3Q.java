package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailFeedItemData;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiReviewModel;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabEntityIdAbility;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0h3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189300h3Q {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Fragment fragment, View view, PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData, String str, String str2, String str3) {
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        PoiRecommendFeatureDetailTabEntityIdAbility poiRecommendFeatureDetailTabEntityIdAbility;
        PoiReviewModel poiReviewModel = poiRecommendFeatureDetailFeedItemData.review;
        if (poiReviewModel == null) {
            return;
        }
        String strLc1 = null;
        if (fragment != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        PageFinder pageFinderVia = PageFinder.via(view);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        if (fragment != null && (poiRecommendFeatureDetailTabEntityIdAbility = (PoiRecommendFeatureDetailTabEntityIdAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), PoiRecommendFeatureDetailTabEntityIdAbility.class, null)) != null) {
            strLc1 = poiRecommendFeatureDetailTabEntityIdAbility.lc1();
        }
        String str4 = poiRecommendFeatureDetailFeedItemData.collectInfo;
        String str5 = poiReviewModel.reviewId;
        c1185430gxB.getClass();
        C1185430gxB.LJJIIZI(strLc1, str4, "review", str, null, str5, str3, str2, interfaceC665370Q7zLJFF, pageFinderVia);
    }

    public static void LIZIZ(Fragment fragment, View view, PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData, int i, String str, String str2) {
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        String strLc1;
        String str3;
        double dDoubleValue;
        String str4;
        int i2;
        long jLongValue;
        int size;
        int length;
        int iIntValue;
        String str5;
        String str6;
        List<PoiReviewsApi.ImageDataModel> list;
        Long l;
        Double d;
        PoiRecommendFeatureDetailTabEntityIdAbility poiRecommendFeatureDetailTabEntityIdAbility;
        PoiReviewModel poiReviewModel = poiRecommendFeatureDetailFeedItemData.review;
        if (poiReviewModel == null) {
            return;
        }
        Integer num = null;
        if (fragment != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        PageFinder pageFinderVia = PageFinder.via(view);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        if (fragment != null && (poiRecommendFeatureDetailTabEntityIdAbility = (PoiRecommendFeatureDetailTabEntityIdAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), PoiRecommendFeatureDetailTabEntityIdAbility.class, null)) != null) {
            strLc1 = poiRecommendFeatureDetailTabEntityIdAbility.lc1();
        } else {
            strLc1 = null;
        }
        String str7 = poiRecommendFeatureDetailFeedItemData.collectInfo;
        Integer numValueOf = Integer.valueOf(i);
        String str8 = poiReviewModel.reviewId;
        c1185430gxB.getClass();
        C1185430gxB.LJJIJ(pageFinderVia, interfaceC665370Q7zLJFF, numValueOf, strLc1, str7, "review", str, null, str8, str2);
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str9 = poiReviewModel.reviewId;
        String str10 = "";
        if (str9 == null) {
            str9 = "";
        }
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = poiReviewModel.author;
        if (poiReviewUserModel == null || (str3 = poiReviewUserModel.userId) == null) {
            str3 = "";
        }
        String str11 = poiReviewModel.poiId;
        if (str11 == null) {
            str11 = "";
        }
        String str12 = poiRecommendFeatureDetailFeedItemData.collectInfo;
        if (str12 != null) {
            str10 = str12;
        }
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel = poiReviewModel.content;
        if (poiReviewContentModel != null && (d = poiReviewContentModel.rating) != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        float f = (float) dDoubleValue;
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel2 = poiReviewModel.content;
        if (poiReviewContentModel2 != null) {
            str4 = poiReviewContentModel2.text;
        } else {
            str4 = null;
        }
        if (str4 != null && !a0.LJJJIL(str4)) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int i3 = i2 ^ 1;
        int i4 = i + 1;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = poiReviewModel.statistics;
        if (poiReviewStatisticsModel != null && (l = poiReviewStatisticsModel.likeCount) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        int i5 = (int) jLongValue;
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel3 = poiReviewModel.content;
        if (poiReviewContentModel3 != null && (list = poiReviewContentModel3.images) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel4 = poiReviewModel.content;
        if (poiReviewContentModel4 != null && (str6 = poiReviewContentModel4.text) != null) {
            length = str6.length();
        } else {
            length = 0;
        }
        Integer num2 = poiReviewModel.source;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel5 = poiReviewModel.content;
        if (poiReviewContentModel5 != null) {
            str5 = poiReviewContentModel5.textLang;
        } else {
            str5 = null;
        }
        boolean zIsAnonymous = poiReviewModel.isAnonymous();
        PoiReviewsApi.PoiReviewStatusModel poiReviewStatusModel = poiReviewModel.status;
        if (poiReviewStatusModel != null) {
            num = poiReviewStatusModel.status;
        }
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIJIIJI(f, i3, i4, i5, size, length, iIntValue, zIsAnonymous ? 1 : 0, pageFinderVia, interfaceC665370Q7zLJFF, 0, num, "poi_detail", str9, str3, str11, str10, null, null, str5, null, null, null, false);
    }
}
