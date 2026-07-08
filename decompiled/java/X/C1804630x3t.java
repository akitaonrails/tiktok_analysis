package X;

/* JADX INFO: renamed from: X.0x3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.cache.StoreRechargeDataToCacheUseCase", f = "StoreRechargeDataToCacheUseCase.kt", l = {19}, m = "execute")
public final class C1804630x3t extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1804590x3p LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804630x3t(C1804590x3p c1804590x3p, InterfaceC1364105Vn<? super C1804630x3t> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1804590x3p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("StoreRechargeDataToCacheUseCase@61c9.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, this);
        C1C7U.LIZIZ("StoreRechargeDataToCacheUseCase@61c9.execute$1");
        return objLJFF;
    }
}
