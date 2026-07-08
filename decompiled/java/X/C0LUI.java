package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LUI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl$getWorkflowStateFlowWithLifecycle$1", f = "AIGCArchWorkflowManagerImpl.kt", l = {106}, m = "invokeSuspend")
public final class C0LUI extends C09AX implements Function2<InterfaceC346701Wf<? super C0LU9>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIGCArchWorkflowManagerImpl LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C546660LcG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LUI(AIGCArchWorkflowManagerImpl aIGCArchWorkflowManagerImpl, String str, C546660LcG c546660LcG, InterfaceC1364105Vn<? super C0LUI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIGCArchWorkflowManagerImpl;
        this.LLILZ = str;
        this.LLILZIL = c546660LcG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LUI c0lui = new C0LUI(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0lui.LLILLJJLI = obj;
        return c0lui;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa c516501zn;
        InterfaceC346201Wa<C0LSZ> interfaceC346201WaLJJJJL;
        C1C7U.LIZ("AIGCArchWorkflowManagerImpl@6dc5.getWorkflowStateFlowWithLifecycle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
                this.LLILLL.getClass();
                ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = AIGCArchWorkflowManagerImpl.LIZ();
                if (iCreationAsyncTaskManagerLIZ != null && (interfaceC346201WaLJJJJL = iCreationAsyncTaskManagerLIZ.LJJJJL(this.LLILZ)) != null) {
                    c516501zn = new C581150Mqn(new C05RH(interfaceC346201WaLJJJJL), this.LLILLL, 8);
                } else {
                    c516501zn = new C516501zn(C0LUD.LIZ, 1);
                }
                String str = this.LLILZ;
                C546660LcG c546660LcG = this.LLILZIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start observing task ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[AIGCArchUnifiedTaskObserver] ");
                sbLIZ2.append(strLIZIZ);
                C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                C547010Lcp.LIZ(str, c546660LcG).LIZ();
                this.LL = 1;
                if (C09IC.LJIILLIIL(this, c516501zn, interfaceC346701Wf) == objLJFF) {
                    C1C7U.LIZIZ("AIGCArchWorkflowManagerImpl@6dc5.getWorkflowStateFlowWithLifecycle$1");
                    return objLJFF;
                }
            }
            String str2 = this.LLILZ;
            C546660LcG c546660LcG2 = this.LLILZIL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("stop observing task ");
            sbLIZ3.append(str2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[AIGCArchUnifiedTaskObserver] ");
            sbLIZ4.append(strLIZIZ2);
            C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            C547010Lcp.LIZ(str2, c546660LcG2).LIZIZ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIGCArchWorkflowManagerImpl@6dc5.getWorkflowStateFlowWithLifecycle$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String str3 = this.LLILZ;
            C546660LcG c546660LcG3 = this.LLILZIL;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("stop observing task ");
            sbLIZ5.append(str3);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("[AIGCArchUnifiedTaskObserver] ");
            sbLIZ6.append(strLIZIZ3);
            C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
            C547010Lcp.LIZ(str3, c546660LcG3).LIZIZ();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0LU9> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
