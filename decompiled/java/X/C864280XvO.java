package X;

/* JADX INFO: renamed from: X.0XvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase", f = "SendMsgUseCase.kt", l = {310, 313, 353, 355, 388}, m = "sendMessageOverNetwork-hUnOzRk$core_release")
public final class C864280XvO extends AbstractC23140094w {
    public C869590Y9l LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public C0YCX LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C0YC5 LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864280XvO(C0YC5 c0yc5, InterfaceC1364105Vn<? super C864280XvO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c0yc5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SendMsgUseCase@4b94.sendMessageOverNetwork$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLIZLLLIL.LJIIIZ(null, null, null, null, false, this);
        if (objLJIIIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("SendMsgUseCase@4b94.sendMessageOverNetwork$1");
            return objLJIIIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIIZ);
        C1C7U.LIZIZ("SendMsgUseCase@4b94.sendMessageOverNetwork$1");
        return c189200o6M1boximpl;
    }
}
