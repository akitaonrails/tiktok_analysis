package X;

import Y.AObjectS378S0100000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05PC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSwitchKt$TuxSwitch$4$1", f = "TuxSwitch.kt", l = {118}, m = "invokeSuspend")
public final class C05PC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C594920NVa<Boolean> LLILLJJLI;
    public final /* synthetic */ C05P1<Boolean> LLILLL;
    public final /* synthetic */ C05P1<Function1<Boolean, Unit>> LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05PC(C594920NVa<Boolean> c594920NVa, C05P1<Boolean> c05p1, C05P1<? extends Function1<? super Boolean, Unit>> c05p12, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C05PC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c594920NVa;
        this.LLILLL = c05p1;
        this.LLILZ = c05p12;
        this.LLILZIL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05PC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxSwitchKt@eb2.TuxSwitch$4$1");
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
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AObjectS378S0100000_2(this.LLILLJJLI, 10));
            C05P8 c05p8 = new C05P8(this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (C09IC.LJII(c095dLJIIIZ, this, c05p8) == objLJFF) {
                C1C7U.LIZIZ("TuxSwitchKt@eb2.TuxSwitch$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxSwitchKt@eb2.TuxSwitch$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
