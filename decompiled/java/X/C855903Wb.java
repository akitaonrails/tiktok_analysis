package X;

/* JADX INFO: renamed from: X.03Wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {698}, m = "tryFetchBillInfoByChunkForMiniOsp")
public final class C855903Wb extends AbstractC23140094w {
    public boolean LL;
    public boolean LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public C259800zU LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C03WX LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C855903Wb(C03WX c03wx, InterfaceC1364105Vn<? super C855903Wb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c03wx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.tryFetchBillInfoByChunkForMiniOsp$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJJJZ = this.LLIZ.LJJJZ(null, false, null, false, false, this);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.tryFetchBillInfoByChunkForMiniOsp$1");
        return objLJJJZ;
    }
}
