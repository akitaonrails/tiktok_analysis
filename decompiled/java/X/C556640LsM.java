package X;

import com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl;

/* JADX INFO: renamed from: X.0LsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl", f = "AIGCWorkflowManagementApiImpl.kt", l = {190, 192}, m = "queryWorkflows")
public final class C556640LsM extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AIGCWorkflowManagementApiImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556640LsM(AIGCWorkflowManagementApiImpl aIGCWorkflowManagementApiImpl, InterfaceC1364105Vn<? super C556640LsM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = aIGCWorkflowManagementApiImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCWorkflowManagementApiImpl@e5ae.queryWorkflows$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZIL.LJFF(null, this);
        C1C7U.LIZIZ("AIGCWorkflowManagementApiImpl@e5ae.queryWorkflows$1");
        return objLJFF;
    }
}
