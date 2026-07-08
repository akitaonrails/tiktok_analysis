package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;

/* JADX INFO: renamed from: X.0TwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel", f = "BGMPlaylistViewModel.kt", l = {161, 162, 164}, m = "loadTop")
public final class C762850TwB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BGMPlaylistViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762850TwB(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC1364105Vn<? super C762850TwB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bGMPlaylistViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistViewModel@a4b3.loadTop$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLJJLI.AQ2(this);
        C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.loadTop$1");
        return objAQ2;
    }
}
