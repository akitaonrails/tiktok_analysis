package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.EPAIGCPanelRootComponent$proceedWithRealGenerate$1", f = "EPAIGCPanelRootComponent.kt", l = {1109}, m = "invokeSuspend")
public final class C2498009qc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C378920EtO LLILLJJLI;
    public final /* synthetic */ AIGCGenerationParam LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2498009qc(C378920EtO c378920EtO, AIGCGenerationParam aIGCGenerationParam, InterfaceC1364105Vn<? super C2498009qc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c378920EtO;
        this.LLILLL = aIGCGenerationParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2498009qc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAIGCPanelRootComponent@c726.proceedWithRealGenerate$1");
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
            C378920EtO c378920EtO = this.LLILLJJLI;
            AIGCGenerationParam aIGCGenerationParam = this.LLILLL;
            String str = aIGCGenerationParam.imagePath;
            this.LL = 1;
            if (c378920EtO.H2(aIGCGenerationParam, str, this) == objLJFF) {
                C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.proceedWithRealGenerate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.proceedWithRealGenerate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
