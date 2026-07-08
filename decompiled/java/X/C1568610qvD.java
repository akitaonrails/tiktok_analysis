package X;

/* JADX INFO: renamed from: X.0qvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.preload.MoneyPlatformContainerPreloadUseCase", f = "MoneyPlatformContainerPreloadUseCase.kt", l = {40}, m = "execute")
public final class C1568610qvD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1568620qvE LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568610qvD(C1568620qvE c1568620qvE, InterfaceC1364105Vn<? super C1568610qvD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1568620qvE;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MoneyPlatformContainerPreloadUseCase@6220.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLJJLI.LJIIIZ(this);
        C1C7U.LIZIZ("MoneyPlatformContainerPreloadUseCase@6220.execute$1");
        return objLJIIIZ;
    }
}
