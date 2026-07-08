package X;

/* JADX INFO: renamed from: X.0YGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.dissolveconversation.DissolveConversationUseCase", f = "DissolveConversationUseCase.kt", l = {52, 53}, m = "dissolveConversation")
public final class C871460YGq extends AbstractC23140094w {
    public InterfaceC867020Xzo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C871440YGo LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C871460YGq(C871440YGo c871440YGo, InterfaceC1364105Vn<? super C871460YGq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c871440YGo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DissolveConversationUseCase@4967.dissolveConversation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, false, null, this);
        C1C7U.LIZIZ("DissolveConversationUseCase@4967.dissolveConversation$1");
        return objLIZIZ;
    }
}
