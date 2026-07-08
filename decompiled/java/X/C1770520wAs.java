package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequencyParams;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideRequestParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770520wAs implements InterfaceC736910SvR<InterfaceC1770480wAo> {
    public final C1770490wAp LL = new InterfaceC1770480wAo() { // from class: X.0wAp
        @Override // X.InterfaceC1770480wAo
        public final Object LJLL(EcSearchFeedVideoGuideFrequencyParams ecSearchFeedVideoGuideFrequencyParams, InterfaceC1364105Vn<? super C0X52<Response<Unit>>> interfaceC1364105Vn) {
            return C1770760wBG.LIZ.LIZJ(ecSearchFeedVideoGuideFrequencyParams, interfaceC1364105Vn);
        }

        @Override // X.InterfaceC1770480wAo
        public final Object LLJILLL(EcSearchFeedVideoGuideRequestParams ecSearchFeedVideoGuideRequestParams, InterfaceC1364105Vn<? super C0X52<Response<String>>> interfaceC1364105Vn) {
            return C1770760wBG.LIZ.LIZIZ(ecSearchFeedVideoGuideRequestParams, interfaceC1364105Vn);
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
