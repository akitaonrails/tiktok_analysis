package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {1711}, m = "updatePlayList")
public final class C0U1Y extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1Y(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C0U1Y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.updatePlayList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objKR2 = this.LLILLJJLI.kR2(null, false, this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.updatePlayList$1");
        return objKR2;
    }
}
