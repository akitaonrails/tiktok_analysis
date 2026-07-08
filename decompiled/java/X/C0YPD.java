package X;

/* JADX INFO: renamed from: X.0YPD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.DefaultSendMsgPipelineUseCase", f = "SendMsgPipelineUseCase.kt", l = {71, 83}, m = "sendSingleSuspend")
public final class C0YPD extends AbstractC23140094w {
    public C873530YOp LL;
    public C0YOY LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C873540YOq LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YPD(C873540YOq c873540YOq, InterfaceC1364105Vn<? super C0YPD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c873540YOq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultSendMsgPipelineUseCase@3e5.sendSingleSuspend$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("DefaultSendMsgPipelineUseCase@3e5.sendSingleSuspend$1");
        return objLIZIZ;
    }
}
