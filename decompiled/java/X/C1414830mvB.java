package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.MixEditingMaterialsDataManager$fetchAllPanelData$3", f = "MixEditingMaterialsDataManager.kt", l = {}, m = "invokeSuspend")
public final class C1414830mvB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1414840mvC LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414830mvB(C1414840mvC c1414840mvC, int i, InterfaceC1364105Vn<? super C1414830mvB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1414840mvC;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1414830mvB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixEditingMaterialsDataManager@65bf.fetchAllPanelData$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1414840mvC c1414840mvC = this.LL;
        int i = this.LLILLJJLI;
        c1414840mvC.getClass();
        C1414840mvC.LJI(i);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixEditingMaterialsDataManager@65bf.fetchAllPanelData$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
