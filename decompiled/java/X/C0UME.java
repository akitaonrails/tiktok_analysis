package X;

/* JADX INFO: renamed from: X.0UME, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectManager", f = "LiveEffectManager.kt", l = {328, 339}, m = "fetchCategoryEffectList")
public final class C0UME extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C0UMC LLILLL;
    public Object LLILZ;
    public boolean LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0UMC LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UME(C0UMC c0umc, InterfaceC1364105Vn<? super C0UME> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c0umc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectManager@e5e4.fetchCategoryEffectList$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLIZ.LJII(null, null, 0, 0, 0, null, false, null, this);
        C1C7U.LIZIZ("LiveEffectManager@e5e4.fetchCategoryEffectList$1");
        return objLJII;
    }
}
