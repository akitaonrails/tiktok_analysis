package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
public final class C417701jr extends C09AX implements Function2<Float, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ float LL;

    public C417701jr(InterfaceC1364105Vn<? super C417701jr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C417701jr c417701jr = new C417701jr(interfaceC1364105Vn);
        c417701jr.LL = ((Number) obj).floatValue();
        return c417701jr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Float.valueOf(f.floatValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
