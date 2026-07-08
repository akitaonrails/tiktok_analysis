package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NWF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSheetKt$TuxSheet$2$1$2$1$2$1", f = "TuxSheet.kt", l = {320, 322, 326, 335, 337, 341}, m = "invokeSuspend")
public final class C0NWF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NWJ LLILLJJLI;
    public final /* synthetic */ C594920NVa<C0NWD> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NWF(C0NWJ c0nwj, C594920NVa<C0NWD> c594920NVa, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C0NWF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nwj;
        this.LLILLL = c594920NVa;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NWF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$2$1");
        Object objLJFF = C099R.LJFF();
        switch (this.LL) {
            case 0:
                C155000ia.LIZIZ(obj);
                this.LLILZ.setValue(Boolean.TRUE);
                C0NWJ c0nwj = this.LLILLJJLI;
                if (c0nwj instanceof C0NWG) {
                    c0nwj.getClass();
                    if (C1668650tWZ.LIZJ(0.0f, Float.NaN)) {
                        C594920NVa<C0NWD> c594920NVa = this.LLILLL;
                        C0NWB c0nwb = C0NWB.LIZ;
                        this.LL = 1;
                        if (C1677950tlZ.LJFF(c594920NVa, c0nwb, this) == objLJFF) {
                            C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$2$1");
                            return objLJFF;
                        }
                    } else {
                        C594920NVa<C0NWD> c594920NVa2 = this.LLILLL;
                        C0NWE c0nwe = C0NWE.LIZ;
                        this.LL = 2;
                        if (C1677950tlZ.LJFF(c594920NVa2, c0nwe, this) == objLJFF) {
                            C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$2$1");
                            return objLJFF;
                        }
                    }
                } else if (c0nwj instanceof C1396405dK) {
                    C594920NVa<C0NWD> c594920NVa3 = this.LLILLL;
                    C0NWE c0nwe2 = C0NWE.LIZ;
                    this.LL = 3;
                    if (C1677950tlZ.LJFF(c594920NVa3, c0nwe2, this) == objLJFF) {
                        C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$2$1");
                        return objLJFF;
                    }
                } else if (!(c0nwj instanceof C1259304wJ)) {
                    C594920NVa<C0NWD> c594920NVa4 = this.LLILLL;
                    C0NWB c0nwb2 = C0NWB.LIZ;
                    this.LL = 6;
                    if (C1677950tlZ.LJFF(c594920NVa4, c0nwb2, this) == objLJFF) {
                        C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$2$1");
                        return objLJFF;
                    }
                } else {
                    c0nwj.getClass();
                    throw null;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C155000ia.LIZIZ(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
