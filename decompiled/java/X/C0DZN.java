package X;

/* JADX INFO: renamed from: X.0DZN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.ThoughtAggregatedFeedStore", f = "ThoughtAggregatedFeedStore.kt", l = {139}, m = "loadMore")
public final class C0DZN extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0DZM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DZN(C0DZM c0dzm, InterfaceC1364105Vn<? super C0DZN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0dzm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ThoughtAggregatedFeedStore@18e4.loadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, this);
        C1C7U.LIZIZ("ThoughtAggregatedFeedStore@18e4.loadMore$1");
        return objLJI;
    }
}
