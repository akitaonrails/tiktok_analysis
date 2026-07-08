package X;

/* JADX INFO: renamed from: X.0KuC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.FlowNodeKt$resultFlowNode$1", f = "FlowNode.kt", l = {52}, m = "run-gIAlu-s")
public final class C532300KuC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C532290KuB LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532300KuC(C532290KuB c532290KuB, InterfaceC1364105Vn<? super C532300KuC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c532290KuB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowNodeKt@b008.resultFlowNode$1$run$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("FlowNodeKt@b008.resultFlowNode$1$run$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("FlowNodeKt@b008.resultFlowNode$1$run$1");
        return c189200o6M1boximpl;
    }
}
