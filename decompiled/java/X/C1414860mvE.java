package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.MixEditingMaterialsDataManager$fetchAllPanelData$1", f = "MixEditingMaterialsDataManager.kt", l = {155}, m = "invokeSuspend")
public final class C1414860mvE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1414880mvG LLILLJJLI;
    public final /* synthetic */ InterfaceC1414870mvF LLILLL;
    public final /* synthetic */ C1414840mvC LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414860mvE(C1414880mvG c1414880mvG, InterfaceC1414870mvF interfaceC1414870mvF, C1414840mvC c1414840mvC, InterfaceC1364105Vn<? super C1414860mvE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1414880mvG;
        this.LLILLL = interfaceC1414870mvF;
        this.LLILZ = c1414840mvC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1414860mvE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MixEditingMaterialsDataManager@65bf.fetchAllPanelData$1");
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
            int iLJZI = C13LP.LJZI(this.LLILLJJLI.LJIIL);
            this.LL = 1;
            obj = C23250099c.LJI(this, C576120Mig.LIZIZ, new AnonymousClass0901(iLJZI, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixEditingMaterialsDataManager@65bf.fetchAllPanelData$1");
                return objLJFF;
            }
        }
        List<C1412860ms0> list = (List) obj;
        if (list != null) {
            this.LLILLL.LIZ(list, new C1414810mv9(true, null));
            this.LLILZ.getClass();
            C1414840mvC.LJI(0);
        } else {
            this.LLILZ.LIZLLL(C1414880mvG.LIZ(this.LLILLJJLI, 0, 0, true, 67043327), this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixEditingMaterialsDataManager@65bf.fetchAllPanelData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
