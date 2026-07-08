package X;

import com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Lku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCLegacyWorkflowServerNode$run$3", f = "AIGCLegacyWorkflowServerNode.kt", l = {118}, m = "invokeSuspend")
public final class C552020Lku extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreateTaskResponse LLILLJJLI;
    public final /* synthetic */ C551980Lkq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C552020Lku(CreateTaskResponse createTaskResponse, C551980Lkq c551980Lkq, InterfaceC1364105Vn<? super C552020Lku> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = createTaskResponse;
        this.LLILLL = c551980Lkq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C552020Lku(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCLegacyWorkflowServerNode@4028.run$3");
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
            String str = this.LLILLJJLI.taskId;
            if (str != null && str.length() != 0) {
                C0LX3 c0lx3 = C0LX3.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Discarding server-side AIGC task: ");
                sbLIZ.append(str);
                C201955140j.LIZLLL(c0lx3, "AIGCLegacyWorkflowServerNode", C2188811AlT.LIZIZ(sbLIZ));
                C557760LuA c557760LuA = this.LLILLL.LIZ;
                this.LL = 1;
                if (c557760LuA.LIZ(str, this) == objLJFF) {
                    C1C7U.LIZIZ("AIGCLegacyWorkflowServerNode@4028.run$3");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCLegacyWorkflowServerNode@4028.run$3");
        return unit;
    }
}
