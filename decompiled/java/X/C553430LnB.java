package X;

import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;

/* JADX INFO: renamed from: X.0LnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.minimal.MinimalAPIWrapper", f = "MinimalAPIWrapper.kt", l = {157}, m = "observeMinimalWorkflow")
public final class C553430LnB extends AbstractC23140094w {
    public Object LL;
    public C552940LmO LLILLJJLI;
    public InterfaceC553480LnG LLILLL;
    public InterfaceC553290Lmx LLILZ;
    public AIGCWorkflowManagementApi LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C553420LnA LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553430LnB(C553420LnA c553420LnA, InterfaceC1364105Vn<? super C553430LnB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c553420LnA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinimalAPIWrapper@9e78.observeMinimalWorkflow$2");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZ.LIZIZ(null, null, null, null, this);
        C1C7U.LIZIZ("MinimalAPIWrapper@9e78.observeMinimalWorkflow$2");
        return objLIZIZ;
    }
}
