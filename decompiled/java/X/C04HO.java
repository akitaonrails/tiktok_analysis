package X;

/* JADX INFO: renamed from: X.04HO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.cart.repository.api.CartApi$Companion", f = "CartApi.kt", l = {148}, m = "getPreloadCartInfo")
public final class C04HO extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C04HK LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04HO(C04HK c04hk, InterfaceC1364105Vn<? super C04HO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c04hk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CartApi$Companion@8417.getPreloadCartInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("CartApi$Companion@8417.getPreloadCartInfo$1");
        return objLIZLLL;
    }
}
