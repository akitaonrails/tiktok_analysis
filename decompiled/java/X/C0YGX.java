package X;

/* JADX INFO: renamed from: X.0YGX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserWithBufferUseCase", f = "GetMsgByUserWithBufferUseCase.kt", l = {78, 98, 103, 119}, m = "pull")
public final class C0YGX extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public InterfaceC871300YGa LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int[] LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C0YGW LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGX(C0YGW c0ygw, InterfaceC1364105Vn<? super C0YGX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c0ygw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByUserWithBufferUseCase@994c.pull$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLJ.LIZLLL(0, 0, null, null, null, this);
        C1C7U.LIZIZ("GetMsgByUserWithBufferUseCase@994c.pull$1");
        return objLIZLLL;
    }
}
