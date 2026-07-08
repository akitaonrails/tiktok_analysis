package X;

/* JADX INFO: renamed from: X.0UMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectManager", f = "LiveEffectManager.kt", l = {374}, m = "checkCategoryIsUpdate")
public final class C771150UMv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0UMC LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C771150UMv(C0UMC c0umc, InterfaceC1364105Vn<? super C771150UMv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0umc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectManager@e5e4.checkCategoryIsUpdate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(null, null, this);
        C1C7U.LIZIZ("LiveEffectManager@e5e4.checkCategoryIsUpdate$1");
        return objLJ;
    }
}
