package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03NH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$cancelOrder$1", f = "OrderSubmitAssemViewModel.kt", l = {9611}, m = "invokeSuspend")
public final class C03NH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03NH(OrderSubmitAssemViewModel orderSubmitAssemViewModel, InterfaceC1364105Vn<? super C03NH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03NH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.cancelOrder$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C859403Xk c859403Xk = OrderSubmitApi.LIZ;
            List<String> list = this.LLILLJJLI.r.LIZ;
            String string = null;
            if (list != null) {
                str = (String) C13LP.LJJJLL(list);
            } else {
                str = null;
            }
            CancelOrderRequest cancelOrderRequest = new CancelOrderRequest(str, this.LLILLJJLI.r.LIZIZ, "ecom_order_unpaid_canceled_reason_no_longer_needed", C2286608xc.LJ(1), C2286608xc.LJ(100));
            Integer num = this.LLILLJJLI.m;
            if (num != null) {
                string = num.toString();
            }
            cancelOrderRequest.LIZ = string;
            this.LL = 1;
            if (c859403Xk.LIZ(cancelOrderRequest, this) == objLJFF) {
                C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.cancelOrder$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.cancelOrder$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
