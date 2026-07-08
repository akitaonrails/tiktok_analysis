package X;

/* JADX INFO: renamed from: X.0XvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase", f = "SendMsgUseCase.kt", l = {228, 242, 277, 279}, m = "send-yxL6bBk")
public final class C864250XvL extends AbstractC23140094w {
    public Object LL;
    public C0YC8 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0YC5 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864250XvL(C0YC5 c0yc5, InterfaceC1364105Vn<? super C864250XvL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0yc5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SendMsgUseCase@4b94.send$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(null, null, false, null, this);
        if (objLJII == C099R.LJFF()) {
            C1C7U.LIZIZ("SendMsgUseCase@4b94.send$1");
            return objLJII;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJII);
        C1C7U.LIZIZ("SendMsgUseCase@4b94.send$1");
        return c189200o6M1boximpl;
    }
}
