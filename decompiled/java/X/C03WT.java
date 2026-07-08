package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03WT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitStarter$genRepoIdAndQueryBillInfo$1$1", f = "OrderSubmitStarter.kt", l = {935}, m = "invokeSuspend")
public final class C03WT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C11NZ<BillInfoResponse>>, Object> {
    public int LL;
    public final /* synthetic */ C03WX LLILLJJLI;
    public final /* synthetic */ C259800zU<BillInfoRequest> LLILLL;
    public final /* synthetic */ HashMap<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03WT(C03WX c03wx, C259800zU<BillInfoRequest> c259800zU, HashMap<String, Object> map, InterfaceC1364105Vn<? super C03WT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03wx;
        this.LLILLL = c259800zU;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03WT(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitStarter@3acc.genRepoIdAndQueryBillInfo$1$1");
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
            C03WX c03wx = this.LLILLJJLI;
            BillInfoRequest billInfoRequest = this.LLILLL.element;
            HashMap<String, Object> map = this.LLILZ;
            this.LL = 1;
            obj = c03wx.LJJJLL(billInfoRequest, true, map, false, false, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OrderSubmitStarter@3acc.genRepoIdAndQueryBillInfo$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("OrderSubmitStarter@3acc.genRepoIdAndQueryBillInfo$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C11NZ<BillInfoResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
