package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {929, 930, 938, 939}, m = "notifyAudienceKaraokeState")
public final class C765500U1c extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765500U1c(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C765500U1c> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.notifyAudienceKaraokeState$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOQ2 = this.LLILLJJLI.OQ2(false, this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.notifyAudienceKaraokeState$1");
        return objOQ2;
    }
}
