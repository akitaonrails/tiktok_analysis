package X;

import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;

/* JADX INFO: renamed from: X.0Nwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel", f = "OriginMusicListViewModel.kt", l = {714, 714}, m = "getPinnedMusicList")
public final class C610410Nwt extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ OriginMusicListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610410Nwt(OriginMusicListViewModel originMusicListViewModel, InterfaceC1364105Vn<? super C610410Nwt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = originMusicListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OriginMusicListViewModel@f6d8.getPinnedMusicList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.CQ2(null, this);
        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.getPinnedMusicList$1");
        return objCQ2;
    }
}
