package X;

import Y.AObjectS384S0100000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NV3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSwitchKt$TuxSwitch$6$1", f = "TuxSwitch.kt", l = {135}, m = "invokeSuspend")
public final class C0NV3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC595010NVj LLILLJJLI;
    public final /* synthetic */ C594920NVa<Boolean> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NV3(InterfaceC595010NVj interfaceC595010NVj, C594920NVa<Boolean> c594920NVa, boolean z, InterfaceC1364105Vn<? super C0NV3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC595010NVj;
        this.LLILLL = c594920NVa;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NV3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxSwitchKt@eb2.TuxSwitch$6$1");
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
            C414301jJ c414301jJ = new C414301jJ(C20028913Yh.LJIIIZ(new AObjectS384S0100000_9(this.LLILLL, 22)), this.LLILLJJLI.LIZIZ(), new C0NNR(null));
            C0NV2 c0nv2 = new C0NV2(this.LLILZ, this.LLILLL, null);
            this.LL = 1;
            if (C09IC.LJII(c414301jJ, this, c0nv2) == objLJFF) {
                C1C7U.LIZIZ("TuxSwitchKt@eb2.TuxSwitch$6$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxSwitchKt@eb2.TuxSwitch$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
