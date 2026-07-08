package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.topic.movie.favorite.api.IPLeaderboardCollectionStatusUpdateRequest;
import com.ss.android.ugc.aweme.topic.movie.favorite.api.MovieCollectionListApi;

/* JADX INFO: renamed from: X.0CqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326130CqR implements InterfaceC736910SvR<InterfaceC326090CqN> {
    public final MovieCollectionListApi LL;
    public final C326140CqS LLILLJJLI;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0CqS] */
    public C326130CqR() {
        MovieCollectionListApi.LIZ.getClass();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        this.LL = (MovieCollectionListApi) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(MovieCollectionListApi.class);
        this.LLILLJJLI = new InterfaceC326090CqN() { // from class: X.0CqS
            @Override // X.InterfaceC326090CqN
            public final Object LLZZLLIL(long j, C326080CqM c326080CqM) {
                return this.LL.LL.getMovieCollectionList(j, 7, c326080CqM);
            }

            @Override // X.InterfaceC326090CqN
            public final Object LLLLIIL(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
                return this.LL.LL.updateIPLeaderboardCollectionStatus(new IPLeaderboardCollectionStatusUpdateRequest(str, i, 2), interfaceC1364105Vn);
            }
        };
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}
