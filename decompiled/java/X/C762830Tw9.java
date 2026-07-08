package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;

/* JADX INFO: renamed from: X.0Tw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel", f = "BGMPlaylistViewModel.kt", l = {144, 145, 149}, m = "addSong")
public final class C762830Tw9 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BGMPlaylistViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762830Tw9(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC1364105Vn<? super C762830Tw9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = bGMPlaylistViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistViewModel@a4b3.addSong$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, this);
        C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.addSong$1");
        return objVQ2;
    }
}
