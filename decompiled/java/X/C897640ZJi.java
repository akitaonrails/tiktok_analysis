package X;

/* JADX INFO: renamed from: X.0ZJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.core.interceptor.ActivityStatusUserInterceptorImpl", f = "ActivityStatusUserInterceptorImpl.kt", l = {54, 64}, m = "onInterceptUser")
public final class C897640ZJi extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C897630ZJh LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897640ZJi(C897630ZJh c897630ZJh, InterfaceC1364105Vn<? super C897640ZJi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c897630ZJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusUserInterceptorImpl@2200.onInterceptUser$3");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, this);
        C1C7U.LIZIZ("ActivityStatusUserInterceptorImpl@2200.onInterceptUser$3");
        return objLIZIZ;
    }
}
