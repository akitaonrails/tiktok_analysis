package X;

import com.ss.android.ugc.aweme.topic.movie.favorite.MovieFavoriteListVM;

/* JADX INFO: renamed from: X.0CqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.favorite.MovieFavoriteListVM", f = "MovieFavoriteListVM.kt", l = {45}, m = "onLoadMore")
public final class C326080CqM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MovieFavoriteListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326080CqM(MovieFavoriteListVM movieFavoriteListVM, InterfaceC1364105Vn<? super C326080CqM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = movieFavoriteListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MovieFavoriteListVM@8c6a.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(0L, this);
        C1C7U.LIZIZ("MovieFavoriteListVM@8c6a.onLoadMore$1");
        return objOnLoadMore;
    }
}
