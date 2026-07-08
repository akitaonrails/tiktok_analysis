package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0NVI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSheetKt$TuxSheet$2$1$2$1$3$1$4", f = "TuxSheet.kt", l = {}, m = "invokeSuspend")
public final class C0NVI extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ C594920NVa<C0NWD> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVI(C594920NVa<C0NWD> c594920NVa, Function0<Unit> function0, InterfaceC1364105Vn<? super C0NVI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c594920NVa;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NVI c0nvi = new C0NVI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0nvi.LL = ((Boolean) obj).booleanValue();
        return c0nvi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        C1C7U.LIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$3$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL && Intrinsics.LJFF(this.LLILLJJLI.LJ(), C0NWC.LIZ) && (function0 = this.LLILLL) != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$3$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
