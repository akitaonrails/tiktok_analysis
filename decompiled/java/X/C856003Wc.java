package X;

/* JADX INFO: renamed from: X.03Wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {388}, m = "tryPreloadBillInfo")
public final class C856003Wc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C03WX LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C856003Wc(C03WX c03wx, InterfaceC1364105Vn<? super C856003Wc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c03wx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.tryPreloadBillInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJLI = this.LLILLJJLI.LJJLI(null, null, null, null, null, null, this);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.tryPreloadBillInfo$1");
        return objLJJLI;
    }
}
