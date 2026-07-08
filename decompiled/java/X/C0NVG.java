package X;

import Y.AObjectS384S0100000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxPanelKt$TuxPanelContentSheetImpl$1$1", f = "TuxPanel.kt", l = {235, 247}, m = "invokeSuspend")
public final class C0NVG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C594920NVa<C0NWD> LLILLJJLI;
    public final /* synthetic */ Function1<Float, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NVG(C594920NVa<C0NWD> c594920NVa, Function1<? super Float, Unit> function1, InterfaceC1364105Vn<? super C0NVG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c594920NVa;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NVG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long jLJII = C19990313Jl.LJII(250, EnumC19990213Jk.MILLISECONDS);
            this.LL = 1;
            if (AnonymousClass0958.LIZJ(jLJII, this) == objLJFF) {
                C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1");
                return objLJFF;
            }
        }
        C414301jJ c414301jJ = new C414301jJ(C20028913Yh.LJIIIZ(new AObjectS384S0100000_9(this.LLILLJJLI, 25)), C20028913Yh.LJIIIZ(new AObjectS384S0100000_9(this.LLILLJJLI, 26)), new C0NVF(this.LLILLJJLI, null));
        C467201rq c467201rq = new C467201rq(this.LLILLL, null);
        this.LL = 2;
        if (C09IC.LJII(c414301jJ, this, c467201rq) == objLJFF) {
            C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
