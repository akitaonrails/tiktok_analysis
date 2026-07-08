package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;

/* JADX INFO: renamed from: X.0TwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel", f = "BGMPlaylistViewModel.kt", l = {209, 210, 211}, m = "removeAllSongs")
public final class C762860TwC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BGMPlaylistViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762860TwC(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC1364105Vn<? super C762860TwC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bGMPlaylistViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistViewModel@a4b3.removeAllSongs$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.CQ2(this);
        C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.removeAllSongs$1");
        return objCQ2;
    }
}
