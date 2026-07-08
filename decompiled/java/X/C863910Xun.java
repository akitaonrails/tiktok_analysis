package X;

/* JADX INFO: renamed from: X.0Xun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$Companion", f = "SendMsgUseCase.kt", l = {115, 122, 138}, m = "sendWithCallback")
public final class C863910Xun extends AbstractC23140094w {
    public C0YEM LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C863920Xuo LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863910Xun(C863920Xuo c863920Xuo, InterfaceC1364105Vn<? super C863910Xun> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c863920Xuo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMsgUseCase$Companion@d6fc.sendWithCallback$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, null, null, null, false, this);
        C1C7U.LIZIZ("SendMsgUseCase$Companion@d6fc.sendWithCallback$1");
        return objLIZJ;
    }
}
