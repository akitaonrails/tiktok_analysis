package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1O, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {630, 635, 638, 653, 654}, m = "processDownloadResultForAudience")
public final class C0U1O extends AbstractC23140094w {
    public C0U22 LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ KaraokeViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1O(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C0U1O> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("KaraokeViewModel@e9e0.processDownloadResultForAudience$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZ.WQ2(null, null, this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.processDownloadResultForAudience$1");
        return objWQ2;
    }
}
