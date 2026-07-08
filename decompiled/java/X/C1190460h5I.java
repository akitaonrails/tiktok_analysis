package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190460h5I implements InterfaceC111300bX {
    public final String LL;
    public final Integer LLILLJJLI;
    public final PoiReviewsApi.PoiReviewListResponse LLILLL;
    public final PoiReviewsLandingViewModel LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190460h5I)) {
            return false;
        }
        C1190460h5I c1190460h5I = (C1190460h5I) obj;
        return Intrinsics.LJFF(this.LL, c1190460h5I.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1190460h5I.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1190460h5I.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1190460h5I.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (poiReviewListResponse == null ? 0 : poiReviewListResponse.hashCode())) * 31;
        PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLILZ;
        return iHashCode3 + (poiReviewsLandingViewModel != null ? poiReviewsLandingViewModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiReviewHierarchyData(poiId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tabId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", globalVM=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1190460h5I(String str, Integer num, PoiReviewsApi.PoiReviewListResponse poiReviewListResponse, PoiReviewsLandingViewModel poiReviewsLandingViewModel) {
        this.LL = str;
        this.LLILLJJLI = num;
        this.LLILLL = poiReviewListResponse;
        this.LLILZ = poiReviewsLandingViewModel;
    }
}
