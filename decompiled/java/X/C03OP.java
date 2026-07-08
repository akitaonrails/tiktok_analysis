package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: renamed from: X.03OP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel", f = "OrderSubmitAssemViewModel.kt", l = {4665, 4675}, m = "processGPSelect")
public final class C03OP extends AbstractC23140094w {
    public PaymentMethod LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03OP(OrderSubmitAssemViewModel orderSubmitAssemViewModel, InterfaceC1364105Vn<? super C03OP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = orderSubmitAssemViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.processGPSelect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objMS2 = this.LLILLL.MS2(false, this);
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.processGPSelect$1");
        return objMS2;
    }
}
