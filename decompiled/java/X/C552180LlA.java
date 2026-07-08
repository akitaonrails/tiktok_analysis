package X;

/* JADX INFO: renamed from: X.0LlA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowServerNode", f = "AIGCWorkflowServerNode.kt", l = {77, 115}, m = "run")
public final class C552180LlA extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C551990Lkr LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C552180LlA(C551990Lkr c551990Lkr, InterfaceC1364105Vn<? super C552180LlA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c551990Lkr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowServerNode@50c.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowServerNode@50c.run$1");
        return objLJFF;
    }
}
