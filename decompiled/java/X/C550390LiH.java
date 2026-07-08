package X;

import com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl;

/* JADX INFO: renamed from: X.0LiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl", f = "AIPortraitWorkflowServiceImpl.kt", l = {151, 275}, m = "queryServerWorkflowId")
public final class C550390LiH extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIPortraitWorkflowServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550390LiH(AIPortraitWorkflowServiceImpl aIPortraitWorkflowServiceImpl, InterfaceC1364105Vn<? super C550390LiH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitWorkflowServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitWorkflowServiceImpl@832.queryServerWorkflowId$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(null, this);
        C1C7U.LIZIZ("AIPortraitWorkflowServiceImpl@832.queryServerWorkflowId$1");
        return objLJI;
    }
}
