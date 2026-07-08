package X;

/* JADX INFO: renamed from: X.0YNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.prefetchconvid.PrefetchConvShortIdUseCase", f = "PrefetchConvShortIdUseCase.kt", l = {41}, m = "prefetchConversationIds")
public final class C873170YNf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C873140YNc LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873170YNf(C873140YNc c873140YNc, InterfaceC1364105Vn<? super C873170YNf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c873140YNc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrefetchConvShortIdUseCase@5368.prefetchConversationIds$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(false, this);
        C1C7U.LIZIZ("PrefetchConvShortIdUseCase@5368.prefetchConversationIds$1");
        return objLIZJ;
    }
}
