package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190880h5y implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;
    public final PoiReviewsApi.PoiReviewListResponse LLILLL;
    public final PoiReviewsLandingViewModel LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190880h5y)) {
            return false;
        }
        C1190880h5y c1190880h5y = (C1190880h5y) obj;
        return Intrinsics.LJFF(this.LL, c1190880h5y.LL) && this.LLILLJJLI == c1190880h5y.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1190880h5y.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1190880h5y.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = this.LLILLL;
        int iHashCode2 = (iHashCode + (poiReviewListResponse == null ? 0 : poiReviewListResponse.hashCode())) * 31;
        PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLILZ;
        return iHashCode2 + (poiReviewsLandingViewModel != null ? poiReviewsLandingViewModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiReviewsContentCellData(poiId=");
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

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1190880h5y(String str, int i, PoiReviewsApi.PoiReviewListResponse poiReviewListResponse, PoiReviewsLandingViewModel poiReviewsLandingViewModel) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = poiReviewListResponse;
        this.LLILZ = poiReviewsLandingViewModel;
    }
}
