package X;

import Y.AgS284S0100000_3;

/* JADX INFO: renamed from: X.098U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.EffectLoadingManager$special$$inlined$filter$1$2", f = "EffectLoadingComponent.kt", l = {223}, m = "emit")
public final class C098U extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS284S0100000_3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098U(AgS284S0100000_3 agS284S0100000_3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS284S0100000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectLoadingManager@bb2d.special$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("EffectLoadingManager@bb2d.special$$inlined$filter$1$2$1");
        return objEmit;
    }
}
