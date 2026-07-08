package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03WP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.helper.OrderSubmitPrefetchHelperV2$asyncFetchBillInfoV2$3", f = "OrderSubmitPrefetchHelperV2.kt", l = {401, 407}, m = "invokeSuspend")
public final class C03WP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BillInfoResponse>, Object> {
    public int LL;
    public final /* synthetic */ BillInfoRequest LLILLJJLI;
    public final /* synthetic */ C03WX LLILLL;
    public final /* synthetic */ HashMap<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03WP(BillInfoRequest billInfoRequest, C03WX c03wx, HashMap<String, Object> map, InterfaceC1364105Vn<? super C03WP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = billInfoRequest;
        this.LLILLL = c03wx;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03WP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitPrefetchHelperV2@715.asyncFetchBillInfoV2$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Integer flowType = this.LLILLJJLI.getFlowType();
            int value = C03SW.MINI_FLOW.getValue();
            if (flowType != null && flowType.intValue() == value) {
                C03WX c03wx = this.LLILLL;
                BillInfoRequest billInfoRequest = this.LLILLJJLI;
                HashMap<String, Object> map = this.LLILZ;
                this.LL = 1;
                obj = c03wx.LJJL(billInfoRequest, true, map, false, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OrderSubmitPrefetchHelperV2@715.asyncFetchBillInfoV2$3");
                    return objLJFF;
                }
            } else {
                C03WX c03wx2 = this.LLILLL;
                BillInfoRequest billInfoRequest2 = this.LLILLJJLI;
                HashMap<String, Object> map2 = this.LLILZ;
                this.LL = 2;
                obj = c03wx2.LJJJJZI(billInfoRequest2, true, map2, false, null, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OrderSubmitPrefetchHelperV2@715.asyncFetchBillInfoV2$3");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("OrderSubmitPrefetchHelperV2@715.asyncFetchBillInfoV2$3");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BillInfoResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
