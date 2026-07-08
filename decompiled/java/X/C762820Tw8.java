package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel", f = "BGMPlaylistViewModel.kt", l = {223, 230, 233}, m = "selectSong")
public final class C762820Tw8 extends AbstractC23140094w {
    public MusicSong LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BGMPlaylistViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762820Tw8(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC1364105Vn<? super C762820Tw8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = bGMPlaylistViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistViewModel@a4b3.selectSong$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objFQ2 = this.LLILZ.FQ2(null, this);
        C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.selectSong$1");
        return objFQ2;
    }
}
