package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2ViewModel$loadMoreIfNeeded$1", f = "OrdersV2ViewModel.kt", l = {262}, m = "invokeSuspend")
public final class C333740D6m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ OrdersV2ViewModel LLILLL;
    public final /* synthetic */ OrderSnapshotV2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333740D6m(OrdersV2ViewModel ordersV2ViewModel, OrderSnapshotV2 orderSnapshotV2, InterfaceC1364105Vn<? super C333740D6m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = ordersV2ViewModel;
        this.LLILZ = orderSnapshotV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333740D6m c333740D6m = new C333740D6m(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c333740D6m.LLILLJJLI = obj;
        return c333740D6m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLJI = obj;
        C1C7U.LIZ("OrdersV2ViewModel@f0af.loadMoreIfNeeded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJI);
            } else {
                C155000ia.LIZIZ(objLJI);
                OrdersV2ViewModel ordersV2ViewModel = this.LLILLL;
                OrderSnapshotV2 orderSnapshotV2 = this.LLILZ;
                C0D6E c0d6e = ordersV2ViewModel.LL;
                String strZQ2 = ordersV2ViewModel.zQ2();
                List<LocalOrderWrapper> list = ordersV2ViewModel.LLJIJIL;
                long j = ordersV2ViewModel.LLJILJIL;
                this.LL = 1;
                c0d6e.getClass();
                objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0D6W(j, c0d6e, orderSnapshotV2, list, strZQ2, null));
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("OrdersV2ViewModel@f0af.loadMoreIfNeeded$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C333720D6k) objLJI;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        OrdersV2ViewModel ordersV2ViewModel2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C333720D6k c333720D6k = (C333720D6k) c098200Yq;
            ordersV2ViewModel2.LLJJ = false;
            ordersV2ViewModel2.LLJIJIL = c333720D6k.LIZIZ;
            OrderSnapshotV2 orderSnapshotV22 = c333720D6k.LIZ;
            ordersV2ViewModel2.LLJI = orderSnapshotV22;
            ordersV2ViewModel2.LLJILJIL = c333720D6k.LIZJ;
            ordersV2ViewModel2.LLJILJILJ = c333720D6k.LIZLLL;
            ordersV2ViewModel2.xQ2(orderSnapshotV22, true);
        }
        OrdersV2ViewModel ordersV2ViewModel3 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            ordersV2ViewModel3.LLJJ = false;
            ordersV2ViewModel3.LLJJI = true;
            OrderSnapshotV2 orderSnapshotV23 = ordersV2ViewModel3.LLJI;
            if (orderSnapshotV23 != null) {
                ordersV2ViewModel3.xQ2(orderSnapshotV23, true);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("order/list loadMore failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            sbLIZ.append(", cursor=");
            sbLIZ.append(ordersV2ViewModel3.LLJILJIL);
            C0D82.LIZJ("OrdersV2ViewModel", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrdersV2ViewModel@f0af.loadMoreIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
