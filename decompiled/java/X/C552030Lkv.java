package X;

import com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Lkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowServerNode$run$5", f = "AIGCWorkflowServerNode.kt", l = {111}, m = "invokeSuspend")
public final class C552030Lkv extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreateTaskResponse LLILLJJLI;
    public final /* synthetic */ C551990Lkr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C552030Lkv(CreateTaskResponse createTaskResponse, C551990Lkr c551990Lkr, InterfaceC1364105Vn<? super C552030Lkv> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = createTaskResponse;
        this.LLILLL = c551990Lkr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C552030Lkv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowServerNode@50c.run$5");
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
                C201955140j.LIZLLL(c0lx3, "AIGCWorkflowServerNode", C2188811AlT.LIZIZ(sbLIZ));
                C557760LuA c557760LuA = this.LLILLL.LIZ;
                this.LL = 1;
                if (c557760LuA.LIZ(str, this) == objLJFF) {
                    C1C7U.LIZIZ("AIGCWorkflowServerNode@50c.run$5");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCWorkflowServerNode@50c.run$5");
        return unit;
    }
}
