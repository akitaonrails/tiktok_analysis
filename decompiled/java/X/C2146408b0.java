package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08b0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel$AttachedComposable$2$1$2", f = "ScopedViewModelExt.kt", l = {}, m = "invokeSuspend")
public final class C2146408b0 extends C09AX implements Function2<Lifecycle.Event, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C2146408b0(InterfaceC1364105Vn<? super C2146408b0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2146408b0 c2146408b0 = new C2146408b0(interfaceC1364105Vn);
        c2146408b0.LL = obj;
        return c2146408b0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == Lifecycle.Event.ON_RESUME) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Lifecycle.Event event, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(event, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
