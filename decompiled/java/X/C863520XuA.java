package X;

/* JADX INFO: renamed from: X.0XuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase", f = "CreateConversationUseCase.kt", l = {146, 166, 168}, m = "retryCreateGroupConversationWithId")
public final class C863520XuA extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0Y4D LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863520XuA(C0Y4D c0y4d, InterfaceC1364105Vn<? super C863520XuA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0y4d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.retryCreateGroupConversationWithId$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILZLL.LJIIIIZZ(0L, null, this);
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.retryCreateGroupConversationWithId$1");
        return objLJIIIIZZ;
    }
}
