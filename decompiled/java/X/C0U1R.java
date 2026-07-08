package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1R, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {1311, 1312, 1314}, m = "handleSongActionResult")
public final class C0U1R extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ KaraokeViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1R(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C0U1R> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.handleSongActionResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objJQ2 = this.LLILLL.JQ2(null, null, 0L, false, this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.handleSongActionResult$1");
        return objJQ2;
    }
}
