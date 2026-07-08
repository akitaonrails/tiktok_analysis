package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: renamed from: X.03OK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel", f = "OrderSubmitAssemViewModel.kt", l = {2562}, m = "checkAndUpdateBillInfoDataNormal")
public final class C03OK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03OK(OrderSubmitAssemViewModel orderSubmitAssemViewModel, InterfaceC1364105Vn<? super C03OK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoDataNormal$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objSQ2 = this.LLILLJJLI.SQ2(null, null, false, false, false, null, false, this);
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoDataNormal$1");
        return objSQ2;
    }
}
