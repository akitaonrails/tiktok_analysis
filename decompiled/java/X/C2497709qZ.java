package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.EPAIGCPanelRootComponent$clipVideoAndGenerate$1$6$1", f = "EPAIGCPanelRootComponent.kt", l = {1347, 1348}, m = "invokeSuspend")
public final class C2497709qZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C378920EtO LLILLJJLI;
    public final /* synthetic */ NLETrackSlot LLILLL;
    public final /* synthetic */ AIGCGenerationParam LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497709qZ(C378920EtO c378920EtO, NLETrackSlot nLETrackSlot, AIGCGenerationParam aIGCGenerationParam, InterfaceC1364105Vn<? super C2497709qZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c378920EtO;
        this.LLILLL = nLETrackSlot;
        this.LLILZ = aIGCGenerationParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2497709qZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAIGCPanelRootComponent@c726.clipVideoAndGenerate$1$6$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.clipVideoAndGenerate$1$6$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C378920EtO c378920EtO = this.LLILLJJLI;
            NLETrackSlot nLETrackSlot = this.LLILLL;
            this.LL = 1;
            obj = c378920EtO.S5(nLETrackSlot, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.clipVideoAndGenerate$1$6$1");
                return objLJFF;
            }
        }
        C378920EtO c378920EtO2 = this.LLILLJJLI;
        AIGCGenerationParam aIGCGenerationParam = this.LLILZ;
        this.LL = 2;
        if (c378920EtO2.H2(aIGCGenerationParam, (String) obj, this) == objLJFF) {
            C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.clipVideoAndGenerate$1$6$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.clipVideoAndGenerate$1$6$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
