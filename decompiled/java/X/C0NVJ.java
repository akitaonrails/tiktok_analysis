package X;

import Y.AObjectS384S0100000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSheetKt$TuxSheet$2$1$2$1$3$1", f = "TuxSheet.kt", l = {350}, m = "invokeSuspend")
public final class C0NVJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ C594920NVa<C0NWD> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVJ(C05P0<Boolean> c05p0, C594920NVa<C0NWD> c594920NVa, Function0<Unit> function0, InterfaceC1364105Vn<? super C0NVJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c594920NVa;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NVJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$3$1");
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
                C414301jJ c414301jJ = new C414301jJ(C20028913Yh.LJIIIZ(new AObjectS384S0100000_9(this.LLILLL, 23)), C20028913Yh.LJIIIZ(new AObjectS384S0100000_9(this.LLILLL, 24)), new C0NVH(this.LLILLL, null));
                C0NVI c0nvi = new C0NVI(this.LLILLL, this.LLILZ, null);
                this.LL = 1;
                if (C09IC.LJII(c414301jJ, this, c0nvi) == objLJFF) {
                    C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$3$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
