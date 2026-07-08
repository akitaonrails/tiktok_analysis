package X;

import com.ss.android.ugc.aweme.aikit.api.create.AICreateService;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.creation.AIGCTaskHandleComponent$cancelWorkflow$1", f = "AIGCTaskHandleComponent.kt", l = {}, m = "invokeSuspend")
public final class C546930Lch extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIGCCreationModel LL;
    public final /* synthetic */ C546940Lci LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546930Lch(AIGCCreationModel aIGCCreationModel, C546940Lci c546940Lci, InterfaceC1364105Vn<? super C546930Lch> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCCreationModel;
        this.LLILLJJLI = c546940Lci;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C546930Lch(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AIGCGenerationModel aIGCGenerationModelZG;
        String clientTaskId;
        C1C7U.LIZ("AIGCTaskHandleComponent@9d9c.cancelWorkflow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AIGCCreationModel aIGCCreationModel = this.LL;
        if (aIGCCreationModel != null && (aIGCGenerationModelZG = aIGCCreationModel.ZG()) != null && (clientTaskId = aIGCGenerationModelZG.getClientTaskId()) != null) {
            AICreateService aICreateServiceX1 = this.LLILLJJLI.X1();
            if (aICreateServiceX1 != null) {
                aICreateServiceX1.nw(clientTaskId, this.LL);
            }
            InterfaceC546960Lck interfaceC546960Lck = this.LLILLJJLI.LLILLL;
            if (interfaceC546960Lck != null) {
                interfaceC546960Lck.onStop();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.cancelWorkflow$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.cancelWorkflow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
