package X;

/* JADX INFO: renamed from: X.0Xss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase", f = "CreateConversationUseCase.kt", l = {119, 121, 125, 127}, m = "createGroupConversation")
public final class C862720Xss extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y4D LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862720Xss(C0Y4D c0y4d, InterfaceC1364105Vn<? super C862720Xss> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0y4d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.createGroupConversation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(0, null, null, null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.createGroupConversation$1");
        return objLIZJ;
    }
}
