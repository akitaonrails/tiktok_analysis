package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190250h4x implements InterfaceC636340Oxc<C1190250h4x, InterfaceC1891350zJl> {
    public final PoiReviewsApi.PoiReviewSummaryModel LL;
    public final List<PoiReviewsApi.PoiReviewSummaryModel> LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final C1193740hAa LLIZ;
    public final PoiReviewsApi.PoiReviewListResponse LLIZLLLIL;
    public final C627660Ojc<InterfaceC1891350zJl> LLJ;
    public final List<PoiReviewsApi.PoiReviewTagModel> LLJI;
    public final boolean LLJIJIL;

    public C1190250h4x() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190250h4x)) {
            return false;
        }
        C1190250h4x c1190250h4x = (C1190250h4x) obj;
        return Intrinsics.LJFF(this.LL, c1190250h4x.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1190250h4x.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1190250h4x.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1190250h4x.LLILZ) && this.LLILZIL == c1190250h4x.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1190250h4x.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1190250h4x.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1190250h4x.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1190250h4x.LLJ) && Intrinsics.LJFF(this.LLJI, c1190250h4x.LLJI) && this.LLJIJIL == c1190250h4x.LLJIJIL;
    }

    public final int hashCode() {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.LL;
        int iHashCode = (poiReviewSummaryModel == null ? 0 : poiReviewSummaryModel.hashCode()) * 31;
        List<PoiReviewsApi.PoiReviewSummaryModel> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        String str3 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C1193740hAa c1193740hAa = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c1193740hAa == null ? 0 : c1193740hAa.hashCode())) * 31;
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = this.LLIZLLLIL;
        int iHashCode7 = (((iHashCode6 + (poiReviewListResponse == null ? 0 : poiReviewListResponse.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        List<PoiReviewsApi.PoiReviewTagModel> list2 = this.LLJI;
        return ((iHashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJIJIL);
    }

    public final String toString() {
        return "PoiReviewsListState(summary=" + this.LL + ", thirdPartySummary=" + this.LLILLJJLI + ", collectInfo=" + this.LLILLL + ", name=" + this.LLILZ + ", showFoldedTipsInFooter=" + this.LLILZIL + ", logId=" + this.LLILZLL + ", prfNetworkData=" + this.LLIZ + ", reviewListResponse=" + this.LLIZLLLIL + ", listState=" + this.LLJ + ", tags=" + this.LLJI + ", shouldShowEmptyPage=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LLJ;
    }

    public /* synthetic */ C1190250h4x(int i) {
        this(null, null, null, null, false, null, null, null, new C627660Ojc(null, null, null, null, 15), null, false);
    }

    public C1190250h4x(PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, List<PoiReviewsApi.PoiReviewSummaryModel> list, String str, String str2, boolean z, String str3, C1193740hAa c1193740hAa, PoiReviewsApi.PoiReviewListResponse poiReviewListResponse, C627660Ojc<InterfaceC1891350zJl> c627660Ojc, List<PoiReviewsApi.PoiReviewTagModel> list2, boolean z2) {
        this.LL = poiReviewSummaryModel;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = z;
        this.LLILZLL = str3;
        this.LLIZ = c1193740hAa;
        this.LLIZLLLIL = poiReviewListResponse;
        this.LLJ = c627660Ojc;
        this.LLJI = list2;
        this.LLJIJIL = z2;
    }

    public static C1190250h4x LIZ(C1190250h4x c1190250h4x, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, List list, String str, String str2, boolean z, String str3, C1193740hAa c1193740hAa, PoiReviewsApi.PoiReviewListResponse poiReviewListResponse, C627660Ojc c627660Ojc, List list2, boolean z2, int i) {
        boolean z3 = z2;
        List list3 = list2;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse2 = poiReviewListResponse;
        C1193740hAa c1193740hAa2 = c1193740hAa;
        String str4 = str3;
        boolean z4 = z;
        String str5 = str2;
        String str6 = str;
        List list4 = list;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2 = poiReviewSummaryModel;
        if ((i & 1) != 0) {
            poiReviewSummaryModel2 = c1190250h4x.LL;
        }
        if ((i & 2) != 0) {
            list4 = c1190250h4x.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str6 = c1190250h4x.LLILLL;
        }
        if ((i & 8) != 0) {
            str5 = c1190250h4x.LLILZ;
        }
        if ((i & 16) != 0) {
            z4 = c1190250h4x.LLILZIL;
        }
        if ((i & 32) != 0) {
            str4 = c1190250h4x.LLILZLL;
        }
        if ((i & 64) != 0) {
            c1193740hAa2 = c1190250h4x.LLIZ;
        }
        if ((i & 128) != 0) {
            poiReviewListResponse2 = c1190250h4x.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c627660Ojc2 = c1190250h4x.LLJ;
        }
        if ((i & 512) != 0) {
            list3 = c1190250h4x.LLJI;
        }
        if ((i & 1024) != 0) {
            z3 = c1190250h4x.LLJIJIL;
        }
        c1190250h4x.getClass();
        return new C1190250h4x(poiReviewSummaryModel2, list4, str6, str5, z4, str4, c1193740hAa2, poiReviewListResponse2, c627660Ojc2, list3, z3);
    }
}
