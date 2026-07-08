package X;

import X.InterfaceC864170XvD;

/* JADX INFO: renamed from: X.0Xur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.retry.LoopingNetworkRequestRetryScheduler", f = "NetworkRequestRetryScheduler.kt", l = {357, 613, 367, 371, 623, 623, 381}, m = "executeRequestWithRetry")
public final class C863950Xur<T extends InterfaceC864170XvD> extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C1DEV LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C863980Xuu LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863950Xur(C863980Xuu c863980Xuu, InterfaceC1364105Vn<? super C863950Xur> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c863980Xuu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LoopingNetworkRequestRetryScheduler@4605.executeRequestWithRetry$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(null, 0, null, null, this);
        C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.executeRequestWithRetry$1");
        return objLIZIZ;
    }
}
