package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomenetsHighlightVideoRequest;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsInvitingRequest;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsInvitingResponse;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsMainRequest;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsVideoListRequest;
import com.ss.android.ugc.aweme.poi.content.poicampaign.PoiCampaignApi;

/* JADX INFO: renamed from: X.0hI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198430hI9 implements InterfaceC736910SvR<InterfaceC1198340hI0> {
    public final C1198400hI6 LL = new InterfaceC1198340hI0() { // from class: X.0hI6
        @Override // X.InterfaceC1198340hI0
        public final Object LJJLIIIJL(MyMomentsVideoListRequest myMomentsVideoListRequest, C1198320hHy c1198320hHy) {
            return PoiCampaignApi.LIZIZ.fetchAddLocationData(myMomentsVideoListRequest, c1198320hHy);
        }

        @Override // X.InterfaceC1198340hI0
        public final Object LLIIIL(MyMomenetsHighlightVideoRequest myMomenetsHighlightVideoRequest, C1198350hI1 c1198350hI1) {
            return PoiCampaignApi.LIZIZ.fetchMyMomentsHighlightsVideo(myMomenetsHighlightVideoRequest, c1198350hI1);
        }

        @Override // X.InterfaceC1198340hI0
        public final Object j(MyMomentsMainRequest myMomentsMainRequest, C1198300hHw c1198300hHw) {
            return PoiCampaignApi.LIZIZ.fetchMyMomentsMainData(myMomentsMainRequest, c1198300hHw);
        }

        @Override // X.InterfaceC1198340hI0
        public final Object postInvitationData(MyMomentsInvitingRequest myMomentsInvitingRequest, InterfaceC1364105Vn<? super MyMomentsInvitingResponse> interfaceC1364105Vn) {
            return PoiCampaignApi.LIZIZ.postInvitationData(myMomentsInvitingRequest, interfaceC1364105Vn);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
