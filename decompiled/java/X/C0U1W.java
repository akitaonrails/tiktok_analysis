package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1W, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {677, 682, 684}, m = "onLyricsStateChange")
public final class C0U1W extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ KaraokeViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1W(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C0U1W> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.onLyricsStateChange$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objRQ2 = this.LLILLL.RQ2(false, this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.onLyricsStateChange$1");
        return objRQ2;
    }
}
