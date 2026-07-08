package X;

import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LPD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.notify.push.AIPortraitGenerationPushProcessor$restoreTask$1", f = "AIPortraitGenerationPushProcessor.kt", l = {159, 165}, m = "invokeSuspend")
public final class C0LPD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LPC LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC542330LOt LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LPD(C0LPC c0lpc, String str, InterfaceC542330LOt interfaceC542330LOt, InterfaceC1364105Vn<? super C0LPD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lpc;
        this.LLILLL = str;
        this.LLILZ = interfaceC542330LOt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LPD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitGenerationPushProcessor@e693.restoreTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AIPortraitGenerationPushProcessor@e693.restoreTask$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0LPC c0lpc = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = c0lpc.LJFF(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPortraitGenerationPushProcessor@e693.restoreTask$1");
                return objLJFF;
            }
        }
        C552940LmO c552940LmO = (C552940LmO) obj;
        if (c552940LmO == null) {
            InterfaceC542330LOt interfaceC542330LOt = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[AIPortraitGenerationPushProcessor] restoreTask: workflow not found, serverTaskId=");
            sbLIZ.append(this.LLILLL);
            interfaceC542330LOt.d(C2188811AlT.LIZIZ(sbLIZ));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AIPortraitGenerationPushProcessor@e693.restoreTask$1");
            return unit2;
        }
        InterfaceC542330LOt interfaceC542330LOt2 = this.LLILZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[AIPortraitGenerationPushProcessor] restoreTask: restoring workflowId=");
        sbLIZ2.append(c552940LmO.LIZ);
        sbLIZ2.append(", serverTaskId=");
        sbLIZ2.append(this.LLILLL);
        interfaceC542330LOt2.d(C2188811AlT.LIZIZ(sbLIZ2));
        AIGCWorkflowManagementApi aIGCWorkflowManagementApi = this.LLILLJJLI.LIZIZ;
        if (aIGCWorkflowManagementApi != null) {
            String str2 = c552940LmO.LIZ;
            this.LL = 2;
            if (aIGCWorkflowManagementApi.LJIIIZ(str2, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitGenerationPushProcessor@e693.restoreTask$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitGenerationPushProcessor@e693.restoreTask$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
