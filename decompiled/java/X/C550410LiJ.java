package X;

import com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl;

/* JADX INFO: renamed from: X.0LiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl", f = "AIPortraitWorkflowServiceImpl.kt", l = {157, 275}, m = "queryWorkflowResult")
public final class C550410LiJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIPortraitWorkflowServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550410LiJ(AIPortraitWorkflowServiceImpl aIPortraitWorkflowServiceImpl, InterfaceC1364105Vn<? super C550410LiJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitWorkflowServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitWorkflowServiceImpl@832.queryWorkflowResult$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, this);
        C1C7U.LIZIZ("AIPortraitWorkflowServiceImpl@832.queryWorkflowResult$1");
        return objLJFF;
    }
}
