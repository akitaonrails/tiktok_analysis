package X;

/* JADX INFO: renamed from: X.0DZO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.ThoughtAggregatedFeedStore", f = "ThoughtAggregatedFeedStore.kt", l = {106}, m = "loadFirstPage")
public final class C0DZO extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0DZM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DZO(C0DZM c0dzm, InterfaceC1364105Vn<? super C0DZO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0dzm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ThoughtAggregatedFeedStore@18e4.loadFirstPage$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(this);
        C1C7U.LIZIZ("ThoughtAggregatedFeedStore@18e4.loadFirstPage$1");
        return objLJFF;
    }
}
