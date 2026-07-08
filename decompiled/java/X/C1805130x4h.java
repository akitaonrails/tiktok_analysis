package X;

/* JADX INFO: renamed from: X.0x4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.preload.FECashierPreloadUseCase", f = "FECashierPreloadUseCase.kt", l = {35}, m = "execute")
public final class C1805130x4h extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1805120x4g LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1805130x4h(C1805120x4g c1805120x4g, InterfaceC1364105Vn<? super C1805130x4h> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1805120x4g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FECashierPreloadUseCase@95f6.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLJJLI.LJFF(null, this);
        C1C7U.LIZIZ("FECashierPreloadUseCase@95f6.execute$1");
        return objLJIIIZ;
    }
}
