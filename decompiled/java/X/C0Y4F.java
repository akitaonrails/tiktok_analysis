package X;

/* JADX INFO: renamed from: X.0Y4F, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase", f = "CreateConversationUseCase.kt", l = {329, 370, 389, 400}, m = "sendCreateRequestOverNetwork")
public final class C0Y4F extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public boolean LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C0Y4D LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y4F(C0Y4D c0y4d, InterfaceC1364105Vn<? super C0Y4F> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = c0y4d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.sendCreateRequestOverNetwork$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLJIJIL.LJIIJ(0, 0, null, null, false, null, this);
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.sendCreateRequestOverNetwork$1");
        return objLJIIJ;
    }
}
