package X;

/* JADX INFO: renamed from: X.05ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.engine.FcpDecisionEngineImpl", f = "FcpDecisionEngineImpl.kt", l = {80}, m = "applySlotAsync")
public final class C1442805ko extends AbstractC23140094w {
    public InterfaceC1444205l2 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1443005kq LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1442805ko(C1443005kq c1443005kq, InterfaceC1364105Vn<? super C1442805ko> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1443005kq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpDecisionEngineImpl@1cec.applySlotAsync$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.applySlotAsync$1");
        return objLIZJ;
    }
}
