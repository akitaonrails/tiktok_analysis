package X;

/* JADX INFO: renamed from: X.0YGY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserWithBufferUseCase", f = "GetMsgByUserWithBufferUseCase.kt", l = {252}, m = "onPullMsgEndWithError")
public final class C0YGY extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public C0YE0 LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0YGW LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGY(C0YGW c0ygw, InterfaceC1364105Vn<? super C0YGY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0ygw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByUserWithBufferUseCase@994c.onPullMsgEndWithError$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZLL.LIZJ(0, 0, null, null, this);
        C1C7U.LIZIZ("GetMsgByUserWithBufferUseCase@994c.onPullMsgEndWithError$1");
        return objLIZJ;
    }
}
