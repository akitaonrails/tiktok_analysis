package X;

/* JADX INFO: renamed from: X.04HN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.cart.repository.api.CartApi$Companion", f = "CartApi.kt", l = {137}, m = "getCartPreload")
public final class C04HN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C04HK LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04HN(C04HK c04hk, InterfaceC1364105Vn<? super C04HN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c04hk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CartApi$Companion@8417.getCartPreload$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("CartApi$Companion@8417.getCartPreload$1");
        return objLIZJ;
    }
}
