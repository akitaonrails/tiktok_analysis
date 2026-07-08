package X;

/* JADX INFO: renamed from: X.0YD4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyid.GetMsgByIdUseCase", f = "GetMsgByIdUseCase.kt", l = {78, 99}, m = "batchGetMsgById")
public final class C0YD4 extends AbstractC23140094w {
    public int LL;
    public InterfaceC863600XuI LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public long LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C0YD1 LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YD4(C0YD1 c0yd1, InterfaceC1364105Vn<? super C0YD4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c0yd1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByIdUseCase@8fc2.batchGetMsgById$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, 0, null, null, null, this);
        C1C7U.LIZIZ("GetMsgByIdUseCase@8fc2.batchGetMsgById$1");
        return objLIZ;
    }
}
