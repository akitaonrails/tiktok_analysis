package X;

import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;

/* JADX INFO: renamed from: X.0r4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository", f = "SeriesFeedRepo.kt", l = {66}, m = "fetchFeedList")
public final class C1574310r4P extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SeriesFeedRepository LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574310r4P(SeriesFeedRepository seriesFeedRepository, InterfaceC1364105Vn<? super C1574310r4P> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = seriesFeedRepository;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesFeedRepository@2c07.fetchFeedList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, false, false, null, null, null, null, null, null, false, 0, false, this);
        C1C7U.LIZIZ("SeriesFeedRepository@2c07.fetchFeedList$1");
        return objLIZ;
    }
}
