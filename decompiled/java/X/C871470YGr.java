package X;

/* JADX INFO: renamed from: X.0YGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.dissolveconversation.DissolveConversationUseCase", f = "DissolveConversationUseCase.kt", l = {151}, m = "doNetworkRequest")
public final class C871470YGr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C871440YGo LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C871470YGr(C871440YGo c871440YGo, InterfaceC1364105Vn<? super C871470YGr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c871440YGo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DissolveConversationUseCase@4967.doNetworkRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("DissolveConversationUseCase@4967.doNetworkRequest$1");
        return objLIZJ;
    }
}
