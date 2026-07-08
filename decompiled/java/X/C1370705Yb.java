package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
public final class C1370705Yb extends C09AX implements Function2<C05YY, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C1370705Yb(InterfaceC1364105Vn<? super C1370705Yb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1370705Yb c1370705Yb = new C1370705Yb(interfaceC1364105Vn);
        c1370705Yb.LL = obj;
        return c1370705Yb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != C05YY.START) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05YY c05yy, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c05yy, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
