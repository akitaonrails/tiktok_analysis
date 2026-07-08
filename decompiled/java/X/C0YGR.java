package X;

/* JADX INFO: renamed from: X.0YGR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.requestbuffer.GetMsgByUserRequestBuffer", f = "GetMsgByUserRequestBuffer.kt", l = {218, 219}, m = "schedulePull")
public final class C0YGR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YGO LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGR(C0YGO c0ygo, InterfaceC1364105Vn<? super C0YGR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0ygo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByUserRequestBuffer@508f.schedulePull$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(this);
        C1C7U.LIZIZ("GetMsgByUserRequestBuffer@508f.schedulePull$1");
        return objLJII;
    }
}
