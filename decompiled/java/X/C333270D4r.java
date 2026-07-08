package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.details.OrderDetailsV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity$observeViewModel$1", f = "OrdersV2OrderDetailsActivity.kt", l = {217}, m = "invokeSuspend")
public final class C333270D4r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderDetailsV2ViewModel LLILLJJLI;
    public final /* synthetic */ OrdersV2OrderDetailsActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333270D4r(OrderDetailsV2ViewModel orderDetailsV2ViewModel, OrdersV2OrderDetailsActivity ordersV2OrderDetailsActivity, InterfaceC1364105Vn<? super C333270D4r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderDetailsV2ViewModel;
        this.LLILLL = ordersV2OrderDetailsActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333270D4r(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrdersV2OrderDetailsActivity@6caa.observeViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.LLJ;
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLL, 43);
            this.LL = 1;
            if (anonymousClass0951.collect(agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("OrdersV2OrderDetailsActivity@6caa.observeViewModel$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
