package X;

/* JADX INFO: renamed from: X.03lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.security.PaymentSecurityManager", f = "PaymentSecurityManager.kt", l = {77}, m = "getCashier")
public final class C938103lb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C938003la LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C938103lb(C938003la c938003la, InterfaceC1364105Vn<? super C938103lb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c938003la;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentSecurityManager@20fb.getCashier$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("PaymentSecurityManager@20fb.getCashier$1");
        return objLIZ;
    }
}
