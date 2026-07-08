package X;

/* JADX INFO: renamed from: X.0ZMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.core.update.ActivityStatusFetchImpl", f = "ActivityStatusFetchImpl.kt", l = {58}, m = "getFetchResult")
public final class C898410ZMh extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C898370ZMd LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898410ZMh(C898370ZMd c898370ZMd, InterfaceC1364105Vn<? super C898410ZMh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c898370ZMd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusFetchImpl@b2e6.getFetchResult$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(false, null, false, this);
        C1C7U.LIZIZ("ActivityStatusFetchImpl@b2e6.getFetchResult$1");
        return objLIZIZ;
    }
}
