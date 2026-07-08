package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D62, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrdersCenterManager$completeOrderNoSuspend$1", f = "OrdersV2CenterManager.kt", l = {218}, m = "invokeSuspend")
public final class C0D62 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0D6A LLILLJJLI;
    public final /* synthetic */ CheckoutIntent LLILLL;
    public final /* synthetic */ CheckoutSession LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D62(C0D6A c0d6a, CheckoutIntent checkoutIntent, CheckoutSession checkoutSession, InterfaceC1364105Vn<? super C0D62> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d6a;
        this.LLILLL = checkoutIntent;
        this.LLILZ = checkoutSession;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D62(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrdersCenterManager@e9d4.completeOrderNoSuspend$1");
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
            C0D6A c0d6a = this.LLILLJJLI;
            CheckoutIntent checkoutIntent = this.LLILLL;
            CheckoutSession checkoutSession = this.LLILZ;
            this.LL = 1;
            if (c0d6a.LIZJ(checkoutIntent, checkoutSession, this) == objLJFF) {
                C1C7U.LIZIZ("OrdersCenterManager@e9d4.completeOrderNoSuspend$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrdersCenterManager@e9d4.completeOrderNoSuspend$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
