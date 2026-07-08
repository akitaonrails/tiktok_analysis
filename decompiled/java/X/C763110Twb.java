package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;

/* JADX INFO: renamed from: X.0Twb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel", f = "BGMSongListViewModel.kt", l = {111, 121}, m = "getFirstTrendingSong")
public final class C763110Twb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BGMSongListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763110Twb(BGMSongListViewModel bGMSongListViewModel, InterfaceC1364105Vn<? super C763110Twb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bGMSongListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListViewModel@6bca.getFirstTrendingSong$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILLJJLI.xQ2(this);
        C1C7U.LIZIZ("BGMSongListViewModel@6bca.getFirstTrendingSong$1");
        return objXQ2;
    }
}
