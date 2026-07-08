package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IQB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
public final class C0IQB extends C09AX implements Function2<C13Y3, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C0IQB(InterfaceC1364105Vn<? super C0IQB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0IQB c0iqb = new C0IQB(interfaceC1364105Vn);
        c0iqb.LL = obj;
        return c0iqb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == C13Y3.ShutDown) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C13Y3 c13y3, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c13y3, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
