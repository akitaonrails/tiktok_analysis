package X;

/* JADX INFO: renamed from: X.0gRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.repo.RssRepoImpl", f = "RssRepo.kt", l = {57}, m = "fetchRssUser")
public final class C1166040gRu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1166060gRw LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166040gRu(C1166060gRw c1166060gRw, InterfaceC1364105Vn<? super C1166040gRu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1166060gRw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RssRepoImpl@e91c.fetchRssUser$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(this);
        C1C7U.LIZIZ("RssRepoImpl@e91c.fetchRssUser$1");
        return objLIZJ;
    }
}
