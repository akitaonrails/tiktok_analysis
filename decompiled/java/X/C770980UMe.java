package X;

/* JADX INFO: renamed from: X.0UMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectManager", f = "LiveEffectManager.kt", l = {431}, m = "fetchFavoriteList")
public final class C770980UMe extends AbstractC23140094w {
    public C0UMC LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UMC LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770980UMe(C0UMC c0umc, InterfaceC1364105Vn<? super C770980UMe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0umc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectManager@e5e4.fetchFavoriteList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILLL.LJIIJJI(null, null, this);
        C1C7U.LIZIZ("LiveEffectManager@e5e4.fetchFavoriteList$1");
        return objLJIIJJI;
    }
}
