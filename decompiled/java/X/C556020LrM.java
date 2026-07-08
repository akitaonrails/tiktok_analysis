package X;

/* JADX INFO: renamed from: X.0LrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowSessionImpl", f = "AIGCWorkflowSession.kt", l = {231}, m = "dispose")
public final class C556020LrM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C556030LrN LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556020LrM(C556030LrN c556030LrN, InterfaceC1364105Vn<? super C556020LrM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c556030LrN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowSessionImpl@84a1.dispose$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(this);
        C1C7U.LIZIZ("AIGCWorkflowSessionImpl@84a1.dispose$1");
        return objLIZJ;
    }
}
