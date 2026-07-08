package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h2J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188610h2J {
    public final String LIZ;
    public final String LIZIZ;
    public final PoiReviewsApi.PoiReviewSummaryModel LIZJ;
    public final Long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1188610h2J)) {
            return false;
        }
        C1188610h2J c1188610h2J = (C1188610h2J) obj;
        return Intrinsics.LJFF(this.LIZ, c1188610h2J.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1188610h2J.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1188610h2J.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1188610h2J.LIZLLL) && Intrinsics.LJFF(this.LJ, c1188610h2J.LJ) && Intrinsics.LJFF(this.LJFF, c1188610h2J.LJFF) && this.LJI == c1188610h2J.LJI;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (poiReviewSummaryModel == null ? 0 : poiReviewSummaryModel.hashCode())) * 31;
        Long l = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        return ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiBottomBarInfo(poiName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", headImgUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reviewSummary=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", favCnt=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", categoryName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", locationDesc=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bottomBarStyle=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1188610h2J(String str, String str2, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, Long l, String str3, String str4, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = poiReviewSummaryModel;
        this.LIZLLL = l;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = i;
    }
}
