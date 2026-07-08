package X;

/* JADX INFO: renamed from: X.03Wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {281, 288}, m = "tryFetchBillInfoForMiniOsp")
public final class C855803Wa extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C03WX LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C855803Wa(C03WX c03wx, InterfaceC1364105Vn<? super C855803Wa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c03wx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.tryFetchBillInfoForMiniOsp$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJJL = this.LLIZLLLIL.LJJL(null, false, null, false, null, this);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.tryFetchBillInfoForMiniOsp$1");
        return objLJJL;
    }
}
