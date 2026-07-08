package X;

/* JADX INFO: renamed from: X.0YGQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.requestbuffer.GetMsgByUserRequestBuffer", f = "GetMsgByUserRequestBuffer.kt", l = {230, 241}, m = "pullImmediately")
public final class C0YGQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YGO LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGQ(C0YGO c0ygo, InterfaceC1364105Vn<? super C0YGQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0ygo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByUserRequestBuffer@508f.pullImmediately$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(this);
        C1C7U.LIZIZ("GetMsgByUserRequestBuffer@508f.pullImmediately$1");
        return objLJ;
    }
}
