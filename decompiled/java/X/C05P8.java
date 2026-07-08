package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05P8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSwitchKt$TuxSwitch$4$1$2", f = "TuxSwitch.kt", l = {}, m = "invokeSuspend")
public final class C05P8 extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ C05P1<Boolean> LLILLJJLI;
    public final /* synthetic */ C05P1<Function1<Boolean, Unit>> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05P8(C05P1<Boolean> c05p1, C05P1<? extends Function1<? super Boolean, Unit>> c05p12, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C05P8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p1;
        this.LLILLL = c05p12;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05P8 c05p8 = new C05P8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c05p8.LL = ((Boolean) obj).booleanValue();
        return c05p8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxSwitchKt@eb2.TuxSwitch$4$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        if (this.LLILLJJLI.getValue().booleanValue() != z) {
            Function1<Boolean, Unit> value = this.LLILLL.getValue();
            if (value != null) {
                value.invoke(Boolean.valueOf(z));
            }
            this.LLILZ.setValue(Boolean.valueOf(!r1.getValue().booleanValue()));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxSwitchKt@eb2.TuxSwitch$4$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
