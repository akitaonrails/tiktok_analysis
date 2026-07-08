package X;

import com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl;

/* JADX INFO: renamed from: X.0LsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl", f = "AIGCWorkflowManagementApiImpl.kt", l = {718, 573}, m = "stopWorkflow")
public final class C556560LsE extends AbstractC23140094w {
    public Object LL;
    public AIGCWorkflowManagementApiImpl LLILLJJLI;
    public Object LLILLL;
    public InterfaceC556470Ls5 LLILZ;
    public InterfaceC383701eN LLILZIL;
    public long LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ AIGCWorkflowManagementApiImpl LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556560LsE(AIGCWorkflowManagementApiImpl aIGCWorkflowManagementApiImpl, InterfaceC1364105Vn<? super C556560LsE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = aIGCWorkflowManagementApiImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowManagementApiImpl@e5ae.stopWorkflow$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJ = this.LLIZLLLIL.LJ(null, this);
        C1C7U.LIZIZ("AIGCWorkflowManagementApiImpl@e5ae.stopWorkflow$1");
        return objLJ;
    }
}
