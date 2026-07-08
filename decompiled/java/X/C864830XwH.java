package X;

/* JADX INFO: renamed from: X.0XwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher", f = "DefaultRemoteFetcher.kt", l = {363, 368}, m = "fetchByHttp$core_release")
public final class C864830XwH extends AbstractC23140094w {
    public C0YCX LL;
    public C0YIS LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0YI6 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864830XwH(C0YI6 c0yi6, InterfaceC1364105Vn<? super C864830XwH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0yi6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultRemoteFetcher@8679.fetchByHttp$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("DefaultRemoteFetcher@8679.fetchByHttp$1");
        return objLIZ;
    }
}
