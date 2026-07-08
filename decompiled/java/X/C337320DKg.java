package X;

/* JADX INFO: renamed from: X.0DKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.agentbridge.BrowserUserAgentProvider", f = "PIPOCashierAgentBridgeServiceImpl.kt", l = {129, 131}, m = "getOrLoad")
public final class C337320DKg extends AbstractC23140094w {
    public C05XL LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C337310DKf LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337320DKg(C337310DKf c337310DKf, InterfaceC1364105Vn<? super C337320DKg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c337310DKf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BrowserUserAgentProvider@3a5c.getOrLoad$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("BrowserUserAgentProvider@3a5c.getOrLoad$1");
        return objLIZJ;
    }
}
