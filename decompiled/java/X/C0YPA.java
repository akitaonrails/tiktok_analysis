package X;

/* JADX INFO: renamed from: X.0YPA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.DefaultSendMsgPipelineUseCase", f = "SendMsgPipelineUseCase.kt", l = {187}, m = "runRemoteAndDispatch")
public final class C0YPA extends AbstractC23140094w {
    public C0YPV LL;
    public C0YOY LLILLJJLI;
    public C869590Y9l LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C873540YOq LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YPA(C873540YOq c873540YOq, InterfaceC1364105Vn<? super C0YPA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c873540YOq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultSendMsgPipelineUseCase@3e5.runRemoteAndDispatch$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(null, false, null, this);
        C1C7U.LIZIZ("DefaultSendMsgPipelineUseCase@3e5.runRemoteAndDispatch$1");
        return objLIZJ;
    }
}
