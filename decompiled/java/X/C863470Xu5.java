package X;

/* JADX INFO: renamed from: X.0Xu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.BatchMarkConversationReadUseCase", f = "BatchMarkConversationReadUseCase.kt", l = {76}, m = "doRequest")
public final class C863470Xu5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C864340XvU LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863470Xu5(C864340XvU c864340XvU, InterfaceC1364105Vn<? super C863470Xu5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c864340XvU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BatchMarkConversationReadUseCase@9ae8.doRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("BatchMarkConversationReadUseCase@9ae8.doRequest$1");
        return objLIZIZ;
    }
}
