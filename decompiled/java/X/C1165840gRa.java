package X;

import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel;

/* JADX INFO: renamed from: X.0gRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel", f = "ArtistMusicFeaturedVideoViewModel.kt", l = {94}, m = "onRefresh")
public final class C1165840gRa extends AbstractC23140094w {
    public C317290CcB LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ArtistMusicFeaturedVideoViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165840gRa(ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel, InterfaceC1364105Vn<? super C1165840gRa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = artistMusicFeaturedVideoViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArtistMusicFeaturedVideoViewModel@1921.onRefresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLL.onRefresh(this);
        C1C7U.LIZIZ("ArtistMusicFeaturedVideoViewModel@1921.onRefresh$1");
        return objOnRefresh;
    }
}
