package X;

/* JADX INFO: renamed from: X.05GC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.loadmore.ClientAILoadMoreChecker", f = "ClientAILoadMoreChecker.kt", l = {60, 79}, m = "run")
public final class C05GC extends AbstractC23140094w {
    public C1603050rol LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1602890roV LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05GC(C1602890roV c1602890roV, InterfaceC1364105Vn<? super C05GC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1602890roV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ClientAILoadMoreChecker@4481.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this);
        C1C7U.LIZIZ("ClientAILoadMoreChecker@4481.run$1");
        return objLIZIZ;
    }
}
