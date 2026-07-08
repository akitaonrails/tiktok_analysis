package X;

/* JADX INFO: renamed from: X.0Xtk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.retry.LoopingNetworkRequestRetryScheduler", f = "NetworkRequestRetryScheduler.kt", l = {613, 401, 415, 426, 434, 623, 623, 623, 623}, m = "startProcessingLoop")
public final class C863260Xtk extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C863980Xuu LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863260Xtk(C863980Xuu c863980Xuu, InterfaceC1364105Vn<? super C863260Xtk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c863980Xuu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LoopingNetworkRequestRetryScheduler@4605.startProcessingLoop$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILZ.LJIILIIL(null, this);
        C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.startProcessingLoop$1");
        return objLJIILIIL;
    }
}
