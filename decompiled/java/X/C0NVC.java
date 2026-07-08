package X;

import Y.AObjectS384S0100000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxPanelKt$TuxPanelContentSheetImpl$3$1", f = "TuxPanel.kt", l = {265}, m = "invokeSuspend")
public final class C0NVC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ C594920NVa<C0NWD> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVC(C05P0<Boolean> c05p0, C594920NVa<C0NWD> c594920NVa, Function0<Unit> function0, InterfaceC1364105Vn<? super C0NVC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c594920NVa;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NVC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$3$1");
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
            if (this.LLILLJJLI.getValue().booleanValue()) {
                C414301jJ c414301jJ = new C414301jJ(C20028913Yh.LJIIIZ(new AObjectS384S0100000_9(this.LLILLL, 27)), C20028913Yh.LJIIIZ(new AObjectS384S0100000_9(this.LLILLL, 28)), new C0NVE(this.LLILLL, null));
                C0NVD c0nvd = new C0NVD(this.LLILLL, this.LLILZ, null);
                this.LL = 1;
                if (C09IC.LJII(c414301jJ, this, c0nvd) == objLJFF) {
                    C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$3$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
