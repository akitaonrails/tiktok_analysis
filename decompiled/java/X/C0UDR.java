package X;

/* JADX INFO: renamed from: X.0UDR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.EffectManagerKtWrapper", f = "EffectManagerKtWrapper.kt", l = {342, 344}, m = "fetchSingleParentEffect")
public final class C0UDR extends AbstractC23140094w {
    public Object LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0UDQ LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UDR(C0UDQ c0udq, InterfaceC1364105Vn<? super C0UDR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0udq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectManagerKtWrapper@5a54.fetchSingleParentEffect$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILZIL.LJIILIIL(null, null, this);
        C1C7U.LIZIZ("EffectManagerKtWrapper@5a54.fetchSingleParentEffect$1");
        return objLJIILIIL;
    }
}
