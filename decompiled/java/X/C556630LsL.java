package X;

import com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl;

/* JADX INFO: renamed from: X.0LsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl", f = "AIGCWorkflowManagementApiImpl.kt", l = {715, 555}, m = "querySession")
public final class C556630LsL extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ AIGCWorkflowManagementApiImpl LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556630LsL(AIGCWorkflowManagementApiImpl aIGCWorkflowManagementApiImpl, InterfaceC1364105Vn<? super C556630LsL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = aIGCWorkflowManagementApiImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowManagementApiImpl@e5ae.querySession$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJIJI = this.LLIZ.LJIJI(null, this);
        C1C7U.LIZIZ("AIGCWorkflowManagementApiImpl@e5ae.querySession$1");
        return objLJIJI;
    }
}
