package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl;

/* JADX INFO: renamed from: X.0Lov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl", f = "AIGCWorkflowCreationServiceImpl.kt", l = {195, 197}, m = "restoreWorkflow")
public final class C554510Lov extends AbstractC23140094w {
    public Object LL;
    public LifecycleOwner LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AIGCWorkflowCreationServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554510Lov(AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl, InterfaceC1364105Vn<? super C554510Lov> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = aIGCWorkflowCreationServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCWorkflowCreationServiceImpl@b066.restoreWorkflow$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowCreationServiceImpl@b066.restoreWorkflow$1");
        return objLJI;
    }
}
