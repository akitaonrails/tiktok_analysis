package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.FetchVideoRequest;
import com.ss.android.ugc.aweme.poi.content.poicampaign.PoiCampaignApi;
import com.ss.android.ugc.aweme.poi.content.poicampaign.PoiListRequest;
import com.ss.android.ugc.aweme.poi.content.poicampaign.PoiListResponse;

/* JADX INFO: renamed from: X.0hID, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198470hID implements InterfaceC736910SvR<InterfaceC1198450hIB> {
    public final C1198460hIC LL = new InterfaceC1198450hIB() { // from class: X.0hIC
        @Override // X.InterfaceC1198450hIB
        public final Object LLIIL(PoiListRequest poiListRequest, InterfaceC1364105Vn<? super PoiListResponse> interfaceC1364105Vn) {
            return PoiCampaignApi.LIZIZ.fetchPoiListOnly(poiListRequest, interfaceC1364105Vn);
        }

        @Override // X.InterfaceC1198450hIB
        public final Object P(FetchVideoRequest fetchVideoRequest, C1198440hIA c1198440hIA) {
            return PoiCampaignApi.LIZIZ.fetchVideoListWithPoi(fetchVideoRequest, c1198440hIA);
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
