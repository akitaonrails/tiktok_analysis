package X;

/* JADX INFO: renamed from: X.0YNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.prefetchconvid.PrefetchConvShortIdUseCase", f = "PrefetchConvShortIdUseCase.kt", l = {48}, m = "prefetch")
public final class C873160YNe extends AbstractC23140094w {
    public C867350Y0v LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C873140YNc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873160YNe(C873140YNc c873140YNc, InterfaceC1364105Vn<? super C873160YNe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c873140YNc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrefetchConvShortIdUseCase@5368.prefetch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(false, this);
        C1C7U.LIZIZ("PrefetchConvShortIdUseCase@5368.prefetch$1");
        return objLIZIZ;
    }
}
