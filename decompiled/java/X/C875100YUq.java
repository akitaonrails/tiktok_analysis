package X;

/* JADX INFO: renamed from: X.0YUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.data.datasource.remote.RemoteCreatorRankingPageDataSourceImpl", f = "RemoteCreatorRankingPageDataSourceImpl.kt", l = {44}, m = "fetch")
public final class C875100YUq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C875090YUp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875100YUq(C875090YUp c875090YUp, InterfaceC1364105Vn<? super C875100YUq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c875090YUp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoteCreatorRankingPageDataSourceImpl@47dc.fetch$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, 0L, 0L, this);
        C1C7U.LIZIZ("RemoteCreatorRankingPageDataSourceImpl@47dc.fetch$1");
        return objLIZIZ;
    }
}
