package X;

import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM;

/* JADX INFO: renamed from: X.0O6N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM", f = "PlaylistCollectionVM.kt", l = {48, 49}, m = "onLoadMore")
public final class C0O6N extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PlaylistCollectionVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O6N(PlaylistCollectionVM playlistCollectionVM, InterfaceC1364105Vn<? super C0O6N> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = playlistCollectionVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistCollectionVM@b453.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(0, this);
        C1C7U.LIZIZ("PlaylistCollectionVM@b453.onLoadMore$1");
        return objOnLoadMore;
    }
}
