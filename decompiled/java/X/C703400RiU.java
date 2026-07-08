package X;

/* JADX INFO: renamed from: X.0RiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.tiktok.kmp.fcp.slotstrategy.core.FcpSlotStrategyCore", f = "FcpSlotStrategyCore.kt", l = {515}, m = "executeSingleOperation")
public final class C703400RiU extends AbstractC23140094w {
    public long LL;
    public C703410RiV LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C703290RiJ LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703400RiU(C703290RiJ c703290RiJ, InterfaceC1364105Vn<? super C703400RiU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c703290RiJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpSlotStrategyCore@e3e2.executeSingleOperation$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZLL.LJ(0L, null, 0, null, false, null, this);
        C1C7U.LIZIZ("FcpSlotStrategyCore@e3e2.executeSingleOperation$1");
        return objLJ;
    }
}
