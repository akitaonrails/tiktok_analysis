package X;

import com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl;

/* JADX INFO: renamed from: X.0LiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl", f = "AIPortraitWorkflowServiceImpl.kt", l = {164}, m = "queryFailedReason")
public final class C550380LiG extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIPortraitWorkflowServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550380LiG(AIPortraitWorkflowServiceImpl aIPortraitWorkflowServiceImpl, InterfaceC1364105Vn<? super C550380LiG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitWorkflowServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitWorkflowServiceImpl@832.queryFailedReason$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("AIPortraitWorkflowServiceImpl@832.queryFailedReason$1");
        return objLIZJ;
    }
}
