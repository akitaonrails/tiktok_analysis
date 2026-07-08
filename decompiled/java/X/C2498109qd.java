package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.EPAIGCPanelRootComponent$tryCheckFaceAndRealGenerate$1", f = "EPAIGCPanelRootComponent.kt", l = {1083}, m = "invokeSuspend")
public final class C2498109qd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C378920EtO LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2498109qd(C378920EtO c378920EtO, List<String> list, InterfaceC1364105Vn<? super C2498109qd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c378920EtO;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2498109qd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EPAIGCPanelRootComponent@c726.tryCheckFaceAndRealGenerate$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C2497509qX c2497509qX = new C2497509qX(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c2497509qX);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.tryCheckFaceAndRealGenerate$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILLJJLI.T4().Jc2();
            this.LLILLJJLI.v3().Kg2(C0F1E.ENABLED);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.tryCheckFaceAndRealGenerate$1");
            return unit;
        }
        this.LLILLJJLI.E5();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.tryCheckFaceAndRealGenerate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
