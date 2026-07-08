package X;

/* JADX INFO: renamed from: X.00hR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.rank.impl.data.repository.AudienceRankingEntranceRepositoryImpl", f = "AudienceRankingEntranceRepositoryImpl.kt", l = {39}, m = "fetchTopViewerRankingData")
public final class C147900hR extends AbstractC23140094w {
    public C148700hZ LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C147600hO LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C147900hR(C147600hO c147600hO, InterfaceC1364105Vn<? super C147900hR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c147600hO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudienceRankingEntranceRepositoryImpl@f262.fetchTopViewerRankingData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(this);
        C1C7U.LIZIZ("AudienceRankingEntranceRepositoryImpl@f262.fetchTopViewerRankingData$1");
        return objLIZ;
    }
}
