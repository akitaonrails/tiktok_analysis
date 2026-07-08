package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {465, 470}, m = "startKaraokeByH5$liveeffect_impl_release")
public final class C765520U1e extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765520U1e(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C765520U1e> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.startKaraokeByH5$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objFR2 = this.LLILLJJLI.fR2(this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.startKaraokeByH5$1");
        return objFR2;
    }
}
