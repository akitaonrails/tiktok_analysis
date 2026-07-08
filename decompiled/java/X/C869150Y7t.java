package X;

/* JADX INFO: renamed from: X.0Y7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgaroundindex.GetMsgByConvAroundIndexUseCase", f = "GetMsgByConvAroundIndexUseCase.kt", l = {178}, m = "fetchMessages")
public final class C869150Y7t extends AbstractC23140094w {
    public C869200Y7y LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C869090Y7n LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C869150Y7t(C869090Y7n c869090Y7n, InterfaceC1364105Vn<? super C869150Y7t> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c869090Y7n;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByConvAroundIndexUseCase@f6a9.fetchMessages$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("GetMsgByConvAroundIndexUseCase@f6a9.fetchMessages$1");
        return objLIZIZ;
    }
}
