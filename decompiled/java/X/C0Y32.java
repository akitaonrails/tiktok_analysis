package X;

/* JADX INFO: renamed from: X.0Y32, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.leaveconversation.LeaveConversationUseCase", f = "LeaveConversationUseCase.kt", l = {138}, m = "doNetworkRequest")
public final class C0Y32 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C867910Y2z LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y32(C867910Y2z c867910Y2z, InterfaceC1364105Vn<? super C0Y32> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c867910Y2z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LeaveConversationUseCase@f268.doNetworkRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("LeaveConversationUseCase@f268.doNetworkRequest$1");
        return objLIZ;
    }
}
