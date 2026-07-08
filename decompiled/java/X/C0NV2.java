package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NV2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSwitchKt$TuxSwitch$6$1$3", f = "TuxSwitch.kt", l = {140}, m = "invokeSuspend")
public final class C0NV2 extends C09AX implements Function2<Pair<? extends Boolean, ? extends C0NNS>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C594920NVa<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NV2(boolean z, C594920NVa<Boolean> c594920NVa, InterfaceC1364105Vn<? super C0NV2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c594920NVa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NV2 c0nv2 = new C0NV2(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0nv2.LLILLJJLI = obj;
        return c0nv2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C1C7U.LIZ("TuxSwitchKt@eb2.TuxSwitch$6$1$3");
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
            Pair pair = (Pair) this.LLILLJJLI;
            boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
            Object second = pair.getSecond();
            if (((second instanceof C0NV7) || (second instanceof C0NV6)) && zBooleanValue != (z = this.LLILLL)) {
                C594920NVa<Boolean> c594920NVa = this.LLILZ;
                Boolean boolValueOf = Boolean.valueOf(z);
                this.LL = 1;
                Object objLIZ = c594920NVa.LIZ(boolValueOf, EnumC1384205bM.Default, new C0NVQ(null), this);
                if (objLIZ != C099R.LJFF()) {
                    objLIZ = Unit.LIZ;
                }
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("TuxSwitchKt@eb2.TuxSwitch$6$1$3");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxSwitchKt@eb2.TuxSwitch$6$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Boolean, ? extends C0NNS> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
