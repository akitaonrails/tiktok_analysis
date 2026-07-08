package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0UBR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.composer.LiveEcEffectHelper", f = "LiveEcEffectExternalHelper.kt", l = {476}, m = "setEffect")
public final class C0UBR extends AbstractC23140094w {
    public LiveEffect LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0UBQ LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UBR(C0UBQ c0ubq, InterfaceC1364105Vn<? super C0UBR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0ubq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEcEffectHelper@723a.setEffect$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, null, null, null, null, false, null, this);
        C1C7U.LIZIZ("LiveEcEffectHelper@723a.setEffect$1");
        return objLJ;
    }
}
