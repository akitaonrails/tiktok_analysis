package X;

/* JADX INFO: renamed from: X.0Xup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$Companion", f = "SendMsgUseCase.kt", l = {82}, m = "retrySendMessages")
public final class C863930Xup extends AbstractC23140094w {
    public InterfaceC864330XvT LL;
    public C0YEM LLILLJJLI;
    public C0D2S LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C863920Xuo LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863930Xup(C863920Xuo c863920Xuo, InterfaceC1364105Vn<? super C863930Xup> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c863920Xuo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMsgUseCase$Companion@d6fc.retrySendMessages$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, null, null, null, this);
        C1C7U.LIZIZ("SendMsgUseCase$Companion@d6fc.retrySendMessages$1");
        return objLIZ;
    }
}
