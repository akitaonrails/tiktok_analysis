package X;

/* JADX INFO: renamed from: X.0IbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.skylight.tooltip.ToolTipStrategyCenter", f = "ToolTipStrategyCenter.kt", l = {65}, m = "requestStrategyData$live_release")
public final class C469710IbR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C469700IbQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C469710IbR(C469700IbQ c469700IbQ, InterfaceC1364105Vn<? super C469710IbR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c469700IbQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolTipStrategyCenter@d5bf.requestStrategyData$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("ToolTipStrategyCenter@d5bf.requestStrategyData$1");
        return objLIZIZ;
    }
}
