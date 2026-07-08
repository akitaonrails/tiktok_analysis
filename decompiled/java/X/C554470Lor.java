package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl;

/* JADX INFO: renamed from: X.0Lor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl", f = "AIGCWorkflowCreationServiceImpl.kt", l = {279, 285, 287}, m = "computeOverallStatusByCreationId")
public final class C554470Lor extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C552940LmO LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ AIGCWorkflowCreationServiceImpl LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554470Lor(AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl, InterfaceC1364105Vn<? super C554470Lor> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = aIGCWorkflowCreationServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowCreationServiceImpl@b066.computeOverallStatusByCreationId$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJIJ = this.LLIZ.LJIJ(null, this);
        C1C7U.LIZIZ("AIGCWorkflowCreationServiceImpl@b066.computeOverallStatusByCreationId$1");
        return objLJIJ;
    }
}
