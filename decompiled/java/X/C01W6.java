package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01W6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
public final class C01W6 extends C09AX implements Function2<InterfaceC1369205Xm, InterfaceC1364105Vn<? super Unit>, Object> {
    public C01W6(InterfaceC1364105Vn<? super C01W6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01W6(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01W6(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
