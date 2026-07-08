package X;

import Y.AgS289S0100000_8;

/* JADX INFO: renamed from: X.0Kkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.eventrack.AlbumEventTrackingComponent$registerObservers$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "AlbumEventTrackingComponent.kt", l = {223}, m = "emit")
public final class C526390Kkf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS289S0100000_8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526390Kkf(AgS289S0100000_8 agS289S0100000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS289S0100000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumEventTrackingComponent@9c7b.registerObservers$2$invokeSuspend$$inlined$filterIsInstance$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AlbumEventTrackingComponent@9c7b.registerObservers$2$invokeSuspend$$inlined$filterIsInstance$1$2$1");
        return objEmit;
    }
}
