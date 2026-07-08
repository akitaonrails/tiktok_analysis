package X;

/* JADX INFO: renamed from: X.0YP9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.DefaultSendMsgPipelineUseCase", f = "SendMsgPipelineUseCase.kt", l = {120, 126}, m = "sendOrdered")
public final class C0YP9 extends AbstractC23140094w {
    public C873520YOo LL;
    public C0YOY LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C873540YOq LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YP9(C873540YOq c873540YOq, InterfaceC1364105Vn<? super C0YP9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c873540YOq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultSendMsgPipelineUseCase@3e5.sendOrdered$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, null, this);
        C1C7U.LIZIZ("DefaultSendMsgPipelineUseCase@3e5.sendOrdered$1");
        return objLIZ;
    }
}
