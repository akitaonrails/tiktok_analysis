package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2ViewModel;

/* JADX INFO: renamed from: X.0D6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2ViewModel", f = "OrdersV2ViewModel.kt", l = {230, 238}, m = "reloadLoadedMorePages")
public final class C333770D6p extends AbstractC23140094w {
    public OrderSnapshotV2 LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ OrdersV2ViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333770D6p(OrdersV2ViewModel ordersV2ViewModel, InterfaceC1364105Vn<? super C333770D6p> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = ordersV2ViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrdersV2ViewModel@f0af.reloadLoadedMorePages$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objDQ2 = this.LLILZ.DQ2(null, 0, null, 0L, this);
        C1C7U.LIZIZ("OrdersV2ViewModel@f0af.reloadLoadedMorePages$1");
        return objDQ2;
    }
}
