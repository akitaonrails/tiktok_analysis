package X;

/* JADX INFO: renamed from: X.15TV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.repo.ExploreTopicFeedListRepository", f = "ExploreTopicFeedListRepository.kt", l = {183, 194, 202}, m = "prefetch")
public final class C15TV extends AbstractC23140094w {
    public Object LL;
    public InterfaceC1451105m9 LLILLJJLI;
    public Object LLILLL;
    public C099F LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C15TU LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15TV(C15TU c15tu, InterfaceC1364105Vn<? super C15TV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c15tu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicFeedListRepository@2fab.prefetch$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("ExploreTopicFeedListRepository@2fab.prefetch$1");
        return objLIZIZ;
    }
}
