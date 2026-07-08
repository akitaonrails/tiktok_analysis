package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2ViewModel$loadPage$1", f = "OrdersV2ViewModel.kt", l = {74}, m = "invokeSuspend")
public final class C333750D6n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrdersV2ViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333750D6n(OrdersV2ViewModel ordersV2ViewModel, InterfaceC1364105Vn<? super C333750D6n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ordersV2ViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333750D6n(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("OrdersV2ViewModel@f0af.loadPage$1");
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
            OrdersV2ViewModel ordersV2ViewModel = this.LLILLJJLI;
            C0D6E c0d6e = ordersV2ViewModel.LL;
            String strZQ2 = ordersV2ViewModel.zQ2();
            this.LL = 1;
            c0d6e.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C0D6Y(c0d6e, strZQ2, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OrdersV2ViewModel@f0af.loadPage$1");
                return objLJFF;
            }
        }
        OrderSnapshotV2 orderSnapshotV2 = (OrderSnapshotV2) obj;
        OrdersV2ViewModel ordersV2ViewModel2 = this.LLILLJJLI;
        ordersV2ViewModel2.LLJ = orderSnapshotV2;
        ordersV2ViewModel2.LLJI = orderSnapshotV2;
        List<LocalOrderWrapper> list = C13BV.INSTANCE;
        ordersV2ViewModel2.LLJIJIL = list;
        ordersV2ViewModel2.LLJILJIL = orderSnapshotV2.getCursor();
        this.LLILLJJLI.LLJILJILJ = orderSnapshotV2.getHasMore();
        List<LocalOrderWrapper> list2 = orderSnapshotV2.items;
        if (list2 != null) {
            list = list2;
        }
        if (!list.isEmpty()) {
            this.LLILLJJLI.xQ2(orderSnapshotV2, false);
        } else {
            this.LLILLJJLI.LLILLJJLI.setValue(C333860D6y.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrdersV2ViewModel@f0af.loadPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
