package X;

/* JADX INFO: renamed from: X.0YGP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.requestbuffer.GetMsgByUserRequestBuffer", f = "GetMsgByUserRequestBuffer.kt", l = {79, 96, 116, 117, 119}, m = "addPullIntent")
public final class C0YGP extends AbstractC23140094w {
    public C0YGS LL;
    public int[] LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0YGO LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGP(C0YGO c0ygo, InterfaceC1364105Vn<? super C0YGP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c0ygo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByUserRequestBuffer@508f.addPullIntent$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZ.LIZIZ(0, null, this);
        C1C7U.LIZIZ("GetMsgByUserRequestBuffer@508f.addPullIntent$1");
        return objLIZIZ;
    }
}
