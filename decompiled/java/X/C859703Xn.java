package X;

/* JADX INFO: renamed from: X.03Xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi$Companion", f = "OrderSubmitApi.kt", l = {428}, m = "cancelOrder")
public final class C859703Xn extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C859403Xk LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859703Xn(C859403Xk c859403Xk, InterfaceC1364105Vn<? super C859703Xn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c859403Xk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitApi$Companion@33ec.cancelOrder$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("OrderSubmitApi$Companion@33ec.cancelOrder$1");
        return objLIZ;
    }
}
