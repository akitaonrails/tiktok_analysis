package X;

/* JADX INFO: renamed from: X.0Xsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase", f = "CreateConversationUseCase.kt", l = {199}, m = "retryCreateGroupConversationWithRequest")
public final class C862740Xsu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0Y4D LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862740Xsu(C0Y4D c0y4d, InterfaceC1364105Vn<? super C862740Xsu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0y4d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.retryCreateGroupConversationWithRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLJJLI.LJIIIZ(null, null, this);
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.retryCreateGroupConversationWithRequest$1");
        return objLJIIIZ;
    }
}
