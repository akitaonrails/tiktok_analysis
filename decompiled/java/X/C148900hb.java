package X;

/* JADX INFO: renamed from: X.00hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.rank.impl.data.datasource.remote.RemoteAudienceRankingDataSourceImpl", f = "RemoteAudienceRankingDataSourceImpl.kt", l = {60}, m = "fetchTopBuyerRankingData")
public final class C148900hb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C148800ha LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C148900hb(C148800ha c148800ha, InterfaceC1364105Vn<? super C148900hb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c148800ha;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoteAudienceRankingDataSourceImpl@c1ed.fetchTopBuyerRankingData$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("RemoteAudienceRankingDataSourceImpl@c1ed.fetchTopBuyerRankingData$1");
        return objLIZIZ;
    }
}
