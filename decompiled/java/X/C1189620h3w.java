package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189620h3w implements InterfaceC0148002o {
    public final C627660Ojc<PoiReviewsApi.PoiReviewModel> LL;
    public final List<PoiReviewsApi.PoiReviewModel> LLILLJJLI;
    public final Boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final PoiReviewsApi.PoiReviewSummaryModel LLILZLL;
    public final List<PoiReviewsApi.PoiReviewSummaryModel> LLIZ;
    public final Aweme LLIZLLLIL;
    public final String LLJ;
    public final AbstractC1623806Xk<PoiReviewsApi.PoiReviewListResponse> LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1189620h3w)) {
            return false;
        }
        C1189620h3w c1189620h3w = (C1189620h3w) obj;
        return Intrinsics.LJFF(this.LL, c1189620h3w.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1189620h3w.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1189620h3w.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1189620h3w.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1189620h3w.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1189620h3w.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1189620h3w.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1189620h3w.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1189620h3w.LLJ) && Intrinsics.LJFF(this.LLJI, c1189620h3w.LLJI);
    }

    public final int hashCode() {
        C627660Ojc<PoiReviewsApi.PoiReviewModel> c627660Ojc = this.LL;
        int iHashCode = (c627660Ojc == null ? 0 : c627660Ojc.hashCode()) * 31;
        List<PoiReviewsApi.PoiReviewModel> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (poiReviewSummaryModel == null ? 0 : poiReviewSummaryModel.hashCode())) * 31;
        List<PoiReviewsApi.PoiReviewSummaryModel> list2 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Aweme aweme = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str3 = this.LLJ;
        return ((iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailReviewsState(listStateInState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reviews=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eligible=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", eligibleExtraInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", collectInfo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", thirdPartySummary=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", reviewsResp=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1189620h3w(C627660Ojc<PoiReviewsApi.PoiReviewModel> c627660Ojc, List<PoiReviewsApi.PoiReviewModel> list, Boolean bool, String str, String str2, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, List<PoiReviewsApi.PoiReviewSummaryModel> list2, Aweme aweme, String str3, AbstractC1623806Xk<PoiReviewsApi.PoiReviewListResponse> abstractC1623806Xk) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = list;
        this.LLILLL = bool;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = poiReviewSummaryModel;
        this.LLIZ = list2;
        this.LLIZLLLIL = aweme;
        this.LLJ = str3;
        this.LLJI = abstractC1623806Xk;
    }

    public static C1189620h3w LIZ(C1189620h3w c1189620h3w, C627660Ojc c627660Ojc, List list, Boolean bool, String str, String str2, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, List list2, Aweme aweme, String str3, AbstractC1623806Xk abstractC1623806Xk, int i) {
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        String str4 = str3;
        Aweme aweme2 = aweme;
        List list3 = list2;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2 = poiReviewSummaryModel;
        String str5 = str2;
        String str6 = str;
        Boolean bool2 = bool;
        List list4 = list;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1189620h3w.LL;
        }
        if ((i & 2) != 0) {
            list4 = c1189620h3w.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            bool2 = c1189620h3w.LLILLL;
        }
        if ((i & 8) != 0) {
            str6 = c1189620h3w.LLILZ;
        }
        if ((i & 16) != 0) {
            str5 = c1189620h3w.LLILZIL;
        }
        if ((i & 32) != 0) {
            poiReviewSummaryModel2 = c1189620h3w.LLILZLL;
        }
        if ((i & 64) != 0) {
            list3 = c1189620h3w.LLIZ;
        }
        if ((i & 128) != 0) {
            aweme2 = c1189620h3w.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            str4 = c1189620h3w.LLJ;
        }
        if ((i & 512) != 0) {
            abstractC1623806Xk2 = c1189620h3w.LLJI;
        }
        c1189620h3w.getClass();
        return new C1189620h3w(c627660Ojc2, list4, bool2, str6, str5, poiReviewSummaryModel2, list3, aweme2, str4, abstractC1623806Xk2);
    }
}
