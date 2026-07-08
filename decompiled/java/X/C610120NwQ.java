package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachUpdateParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610120NwQ implements InterfaceC736910SvR<InterfaceC610110NwP> {
    public final C610100NwO LL = new InterfaceC610110NwP() { // from class: X.0NwO
        @Override // X.InterfaceC610110NwP
        public final Object LJIILLIIL(FeedReachUpdateParams feedReachUpdateParams, InterfaceC1364105Vn<? super C0X52<Response<Unit>>> interfaceC1364105Vn) {
            InterfaceC610090NwN.LIZ.getClass();
            return C610080NwM.LIZIZ.LJIILLIIL(feedReachUpdateParams, interfaceC1364105Vn);
        }

        @Override // X.InterfaceC610110NwP
        public final Object W(FeedReachGetParams feedReachGetParams, InterfaceC1364105Vn<? super C0X52<Response<FeedReachResponse>>> interfaceC1364105Vn) {
            InterfaceC610090NwN.LIZ.getClass();
            return C610080NwM.LIZIZ.LJIIZILJ(feedReachGetParams, interfaceC1364105Vn);
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
