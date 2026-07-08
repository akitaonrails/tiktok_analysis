package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.details.OrderDetailsV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.details.OrderDetailsV2ViewModel$fetchProductsProgressively$result$1", f = "OrderDetailsV2ViewModel.kt", l = {}, m = "invokeSuspend")
public final class C333300D4u extends C09AX implements Function2<List<? extends AbstractC331870Czh>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ OrderDetailsV2ViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333300D4u(OrderDetailsV2ViewModel orderDetailsV2ViewModel, long j, InterfaceC1364105Vn<? super C333300D4u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderDetailsV2ViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333300D4u c333300D4u = new C333300D4u(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c333300D4u.LL = obj;
        return c333300D4u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderDetailsV2ViewModel@fcfe.fetchProductsProgressively$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<? extends AbstractC331870Czh> list = (List) this.LL;
        OrderDetailsV2ViewModel orderDetailsV2ViewModel = this.LLILLJJLI;
        if (orderDetailsV2ViewModel.LLILZLL != this.LLILLL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OrderDetailsV2ViewModel@fcfe.fetchProductsProgressively$result$1");
            return unit;
        }
        orderDetailsV2ViewModel.LLILLL = list;
        orderDetailsV2ViewModel.zQ2(new C0D0Z(list));
        this.LLILLJJLI.wQ2();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OrderDetailsV2ViewModel@fcfe.fetchProductsProgressively$result$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends AbstractC331870Czh> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
