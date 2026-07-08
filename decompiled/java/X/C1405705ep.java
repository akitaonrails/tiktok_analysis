package X;

/* JADX INFO: renamed from: X.05ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.plugin.AIGCWorkflowGeneralProgressCalculatorKt$generalProgressEvents$$inlined$map$2$2", f = "AIGCWorkflowGeneralProgressCalculator.kt", l = {223}, m = "emit")
public final class C1405705ep extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1405805eq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1405705ep(C1405805eq c1405805eq, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1405805eq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowGeneralProgressCalculatorKt@43f6.generalProgressEvents$$inlined$map$2$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AIGCWorkflowGeneralProgressCalculatorKt@43f6.generalProgressEvents$$inlined$map$2$2$1");
        return objEmit;
    }
}
