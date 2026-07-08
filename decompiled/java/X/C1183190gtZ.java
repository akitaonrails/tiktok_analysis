package X;

import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailFeedItemData;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiReviewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183190gtZ extends AbstractC1183180gtY {
    public final PoiRecommendFeatureDetailFeedItemData LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1183190gtZ) && Intrinsics.LJFF(this.LL, ((C1183190gtZ) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureDetailReviewNoImagePowerItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183190gtZ(PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData) {
        this.LL = poiRecommendFeatureDetailFeedItemData;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        if (interfaceC1891350zJl instanceof C1183190gtZ) {
            PoiReviewModel poiReviewModel = this.LL.review;
            String str2 = null;
            if (poiReviewModel != null) {
                str = poiReviewModel.reviewId;
            } else {
                str = null;
            }
            PoiReviewModel poiReviewModel2 = ((C1183190gtZ) interfaceC1891350zJl).LL.review;
            if (poiReviewModel2 != null) {
                str2 = poiReviewModel2.reviewId;
            }
            if (Intrinsics.LJFF(str, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
