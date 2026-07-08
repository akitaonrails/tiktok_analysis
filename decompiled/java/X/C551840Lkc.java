package X;

/* JADX INFO: renamed from: X.0Lkc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowPollingNode", f = "AIGCWorkflowPollingNode.kt", l = {176, 184, 188, 196, 217, 283, 287}, m = "run")
public final class C551840Lkc extends AbstractC23140094w {
    public InterfaceC551900Lki LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C551760LkU LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551840Lkc(C551760LkU c551760LkU, InterfaceC1364105Vn<? super C551840Lkc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c551760LkU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowPollingNode@6d19.run$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLIZ.LIZIZ(null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowPollingNode@6d19.run$1");
        return objLJFF;
    }
}
