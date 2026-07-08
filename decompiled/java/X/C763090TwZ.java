package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;

/* JADX INFO: renamed from: X.0TwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel", f = "BGMSongListViewModel.kt", l = {83, 88, 94}, m = "getTabList")
public final class C763090TwZ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BGMSongListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763090TwZ(BGMSongListViewModel bGMSongListViewModel, InterfaceC1364105Vn<? super C763090TwZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = bGMSongListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListViewModel@6bca.getTabList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.yQ2(this);
        C1C7U.LIZIZ("BGMSongListViewModel@6bca.getTabList$1");
        return objYQ2;
    }
}
