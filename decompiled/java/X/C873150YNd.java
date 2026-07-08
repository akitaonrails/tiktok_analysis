package X;

/* JADX INFO: renamed from: X.0YNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.prefetchconvid.PrefetchConvShortIdUseCase", f = "PrefetchConvShortIdUseCase.kt", l = {79}, m = "doNetworkRequest")
public final class C873150YNd extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C873140YNc LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873150YNd(C873140YNc c873140YNc, InterfaceC1364105Vn<? super C873150YNd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c873140YNc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrefetchConvShortIdUseCase@5368.doNetworkRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("PrefetchConvShortIdUseCase@5368.doNetworkRequest$1");
        return objLIZ;
    }
}
