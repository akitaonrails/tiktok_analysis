package X;

/* JADX INFO: renamed from: X.0uty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.recharge.network.RechargeRepository$operator$1", f = "RechargeRepository.kt", l = {104}, m = "submitPayment")
public final class C1721600uty extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1721590utx LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721600uty(C1721590utx c1721590utx, InterfaceC1364105Vn<? super C1721600uty> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1721590utx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargeRepository@af58.operator$1$submitPayment$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLLIIZ = this.LLILLJJLI.LLIIZ(null, null, null, this);
        C1C7U.LIZIZ("RechargeRepository@af58.operator$1$submitPayment$1");
        return objLLIIZ;
    }
}
