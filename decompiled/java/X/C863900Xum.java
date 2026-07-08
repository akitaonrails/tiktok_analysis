package X;

/* JADX INFO: renamed from: X.0Xum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$Companion", f = "SendMsgUseCase.kt", l = {96}, m = "send-hUnOzRk")
public final class C863900Xum extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C863920Xuo LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863900Xum(C863920Xuo c863920Xuo, InterfaceC1364105Vn<? super C863900Xum> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c863920Xuo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMsgUseCase$Companion@d6fc.send$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, null, null, false, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("SendMsgUseCase$Companion@d6fc.send$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("SendMsgUseCase$Companion@d6fc.send$1");
        return c189200o6M1boximpl;
    }
}
