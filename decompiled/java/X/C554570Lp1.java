package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl;

/* JADX INFO: renamed from: X.0Lp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl", f = "AIGCWorkflowCreationServiceImpl.kt", l = {385, 391}, m = "getFrameworkTypeByServerTaskId")
public final class C554570Lp1 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIGCWorkflowCreationServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554570Lp1(AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl, InterfaceC1364105Vn<? super C554570Lp1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aIGCWorkflowCreationServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowCreationServiceImpl@b066.getFrameworkTypeByServerTaskId$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILLIIL = this.LLILLL.LJIILLIIL(null, this);
        C1C7U.LIZIZ("AIGCWorkflowCreationServiceImpl@b066.getFrameworkTypeByServerTaskId$1");
        return objLJIILLIIL;
    }
}
