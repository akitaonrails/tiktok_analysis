package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;

/* JADX INFO: renamed from: X.03WY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {525}, m = "tryFetchBillInfoByChunk")
public final class C03WY extends AbstractC23140094w {
    public BillInfoRequest LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public C259800zU LLILZIL;
    public C238400w2 LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C03WX LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03WY(C03WX c03wx, InterfaceC1364105Vn<? super C03WY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = c03wx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.tryFetchBillInfoByChunk$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLJJJLL = this.LLJIJIL.LJJJLL(null, false, null, false, false, null, this);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.tryFetchBillInfoByChunk$1");
        return objLJJJLL;
    }
}
