package X;

/* JADX INFO: renamed from: X.05kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.engine.FcpDecisionEngineImpl", f = "FcpDecisionEngineImpl.kt", l = {249}, m = "releaseSlotAsync")
public final class C1442905kp extends AbstractC23140094w {
    public InterfaceC1444205l2 LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1443005kq LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1442905kp(C1443005kq c1443005kq, InterfaceC1364105Vn<? super C1442905kp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1443005kq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpDecisionEngineImpl@1cec.releaseSlotAsync$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(null, null, this);
        C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.releaseSlotAsync$1");
        return objLJI;
    }
}
