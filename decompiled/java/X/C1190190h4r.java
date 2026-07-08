package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0h4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190190h4r implements Serializable {
    public final PoiReviewsApi.PoiReviewStatisticsModel statistics;
    public final PoiReviewsApi.PoiReviewUserStatusModel userStatus;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewLikePayload(statistics=");
        sbLIZ.append(this.statistics);
        sbLIZ.append(", userStatus=");
        sbLIZ.append(this.userStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1190190h4r(PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel, PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel) {
        this.statistics = poiReviewStatisticsModel;
        this.userStatus = poiReviewUserStatusModel;
    }
}
