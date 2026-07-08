package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSheetKt$TuxSheet$2$1$2$1$7$2$1$1$1", f = "TuxSheet.kt", l = {575}, m = "invokeSuspend")
public final class C0NVK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C594920NVa<C0NWD> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVK(C594920NVa<C0NWD> c594920NVa, Function0<Unit> function0, InterfaceC1364105Vn<? super C0NVK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c594920NVa;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NVK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$7$2$1$1$1");
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
            C594920NVa<C0NWD> c594920NVa = this.LLILLJJLI;
            C0NWC c0nwc = C0NWC.LIZ;
            this.LL = 1;
            if (C1677950tlZ.LJFF(c594920NVa, c0nwc, this) == objLJFF) {
                C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$7$2$1$1$1");
                return objLJFF;
            }
        }
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$7$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
