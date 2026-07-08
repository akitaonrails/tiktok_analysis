package X;

/* JADX INFO: renamed from: X.0XvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase", f = "SendMsgUseCase.kt", l = {164, 183, 192}, m = "retrySendMessageFromColdStart-0E7RQCE")
public final class C864260XvM extends AbstractC23140094w {
    public C869590Y9l LL;
    public C0YC8 LLILLJJLI;
    public C0Y8T LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0YC5 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864260XvM(C0YC5 c0yc5, InterfaceC1364105Vn<? super C864260XvM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0yc5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SendMsgUseCase@4b94.retrySendMessageFromColdStart$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZIL.LJI(null, null, this);
        if (objLJI == C099R.LJFF()) {
            C1C7U.LIZIZ("SendMsgUseCase@4b94.retrySendMessageFromColdStart$1");
            return objLJI;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJI);
        C1C7U.LIZIZ("SendMsgUseCase@4b94.retrySendMessageFromColdStart$1");
        return c189200o6M1boximpl;
    }
}
