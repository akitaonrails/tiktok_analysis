package X;

/* JADX INFO: renamed from: X.0YGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.dissolveconversation.DissolveConversationUseCase", f = "DissolveConversationUseCase.kt", l = {71, 81}, m = "dissolveConversation")
public final class C871450YGp extends AbstractC23140094w {
    public Object LL;
    public C867350Y0v LLILLJJLI;
    public boolean LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C871440YGo LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C871450YGp(C871440YGo c871440YGo, InterfaceC1364105Vn<? super C871450YGp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c871440YGo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DissolveConversationUseCase@4967.dissolveConversation$2");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, false, this);
        C1C7U.LIZIZ("DissolveConversationUseCase@4967.dissolveConversation$2");
        return objLIZ;
    }
}
