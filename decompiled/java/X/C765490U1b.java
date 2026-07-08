package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {917, 919}, m = "notifyAnchorKaraokeStopSuccess")
public final class C765490U1b extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765490U1b(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C765490U1b> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.notifyAnchorKaraokeStopSuccess$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objNQ2 = this.LLILLJJLI.NQ2(this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.notifyAnchorKaraokeStopSuccess$1");
        return objNQ2;
    }
}
