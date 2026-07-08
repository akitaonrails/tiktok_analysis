package X;

/* JADX INFO: renamed from: X.0Xtl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.retry.LoopingNetworkRequestRetryScheduler", f = "NetworkRequestRetryScheduler.kt", l = {490, 495, 507, 533}, m = "processSingleRequestWithBackoff")
public final class C863270Xtl extends AbstractC23140094w {
    public C864100Xv6 LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C863980Xuu LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863270Xtl(C863980Xuu c863980Xuu, InterfaceC1364105Vn<? super C863270Xtl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c863980Xuu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoopingNetworkRequestRetryScheduler@4605.processSingleRequestWithBackoff$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILZIL.LJIIJ(null, null, this);
        C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.processSingleRequestWithBackoff$1");
        return objLJIIJ;
    }
}
