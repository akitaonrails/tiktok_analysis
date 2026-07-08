package X;

/* JADX INFO: renamed from: X.0YMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyconvrange.GetMsgByConvWithRangeUseCase", f = "GetMsgByConvWithRangeUseCase.kt", l = {201}, m = "fetchMessages")
public final class C873040YMs extends AbstractC23140094w {
    public C873100YMy LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C873000YMo LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873040YMs(C873000YMo c873000YMo, InterfaceC1364105Vn<? super C873040YMs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c873000YMo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByConvWithRangeUseCase@9cf0.fetchMessages$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, this);
        C1C7U.LIZIZ("GetMsgByConvWithRangeUseCase@9cf0.fetchMessages$1");
        return objLIZ;
    }
}
