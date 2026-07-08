package X;

/* JADX INFO: renamed from: X.0YUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.data.datasource.remote.RemoteCreatorRankingPageDataSourceImpl", f = "RemoteCreatorRankingPageDataSourceImpl.kt", l = {91}, m = "clickMatchRecommend")
public final class C875110YUr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C875090YUp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875110YUr(C875090YUp c875090YUp, InterfaceC1364105Vn<? super C875110YUr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c875090YUp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoteCreatorRankingPageDataSourceImpl@47dc.clickMatchRecommend$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0L, 0L, 0L, 0, this);
        C1C7U.LIZIZ("RemoteCreatorRankingPageDataSourceImpl@47dc.clickMatchRecommend$1");
        return objLIZ;
    }
}
