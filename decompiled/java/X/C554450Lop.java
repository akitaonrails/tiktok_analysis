package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl;

/* JADX INFO: renamed from: X.0Lop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl", f = "AIGCWorkflowCreationServiceImpl.kt", l = {303, 316, 324, 326}, m = "observeOverallStatusByCreationId")
public final class C554450Lop extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ AIGCWorkflowCreationServiceImpl LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554450Lop(AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl, InterfaceC1364105Vn<? super C554450Lop> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = aIGCWorkflowCreationServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowCreationServiceImpl@b066.observeOverallStatusByCreationId$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLJII = this.LLJ.LJII(null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowCreationServiceImpl@b066.observeOverallStatusByCreationId$1");
        return objLJII;
    }
}
