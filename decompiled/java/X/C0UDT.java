package X;

/* JADX INFO: renamed from: X.0UDT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.EffectManagerKtWrapper", f = "EffectManagerKtWrapper.kt", l = {366, 384}, m = "realGetLiveEffect")
public final class C0UDT extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0UDQ LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UDT(C0UDQ c0udq, InterfaceC1364105Vn<? super C0UDT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0udq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectManagerKtWrapper@5a54.realGetLiveEffect$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILL = this.LLILZ.LJIILL(null, null, this);
        C1C7U.LIZIZ("EffectManagerKtWrapper@5a54.realGetLiveEffect$1");
        return objLJIILL;
    }
}
