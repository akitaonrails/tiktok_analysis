package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D69, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrdersCenterManager$completeOrder$3", f = "OrdersV2CenterManager.kt", l = {268, 275}, m = "invokeSuspend")
public final class C0D69 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C259800zU LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public final /* synthetic */ C0D6A LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C259800zU<CheckoutIntent> LLIZ;
    public final /* synthetic */ C259800zU<CheckoutSession> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D69(C0D6A c0d6a, String str, C259800zU<CheckoutIntent> c259800zU, C259800zU<CheckoutSession> c259800zU2, InterfaceC1364105Vn<? super C0D69> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c0d6a;
        this.LLILZLL = str;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D69(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D69.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
