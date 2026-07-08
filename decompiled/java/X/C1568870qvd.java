package X;

/* JADX INFO: renamed from: X.0qvd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.preload.FECashierPreloadJSTriggerUseCase", f = "FECashierPreloadJSTriggerUseCase.kt", l = {28}, m = "execute")
public final class C1568870qvd extends AbstractC23140094w {
    public C1568850qvb LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1568880qve LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568870qvd(C1568880qve c1568880qve, InterfaceC1364105Vn<? super C1568870qvd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1568880qve;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FECashierPreloadJSTriggerUseCase@270d.execute$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("FECashierPreloadJSTriggerUseCase@270d.execute$1");
        return objLJIIIZ;
    }
}
