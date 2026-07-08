package X;

import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel;

/* JADX INFO: renamed from: X.0gRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel", f = "ArtistMusicFeaturedVideoViewModel.kt", l = {123, 123}, m = "requestAwemeList")
public final class C1165850gRb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ArtistMusicFeaturedVideoViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165850gRb(ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel, InterfaceC1364105Vn<? super C1165850gRb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = artistMusicFeaturedVideoViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArtistMusicFeaturedVideoViewModel@1921.requestAwemeList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(this);
        C1C7U.LIZIZ("ArtistMusicFeaturedVideoViewModel@1921.requestAwemeList$1");
        return objVQ2;
    }
}
