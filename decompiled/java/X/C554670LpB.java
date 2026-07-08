package X;

/* JADX INFO: renamed from: X.0LpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl$observeOverallStatusByCreationId$$inlined$map$1$2", f = "AIGCWorkflowCreationServiceImpl.kt", l = {223}, m = "emit")
public final class C554670LpB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C554660LpA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554670LpB(C554660LpA c554660LpA, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c554660LpA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowCreationServiceImpl@b066.observeOverallStatusByCreationId$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AIGCWorkflowCreationServiceImpl@b066.observeOverallStatusByCreationId$$inlined$map$1$2$1");
        return objEmit;
    }
}
