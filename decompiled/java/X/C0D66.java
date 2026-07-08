package X;

/* JADX INFO: renamed from: X.0D66, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrdersCenterManager", f = "OrdersV2CenterManager.kt", l = {166, 193, 203}, m = "prepareToCompleteOrderSync-0E7RQCE")
public final class C0D66 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C259800zU LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0D6A LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D66(C0D6A c0d6a, InterfaceC1364105Vn<? super C0D66> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0d6a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrdersCenterManager@e9d4.prepareToCompleteOrderSync$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, null, this);
        if (objLJ == C099R.LJFF()) {
            C1C7U.LIZIZ("OrdersCenterManager@e9d4.prepareToCompleteOrderSync$1");
            return objLJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJ);
        C1C7U.LIZIZ("OrdersCenterManager@e9d4.prepareToCompleteOrderSync$1");
        return c189200o6M1boximpl;
    }
}
