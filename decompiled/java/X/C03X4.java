package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03X4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitFetcher$requestForPreloadFullData$observable$1$1$1", f = "OrderSubmitFetcher.kt", l = {}, m = "invokeSuspend")
public final class C03X4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C857603Ws LL;
    public final /* synthetic */ BillInfoResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03X4(C857603Ws c857603Ws, BillInfoResponse billInfoResponse, InterfaceC1364105Vn<? super C03X4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c857603Ws;
        this.LLILLJJLI = billInfoResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03X4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestForPreloadFullData$observable$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C857603Ws c857603Ws = this.LL;
        HashMap<String, Object> mapLIZ = C1741890vQh.LIZ(this.LLILLJJLI);
        c857603Ws.getClass();
        if (mapLIZ != null) {
            EcomResourceBystander.LIZ.getClass();
            EcomResourceBystander.LJIILLIIL(mapLIZ, "/api/v2/shop/bill_info/preload", null, null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestForPreloadFullData$observable$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
