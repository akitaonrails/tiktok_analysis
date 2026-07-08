package X;

import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenBaseGlueDynamicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenBaseGlueDynamicComponent$subscribeUnBind$1$1", f = "RavenBaseGlueDynamicComponent.kt", l = {}, m = "invokeSuspend")
public final class C1165140gQS extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RavenBaseGlueDynamicComponent<BaseComponentData> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165140gQS(RavenBaseGlueDynamicComponent<BaseComponentData> ravenBaseGlueDynamicComponent, InterfaceC1364105Vn<? super C1165140gQS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ravenBaseGlueDynamicComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1165140gQS c1165140gQS = new C1165140gQS(this.LLILLJJLI, interfaceC1364105Vn);
        c1165140gQS.LL = obj;
        return c1165140gQS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1161870gLB c1161870gLBBr;
        C1C7U.LIZ("RavenBaseGlueDynamicComponent@d60d.subscribeUnBind$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RavenBaseGlueDynamicComponent@d60d.subscribeUnBind$1$1");
            return unit;
        }
        RavenBaseGlueDynamicComponent<BaseComponentData> ravenBaseGlueDynamicComponent = this.LLILLJJLI;
        InterfaceC1161620gKm interfaceC1161620gKmSH = ravenBaseGlueDynamicComponent.sH();
        if (interfaceC1161620gKmSH != null && (c1161870gLBBr = interfaceC1161620gKmSH.Br()) != null) {
            c1161870gLBBr.LIZIZ(ravenBaseGlueDynamicComponent);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RavenBaseGlueDynamicComponent@d60d.subscribeUnBind$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
