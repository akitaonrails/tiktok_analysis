package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1N, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {600, 606, 612, 613}, m = "processDownloadResult")
public final class C0U1N extends AbstractC23140094w {
    public C0U22 LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ KaraokeViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1N(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C0U1N> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.processDownloadResult$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.VQ2(null, null, this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.processDownloadResult$1");
        return objVQ2;
    }
}
