package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1P, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {1388, 1390, 1403, 1404, 1407, 1417, 1426}, m = "onNewSongMessage")
public final class C0U1P extends AbstractC23140094w {
    public C0U22 LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ KaraokeViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1P(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C0U1P> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.onNewSongMessage$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objSQ2 = this.LLILZ.SQ2(null, false, false, this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.onNewSongMessage$1");
        return objSQ2;
    }
}
