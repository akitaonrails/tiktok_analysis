package X;

/* JADX INFO: renamed from: X.0UMF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectManager", f = "LiveEffectManager.kt", l = {46, 60}, m = "fetchEffectList")
public final class C0UMF extends AbstractC23140094w {
    public Object LL;
    public C0UMC LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0UMC LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMF(C0UMC c0umc, InterfaceC1364105Vn<? super C0UMF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0umc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectManager@e5e4.fetchEffectList$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILZIL.LJIIIZ(null, null, this);
        C1C7U.LIZIZ("LiveEffectManager@e5e4.fetchEffectList$1");
        return objLJIIIZ;
    }
}
