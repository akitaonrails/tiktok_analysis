package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;

/* JADX INFO: renamed from: X.0TwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel", f = "BGMSongListViewModel.kt", l = {133}, m = "loadMoreSongsById")
public final class C763080TwY extends AbstractC23140094w {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BGMSongListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763080TwY(BGMSongListViewModel bGMSongListViewModel, InterfaceC1364105Vn<? super C763080TwY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = bGMSongListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListViewModel@6bca.loadMoreSongsById$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILZ.AQ2(0L, this);
        C1C7U.LIZIZ("BGMSongListViewModel@6bca.loadMoreSongsById$1");
        return objAQ2;
    }
}
