package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190280h50 implements InterfaceC0148002o {
    public final String LL;
    public final PoiReviewsApi.PoiReviewEligibleResponse LLILLJJLI;
    public final PoiReviewsApi.PoiReviewStatisticsResponse LLILLL;
    public final AbstractC1623806Xk<PoiReviewsApi.PoiReviewListResponse> LLILZ;
    public final String LLILZIL;

    public C1190280h50() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190280h50)) {
            return false;
        }
        C1190280h50 c1190280h50 = (C1190280h50) obj;
        return Intrinsics.LJFF(this.LL, c1190280h50.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1190280h50.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1190280h50.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1190280h50.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1190280h50.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (poiReviewEligibleResponse == null ? 0 : poiReviewEligibleResponse.hashCode())) * 31;
        PoiReviewsApi.PoiReviewStatisticsResponse poiReviewStatisticsResponse = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (poiReviewStatisticsResponse == null ? 0 : poiReviewStatisticsResponse.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        String str2 = this.LLILZIL;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiReviewsLandingState(name=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eligibleResponse=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reviewStatistics=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", reviewListResponse=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", collectInfo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1190280h50(int i) {
        this(null, null, null, C491101vh.LIZ, null);
    }

    public C1190280h50(String str, PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse, PoiReviewsApi.PoiReviewStatisticsResponse poiReviewStatisticsResponse, AbstractC1623806Xk<PoiReviewsApi.PoiReviewListResponse> abstractC1623806Xk, String str2) {
        this.LL = str;
        this.LLILLJJLI = poiReviewEligibleResponse;
        this.LLILLL = poiReviewStatisticsResponse;
        this.LLILZ = abstractC1623806Xk;
        this.LLILZIL = str2;
    }

    public static C1190280h50 LIZ(C1190280h50 c1190280h50, String str, PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse, PoiReviewsApi.PoiReviewStatisticsResponse poiReviewStatisticsResponse, AbstractC1623806Xk abstractC1623806Xk, String str2, int i) {
        String str3 = str2;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        PoiReviewsApi.PoiReviewStatisticsResponse poiReviewStatisticsResponse2 = poiReviewStatisticsResponse;
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse2 = poiReviewEligibleResponse;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c1190280h50.LL;
        }
        if ((i & 2) != 0) {
            poiReviewEligibleResponse2 = c1190280h50.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            poiReviewStatisticsResponse2 = c1190280h50.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk2 = c1190280h50.LLILZ;
        }
        if ((i & 16) != 0) {
            str3 = c1190280h50.LLILZIL;
        }
        c1190280h50.getClass();
        return new C1190280h50(str4, poiReviewEligibleResponse2, poiReviewStatisticsResponse2, abstractC1623806Xk2, str3);
    }
}
