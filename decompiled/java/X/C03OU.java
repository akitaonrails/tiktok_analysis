package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: renamed from: X.03OU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel", f = "OrderSubmitAssemViewModel.kt", l = {3246, 3249}, m = "checkAndShowPassportToast")
public final class C03OU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03OU(OrderSubmitAssemViewModel orderSubmitAssemViewModel, InterfaceC1364105Vn<? super C03OU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.checkAndShowPassportToast$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objQQ2 = this.LLILLJJLI.QQ2(this);
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.checkAndShowPassportToast$1");
        return objQQ2;
    }
}
