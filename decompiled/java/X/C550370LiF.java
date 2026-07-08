package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0LiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl", f = "AIPortraitWorkflowServiceImpl.kt", l = {108}, m = "submitWorkflow")
public final class C550370LiF extends AbstractC23140094w {
    public CreativeInfo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIPortraitWorkflowServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550370LiF(AIPortraitWorkflowServiceImpl aIPortraitWorkflowServiceImpl, InterfaceC1364105Vn<? super C550370LiF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aIPortraitWorkflowServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("AIPortraitWorkflowServiceImpl@832.submitWorkflow$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, null, this);
        C1C7U.LIZIZ("AIPortraitWorkflowServiceImpl@832.submitWorkflow$1");
        return objLJ;
    }
}
