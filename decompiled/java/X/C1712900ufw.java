package X;

import com.ss.android.ugc.aweme.pipo.cashier.agentbridge.AgentBridgeApi;

/* JADX INFO: renamed from: X.0ufw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.agentbridge.PIPOCashierAgentBridgeImpl", f = "PIPOCashierAgentBridgeServiceImpl.kt", l = {831, 844}, m = "handleDelegatePayment")
public final class C1712900ufw extends AbstractC23140094w {
    public Object LL;
    public C1712840ufq LLILLJJLI;
    public C336160DFu LLILLL;
    public AgentBridgeApi LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1712870uft LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1712900ufw(C1712870uft c1712870uft, InterfaceC1364105Vn<? super C1712900ufw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1712870uft;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PIPOCashierAgentBridgeImpl@ef2c.handleDelegatePayment$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIILLIIL = this.LLILZLL.LJIILLIIL(null, null, null, this);
        C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.handleDelegatePayment$1");
        return objLJIILLIIL;
    }
}
