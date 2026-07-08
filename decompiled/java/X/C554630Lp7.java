package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl;

/* JADX INFO: renamed from: X.0Lp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl", f = "AIGCWorkflowCreationServiceImpl.kt", l = {244}, m = "queryWorkflowState")
public final class C554630Lp7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIGCWorkflowCreationServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554630Lp7(AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl, InterfaceC1364105Vn<? super C554630Lp7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aIGCWorkflowCreationServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowCreationServiceImpl@b066.queryWorkflowState$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("AIGCWorkflowCreationServiceImpl@b066.queryWorkflowState$1");
        return objLIZ;
    }
}
