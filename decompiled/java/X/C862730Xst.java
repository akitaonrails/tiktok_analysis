package X;

/* JADX INFO: renamed from: X.0Xst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase", f = "CreateConversationUseCase.kt", l = {69, 70}, m = "createSingleConversation")
public final class C862730Xst extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y4D LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862730Xst(C0Y4D c0y4d, InterfaceC1364105Vn<? super C862730Xst> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0y4d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.createSingleConversation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(0, 0L, null, this);
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.createSingleConversation$1");
        return objLIZLLL;
    }
}
