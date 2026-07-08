package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRenderRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi$Companion$partialRenderOsp$2$1", f = "OrderSubmitApi.kt", l = {473}, m = "invokeSuspend")
public final class C844903Rv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C03QD>, Object> {
    public int LL;
    public final /* synthetic */ BillInfoRenderRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C844903Rv(BillInfoRenderRequest billInfoRenderRequest, InterfaceC1364105Vn<? super C844903Rv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = billInfoRenderRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C844903Rv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitApi$Companion@33ec.partialRenderOsp$2$1");
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
            OrderSubmitApi orderSubmitApi = (OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class);
            BillInfoRenderRequest billInfoRenderRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = orderSubmitApi.LIZLLL(billInfoRenderRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OrderSubmitApi$Companion@33ec.partialRenderOsp$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("OrderSubmitApi$Companion@33ec.partialRenderOsp$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C03QD> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
