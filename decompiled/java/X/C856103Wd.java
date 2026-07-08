package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03Wd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {800}, m = "safeRequest")
public final class C856103Wd extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C03WX LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C856103Wd(C03WX c03wx, InterfaceC1364105Vn<? super C856103Wd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c03wx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.safeRequest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLI = this.LLILLL.LJJJJLI(null, null, null, this);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.safeRequest$1");
        return objLJJJJLI;
    }
}
