package X;

import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenBaseGlueDynamicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gQT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenBaseGlueDynamicComponent$setupDataListener$subscribeData$1$1", f = "RavenBaseGlueDynamicComponent.kt", l = {}, m = "invokeSuspend")
public final class C1165150gQT extends C09AX implements Function2<BaseComponentData, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RavenBaseGlueDynamicComponent<BaseComponentData> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165150gQT(RavenBaseGlueDynamicComponent<BaseComponentData> ravenBaseGlueDynamicComponent, InterfaceC1364105Vn<? super C1165150gQT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ravenBaseGlueDynamicComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1165150gQT c1165150gQT = new C1165150gQT(this.LLILLJJLI, interfaceC1364105Vn);
        c1165150gQT.LL = obj;
        return c1165150gQT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RavenBaseGlueDynamicComponent@d60d.setupDataListener$subscribeData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BaseComponentData baseComponentData = (BaseComponentData) this.LL;
        if (baseComponentData == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RavenBaseGlueDynamicComponent@d60d.setupDataListener$subscribeData$1$1");
            return unit;
        }
        this.LLILLJJLI.Ab1(baseComponentData);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RavenBaseGlueDynamicComponent@d60d.setupDataListener$subscribeData$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseComponentData baseComponentData, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(baseComponentData, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
