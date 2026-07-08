package X;

import com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl;

/* JADX INFO: renamed from: X.0LiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl", f = "AIPortraitWorkflowServiceImpl.kt", l = {144}, m = "queryWorkflowId")
public final class C550400LiI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIPortraitWorkflowServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550400LiI(AIPortraitWorkflowServiceImpl aIPortraitWorkflowServiceImpl, InterfaceC1364105Vn<? super C550400LiI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitWorkflowServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitWorkflowServiceImpl@832.queryWorkflowId$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("AIPortraitWorkflowServiceImpl@832.queryWorkflowId$1");
        return objLIZLLL;
    }
}
