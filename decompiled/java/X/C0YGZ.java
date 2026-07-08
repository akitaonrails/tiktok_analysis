package X;

/* JADX INFO: renamed from: X.0YGZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserWithBufferUseCase", f = "GetMsgByUserWithBufferUseCase.kt", l = {181}, m = "fetchResponse")
public final class C0YGZ extends AbstractC23140094w {
    public C0YE0 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0YGW LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGZ(C0YGW c0ygw, InterfaceC1364105Vn<? super C0YGZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0ygw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByUserWithBufferUseCase@994c.fetchResponse$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(0, 0, 0L, null, null, this);
        C1C7U.LIZIZ("GetMsgByUserWithBufferUseCase@994c.fetchResponse$1");
        return objLIZ;
    }
}
