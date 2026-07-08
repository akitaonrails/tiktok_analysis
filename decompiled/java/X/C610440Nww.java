package X;

import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;

/* JADX INFO: renamed from: X.0Nww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel", f = "OriginMusicListViewModel.kt", l = {374, 379, 406, 411}, m = "getOriginMusicList")
public final class C610440Nww extends AbstractC23140094w {
    public C610430Nwv LL;
    public C0O7A LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ OriginMusicListViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610440Nww(OriginMusicListViewModel originMusicListViewModel, InterfaceC1364105Vn<? super C610440Nww> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = originMusicListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OriginMusicListViewModel@f6d8.getOriginMusicList$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILZIL.BQ2(null, this);
        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.getOriginMusicList$1");
        return objBQ2;
    }
}
