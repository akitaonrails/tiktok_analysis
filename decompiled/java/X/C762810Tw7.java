package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel", f = "BGMPlaylistViewModel.kt", l = {193, 194, 197, 199}, m = "removeSong")
public final class C762810Tw7 extends AbstractC23140094w {
    public MusicSong LL;
    public MusicSong LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ BGMPlaylistViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762810Tw7(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC1364105Vn<? super C762810Tw7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = bGMPlaylistViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistViewModel@a4b3.removeSong$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objDQ2 = this.LLILZIL.DQ2(null, this);
        C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.removeSong$1");
        return objDQ2;
    }
}
