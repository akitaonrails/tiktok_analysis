package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0UDS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.EffectManagerKtWrapper", f = "EffectManagerKtWrapper.kt", l = {396}, m = "getChildEffect")
public final class C0UDS extends AbstractC23140094w {
    public LiveEffect LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UDQ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UDS(C0UDQ c0udq, InterfaceC1364105Vn<? super C0UDS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0udq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectManagerKtWrapper@5a54.getChildEffect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILLL.LJIILJJIL(null, null, null, this);
        C1C7U.LIZIZ("EffectManagerKtWrapper@5a54.getChildEffect$1");
        return objLJIILJJIL;
    }
}
