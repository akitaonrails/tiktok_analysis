package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.details.OrderDetailsV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.details.OrderDetailsV2ViewModel$startRecommendLoading$1", f = "OrderDetailsV2ViewModel.kt", l = {110}, m = "invokeSuspend")
public final class C333310D4v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderDetailsV2ViewModel LLILLJJLI;
    public final /* synthetic */ C333320D4w LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333310D4v(OrderDetailsV2ViewModel orderDetailsV2ViewModel, C333320D4w c333320D4w, long j, InterfaceC1364105Vn<? super C333310D4v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderDetailsV2ViewModel;
        this.LLILLL = c333320D4w;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333310D4v(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderDetailsV2ViewModel@fcfe.startRecommendLoading$1");
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
            OrderDetailsV2ViewModel orderDetailsV2ViewModel = this.LLILLJJLI;
            C333320D4w c333320D4w = this.LLILLL;
            long j = this.LLILZ;
            this.LL = 1;
            if (orderDetailsV2ViewModel.vQ2(c333320D4w, j, this) == objLJFF) {
                C1C7U.LIZIZ("OrderDetailsV2ViewModel@fcfe.startRecommendLoading$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderDetailsV2ViewModel@fcfe.startRecommendLoading$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
