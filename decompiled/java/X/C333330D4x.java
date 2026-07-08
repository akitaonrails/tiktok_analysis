package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.details.OrderDetailsV2ViewModel;

/* JADX INFO: renamed from: X.0D4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.details.OrderDetailsV2ViewModel", f = "OrderDetailsV2ViewModel.kt", l = {143}, m = "fetchProductsProgressively")
public final class C333330D4x extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ OrderDetailsV2ViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333330D4x(OrderDetailsV2ViewModel orderDetailsV2ViewModel, InterfaceC1364105Vn<? super C333330D4x> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = orderDetailsV2ViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderDetailsV2ViewModel@fcfe.fetchProductsProgressively$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, 0L, this);
        C1C7U.LIZIZ("OrderDetailsV2ViewModel@fcfe.fetchProductsProgressively$1");
        return objVQ2;
    }
}
