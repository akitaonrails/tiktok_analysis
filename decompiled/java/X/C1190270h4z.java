package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190270h4z implements InterfaceC636340Oxc<C1190270h4z, PoiReviewsApi.PoiReviewModel> {
    public final PoiReviewsApi.PoiReviewSummaryModel LL;
    public final List<PoiReviewsApi.PoiReviewSummaryModel> LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final PoiReviewsApi.PoiReviewEligibleResponse LLILZIL;
    public final boolean LLILZLL;
    public final String LLIZ;
    public final C1193740hAa LLIZLLLIL;
    public final PoiReviewsApi.PoiReviewStatisticsResponse LLJ;
    public final PoiReviewsApi.PoiReviewListResponse LLJI;
    public final C627660Ojc<PoiReviewsApi.PoiReviewModel> LLJIJIL;
    public final List<PoiReviewsApi.PoiReviewTagModel> LLJILJIL;
    public final Aweme LLJILJILJ;
    public Long LLJILLL;

    public C1190270h4z() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190270h4z)) {
            return false;
        }
        C1190270h4z c1190270h4z = (C1190270h4z) obj;
        return Intrinsics.LJFF(this.LL, c1190270h4z.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1190270h4z.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1190270h4z.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1190270h4z.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1190270h4z.LLILZIL) && this.LLILZLL == c1190270h4z.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1190270h4z.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1190270h4z.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1190270h4z.LLJ) && Intrinsics.LJFF(this.LLJI, c1190270h4z.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1190270h4z.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1190270h4z.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1190270h4z.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1190270h4z.LLJILLL);
    }

    public final int hashCode() {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.LL;
        int iHashCode = (poiReviewSummaryModel == null ? 0 : poiReviewSummaryModel.hashCode()) * 31;
        List<PoiReviewsApi.PoiReviewSummaryModel> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse = this.LLILZIL;
        int iHashCode5 = (((iHashCode4 + (poiReviewEligibleResponse == null ? 0 : poiReviewEligibleResponse.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        String str3 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C1193740hAa c1193740hAa = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (c1193740hAa == null ? 0 : c1193740hAa.hashCode())) * 31;
        PoiReviewsApi.PoiReviewStatisticsResponse poiReviewStatisticsResponse = this.LLJ;
        int iHashCode8 = (iHashCode7 + (poiReviewStatisticsResponse == null ? 0 : poiReviewStatisticsResponse.hashCode())) * 31;
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = this.LLJI;
        int iHashCode9 = (((iHashCode8 + (poiReviewListResponse == null ? 0 : poiReviewListResponse.hashCode())) * 31) + this.LLJIJIL.hashCode()) * 31;
        List<PoiReviewsApi.PoiReviewTagModel> list2 = this.LLJILJIL;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Aweme aweme = this.LLJILJILJ;
        int iHashCode11 = (iHashCode10 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Long l = this.LLJILLL;
        return iHashCode11 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "PoiCommentReviewListState(summary=" + this.LL + ", thirdPartySummary=" + this.LLILLJJLI + ", collectInfo=" + this.LLILLL + ", name=" + this.LLILZ + ", eligibleResponse=" + this.LLILZIL + ", showFoldedTipsInFooter=" + this.LLILZLL + ", logId=" + this.LLIZ + ", prfNetworkData=" + this.LLIZLLLIL + ", reviewStatistics=" + this.LLJ + ", reviewListResponse=" + this.LLJI + ", listState=" + this.LLJIJIL + ", tags=" + this.LLJILJIL + ", curAweme=" + this.LLJILJILJ + ", reviewCnt=" + this.LLJILLL + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<PoiReviewsApi.PoiReviewModel> getListItemState() {
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
    public final C627660Ojc<PoiReviewsApi.PoiReviewModel> getListState() {
        return this.LLJIJIL;
    }

    public /* synthetic */ C1190270h4z(int i) {
        this(null, null, null, null, null, false, null, null, null, null, new C627660Ojc(null, null, null, null, 15), null, null, null);
    }

    public static C1190270h4z LIZ(C1190270h4z c1190270h4z, String str, String str2, C1193740hAa c1193740hAa, PoiReviewsApi.PoiReviewListResponse poiReviewListResponse, C627660Ojc c627660Ojc, Aweme aweme, Long l, int i) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        List<PoiReviewsApi.PoiReviewSummaryModel> list;
        String str3;
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse;
        boolean z;
        PoiReviewsApi.PoiReviewStatisticsResponse poiReviewStatisticsResponse;
        Long l2 = l;
        Aweme aweme2 = aweme;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse2 = poiReviewListResponse;
        String str4 = str2;
        C1193740hAa c1193740hAa2 = c1193740hAa;
        String str5 = str;
        List<PoiReviewsApi.PoiReviewTagModel> list2 = null;
        if ((i & 1) != 0) {
            poiReviewSummaryModel = c1190270h4z.LL;
        } else {
            poiReviewSummaryModel = null;
        }
        if ((i & 2) != 0) {
            list = c1190270h4z.LLILLJJLI;
        } else {
            list = null;
        }
        if ((i & 4) != 0) {
            str5 = c1190270h4z.LLILLL;
        }
        if ((i & 8) != 0) {
            str3 = c1190270h4z.LLILZ;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            poiReviewEligibleResponse = c1190270h4z.LLILZIL;
        } else {
            poiReviewEligibleResponse = null;
        }
        if ((i & 32) != 0) {
            z = c1190270h4z.LLILZLL;
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            str4 = c1190270h4z.LLIZ;
        }
        if ((i & 128) != 0) {
            c1193740hAa2 = c1190270h4z.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            poiReviewStatisticsResponse = c1190270h4z.LLJ;
        } else {
            poiReviewStatisticsResponse = null;
        }
        if ((i & 512) != 0) {
            poiReviewListResponse2 = c1190270h4z.LLJI;
        }
        if ((i & 1024) != 0) {
            c627660Ojc2 = c1190270h4z.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list2 = c1190270h4z.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            aweme2 = c1190270h4z.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            l2 = c1190270h4z.LLJILLL;
        }
        c1190270h4z.getClass();
        return new C1190270h4z(poiReviewSummaryModel, list, str5, str3, poiReviewEligibleResponse, z, str4, c1193740hAa2, poiReviewStatisticsResponse, poiReviewListResponse2, c627660Ojc2, list2, aweme2, l2);
    }

    public C1190270h4z(PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, List<PoiReviewsApi.PoiReviewSummaryModel> list, String str, String str2, PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse, boolean z, String str3, C1193740hAa c1193740hAa, PoiReviewsApi.PoiReviewStatisticsResponse poiReviewStatisticsResponse, PoiReviewsApi.PoiReviewListResponse poiReviewListResponse, C627660Ojc<PoiReviewsApi.PoiReviewModel> c627660Ojc, List<PoiReviewsApi.PoiReviewTagModel> list2, Aweme aweme, Long l) {
        this.LL = poiReviewSummaryModel;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = poiReviewEligibleResponse;
        this.LLILZLL = z;
        this.LLIZ = str3;
        this.LLIZLLLIL = c1193740hAa;
        this.LLJ = poiReviewStatisticsResponse;
        this.LLJI = poiReviewListResponse;
        this.LLJIJIL = c627660Ojc;
        this.LLJILJIL = list2;
        this.LLJILJILJ = aweme;
        this.LLJILLL = l;
    }
}
