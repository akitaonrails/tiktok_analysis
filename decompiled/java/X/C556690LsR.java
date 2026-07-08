package X;

import com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl;

/* JADX INFO: renamed from: X.0LsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl", f = "AIGCWorkflowManagementApiImpl.kt", l = {446}, m = "queryWorkflowState")
public final class C556690LsR extends AbstractC23140094w {
    public Object LL;
    public AIGCWorkflowManagementApiImpl LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AIGCWorkflowManagementApiImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556690LsR(AIGCWorkflowManagementApiImpl aIGCWorkflowManagementApiImpl, InterfaceC1364105Vn<? super C556690LsR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = aIGCWorkflowManagementApiImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCWorkflowManagementApiImpl@e5ae.queryWorkflowState$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("AIGCWorkflowManagementApiImpl@e5ae.queryWorkflowState$1");
        return objLIZ;
    }
}
