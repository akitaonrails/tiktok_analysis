package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowPollingNode$run$2", f = "AIGCWorkflowPollingNode.kt", l = {149}, m = "invokeSuspend")
public final class C551810LkZ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C551760LkU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551810LkZ(String str, C551760LkU c551760LkU, InterfaceC1364105Vn<? super C551810LkZ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c551760LkU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C551810LkZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowPollingNode@6d19.run$2");
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
            if (this.LLILLJJLI.length() > 0) {
                C0LX3 c0lx3 = C0LX3.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Canceling server-side AIGC task: ");
                sbLIZ.append(this.LLILLJJLI);
                C201955140j.LIZLLL(c0lx3, "AIGCWorkflowPollingNode", C2188811AlT.LIZIZ(sbLIZ));
                C557760LuA c557760LuA = this.LLILLL.LIZ;
                String str = this.LLILLJJLI;
                this.LL = 1;
                if (c557760LuA.LIZ(str, this) == objLJFF) {
                    C1C7U.LIZIZ("AIGCWorkflowPollingNode@6d19.run$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCWorkflowPollingNode@6d19.run$2");
        return unit;
    }
}
