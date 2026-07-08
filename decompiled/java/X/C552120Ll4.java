package X;

import com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskBody;
import com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskResponse;

/* JADX INFO: renamed from: X.0Ll4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCLegacyWorkflowServerNode", f = "AIGCLegacyWorkflowServerNode.kt", l = {94, 122}, m = "run")
public final class C552120Ll4 extends AbstractC23140094w {
    public InterfaceC551900Lki LL;
    public CreateTaskBody LLILLJJLI;
    public CreateTaskResponse LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C551980Lkq LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C552120Ll4(C551980Lkq c551980Lkq, InterfaceC1364105Vn<? super C552120Ll4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c551980Lkq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCLegacyWorkflowServerNode@4028.run$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZIL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("AIGCLegacyWorkflowServerNode@4028.run$1");
        return objLJFF;
    }
}
