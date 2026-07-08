package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0TwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel", f = "BGMSongListViewModel.kt", l = {177}, m = "addFavoriteSong")
public final class C763060TwW extends AbstractC23140094w {
    public MusicSong LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BGMSongListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763060TwW(BGMSongListViewModel bGMSongListViewModel, InterfaceC1364105Vn<? super C763060TwW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = bGMSongListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListViewModel@6bca.addFavoriteSong$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, this);
        C1C7U.LIZIZ("BGMSongListViewModel@6bca.addFavoriteSong$1");
        return objVQ2;
    }
}
