package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;

/* JADX INFO: renamed from: X.0U1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {893}, m = "notifyAnchorKaraokeStartSuccess")
public final class C765480U1a extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765480U1a(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C765480U1a> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.notifyAnchorKaraokeStartSuccess$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objMQ2 = this.LLILLJJLI.MQ2(this);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.notifyAnchorKaraokeStartSuccess$1");
        return objMQ2;
    }
}
