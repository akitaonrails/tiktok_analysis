package X;

/* JADX INFO: renamed from: X.0ZJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.core.interceptor.ActivityStatusUserInterceptorImpl", f = "ActivityStatusUserInterceptorImpl.kt", l = {23}, m = "onInterceptUser")
public final class C897650ZJj extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C897630ZJh LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897650ZJj(C897630ZJh c897630ZJh, InterfaceC1364105Vn<? super C897650ZJj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c897630ZJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusUserInterceptorImpl@2200.onInterceptUser$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("ActivityStatusUserInterceptorImpl@2200.onInterceptUser$1");
        return objLIZ;
    }
}
