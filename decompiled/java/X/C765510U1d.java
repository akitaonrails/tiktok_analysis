package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {1448, 1450, 1452, 1460, 1462, 1464, 1471, 1473}, m = "notifyCurrentTabUpdate")
public final class C765510U1d extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765510U1d(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C765510U1d> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.notifyCurrentTabUpdate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objPQ2 = this.LLILLJJLI.PQ2(this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.notifyCurrentTabUpdate$1");
        return objPQ2;
    }
}
