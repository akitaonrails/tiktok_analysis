package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {762, 766, 776}, m = "fetchAndParseLyric")
public final class C0U1Q extends AbstractC23140094w {
    public C0U22 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ KaraokeViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1Q(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C0U1Q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.fetchAndParseLyric$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(null, this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.fetchAndParseLyric$1");
        return objBQ2;
    }
}
