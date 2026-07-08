package X;

import Y.AgS305S0100000_25;

/* JADX INFO: renamed from: X.0szR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.EffectCameraFlipBackManager$observeNonEffectTriggeredState$$inlined$filterNot$1$2", f = "EffectCameraFlipComponent.kt", l = {223}, m = "emit")
public final class C1648110szR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS305S0100000_25 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1648110szR(AgS305S0100000_25 agS305S0100000_25, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS305S0100000_25;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectCameraFlipBackManager@e1bb.observeNonEffectTriggeredState$$inlined$filterNot$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("EffectCameraFlipBackManager@e1bb.observeNonEffectTriggeredState$$inlined$filterNot$1$2$1");
        return objEmit;
    }
}
