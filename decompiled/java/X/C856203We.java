package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03We, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {816, 818}, m = "safeRequestChunk")
public final class C856203We extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C03WX LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C856203We(C03WX c03wx, InterfaceC1364105Vn<? super C856203We> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c03wx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.safeRequestChunk$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLL.LJJJJLL(null, false, null, this);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.safeRequestChunk$1");
        return objLJJJJLL;
    }
}
