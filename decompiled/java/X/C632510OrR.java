package X;

import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;

/* JADX INFO: renamed from: X.0OrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel", f = "SearchMusicListViewModel.kt", l = {156}, m = "sendRequest")
public final class C632510OrR extends AbstractC23140094w {
    public C632530OrT LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SearchMusicListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632510OrR(SearchMusicListViewModel searchMusicListViewModel, InterfaceC1364105Vn<? super C632510OrR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = searchMusicListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMusicListViewModel@4a17.sendRequest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILLL.zQ2(null, this);
        C1C7U.LIZIZ("SearchMusicListViewModel@4a17.sendRequest$1");
        return objZQ2;
    }
}
