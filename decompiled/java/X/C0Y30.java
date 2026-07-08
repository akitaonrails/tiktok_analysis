package X;

/* JADX INFO: renamed from: X.0Y30, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.leaveconversation.LeaveConversationUseCase", f = "LeaveConversationUseCase.kt", l = {66, 75}, m = "leaveConversation")
public final class C0Y30 extends AbstractC23140094w {
    public Object LL;
    public C0Y8T LLILLJJLI;
    public C867350Y0v LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C867910Y2z LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y30(C867910Y2z c867910Y2z, InterfaceC1364105Vn<? super C0Y30> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c867910Y2z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LeaveConversationUseCase@f268.leaveConversation$2");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(null, false, this);
        C1C7U.LIZIZ("LeaveConversationUseCase@f268.leaveConversation$2");
        return objLIZIZ;
    }
}
