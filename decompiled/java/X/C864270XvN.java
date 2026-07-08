package X;

/* JADX INFO: renamed from: X.0XvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase", f = "SendMsgUseCase.kt", l = {507}, m = "getResponseFromNetworkRequest")
public final class C864270XvN extends AbstractC23140094w {
    public C0YCX LL;
    public C869590Y9l LLILLJJLI;
    public C0YC8 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0YC5 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864270XvN(C0YC5 c0yc5, InterfaceC1364105Vn<? super C864270XvN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0yc5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMsgUseCase@4b94.getResponseFromNetworkRequest$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("SendMsgUseCase@4b94.getResponseFromNetworkRequest$1");
        return objLIZJ;
    }
}
