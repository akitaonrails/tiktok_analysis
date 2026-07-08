package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxMotionCurve$Start$1$1$3", f = "TuxMotionCurve.kt", l = {}, m = "invokeSuspend")
public final class C01RE extends C09AX implements Function2<Float, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ float LL;

    public C01RE(InterfaceC1364105Vn<? super C01RE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01RE c01re = new C01RE(interfaceC1364105Vn);
        c01re.LL = ((Number) obj).floatValue();
        return c01re;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TuxMotionCurve@b76c.Start$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TuxMotionCurve@b76c.Start$1$1$3");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Float.valueOf(f.floatValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
