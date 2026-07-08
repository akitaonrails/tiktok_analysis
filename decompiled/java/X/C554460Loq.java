package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl;

/* JADX INFO: renamed from: X.0Loq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl", f = "AIGCWorkflowCreationServiceImpl.kt", l = {218, 236, 238}, m = "restoreWorkflowsByCreationIds")
public final class C554460Loq extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C552940LmO LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AIGCWorkflowCreationServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554460Loq(AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl, InterfaceC1364105Vn<? super C554460Loq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = aIGCWorkflowCreationServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCWorkflowCreationServiceImpl@b066.restoreWorkflowsByCreationIds$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILZIL.LJIIIZ(null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowCreationServiceImpl@b066.restoreWorkflowsByCreationIds$1");
        return objLJIIIZ;
    }
}
