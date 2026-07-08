package X;

import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenBaseGlueDynamicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gQU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenBaseGlueDynamicComponent$subscribeExposure$1$1", f = "RavenBaseGlueDynamicComponent.kt", l = {}, m = "invokeSuspend")
public final class C1165160gQU extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RavenBaseGlueDynamicComponent<BaseComponentData> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165160gQU(RavenBaseGlueDynamicComponent<BaseComponentData> ravenBaseGlueDynamicComponent, InterfaceC1364105Vn<? super C1165160gQU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ravenBaseGlueDynamicComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1165160gQU c1165160gQU = new C1165160gQU(this.LLILLJJLI, interfaceC1364105Vn);
        c1165160gQU.LL = obj;
        return c1165160gQU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RavenBaseGlueDynamicComponent@d60d.subscribeExposure$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RavenBaseGlueDynamicComponent@d60d.subscribeExposure$1$1");
            return unit;
        }
        RavenBaseGlueDynamicComponent<BaseComponentData> ravenBaseGlueDynamicComponent = this.LLILLJJLI;
        ravenBaseGlueDynamicComponent.getClass();
        C1161800gL4.LIZLLL(ravenBaseGlueDynamicComponent);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RavenBaseGlueDynamicComponent@d60d.subscribeExposure$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
