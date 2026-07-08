package X;

import com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.AIGCArchWorkflowInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl$submitDefaultWorkflow$1", f = "AIGCArchWorkflowManagerImpl.kt", l = {69}, m = "invokeSuspend")
public final class C542710LQf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C542800LQo<String>>, Object> {
    public int LL;
    public final /* synthetic */ AIGCArchWorkflowManagerImpl LLILLJJLI;
    public final /* synthetic */ AIGCArchWorkflowInput LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542710LQf(AIGCArchWorkflowManagerImpl aIGCArchWorkflowManagerImpl, AIGCArchWorkflowInput aIGCArchWorkflowInput, InterfaceC1364105Vn<? super C542710LQf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCArchWorkflowManagerImpl;
        this.LLILLL = aIGCArchWorkflowInput;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C542710LQf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCArchWorkflowManagerImpl@6dc5.submitDefaultWorkflow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AIGCArchWorkflowManagerImpl aIGCArchWorkflowManagerImpl = this.LLILLJJLI;
            AIGCArchWorkflowInput aIGCArchWorkflowInput = this.LLILLL;
            this.LL = 1;
            aIGCArchWorkflowManagerImpl.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C542700LQe(aIGCArchWorkflowInput, aIGCArchWorkflowManagerImpl, null, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCArchWorkflowManagerImpl@6dc5.submitDefaultWorkflow$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIGCArchWorkflowManagerImpl@6dc5.submitDefaultWorkflow$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C542800LQo<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
