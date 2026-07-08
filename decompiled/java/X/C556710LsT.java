package X;

import com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl;

/* JADX INFO: renamed from: X.0LsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl", f = "AIGCWorkflowManagementApiImpl.kt", l = {424}, m = "observeWorkflowStates")
public final class C556710LsT extends AbstractC23140094w {
    public Object LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AIGCWorkflowManagementApiImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556710LsT(AIGCWorkflowManagementApiImpl aIGCWorkflowManagementApiImpl, InterfaceC1364105Vn<? super C556710LsT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = aIGCWorkflowManagementApiImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCWorkflowManagementApiImpl@e5ae.observeWorkflowStates$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(null, this);
        C1C7U.LIZIZ("AIGCWorkflowManagementApiImpl@e5ae.observeWorkflowStates$1");
        return objLJII;
    }
}
