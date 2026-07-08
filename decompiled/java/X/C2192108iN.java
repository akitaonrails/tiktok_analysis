package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08iN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel$AttachedComposable$1$2", f = "ScopedViewModelExt.kt", l = {}, m = "invokeSuspend")
public final class C2192108iN extends C09AX implements Function2<Lifecycle.Event, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2192208iO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192108iN(C2192208iO c2192208iO, InterfaceC1364105Vn<? super C2192108iN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2192208iO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2192108iN c2192108iN = new C2192108iN(this.LLILLJJLI, interfaceC1364105Vn);
        c2192108iN.LL = obj;
        return c2192108iN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == Lifecycle.Event.ON_DESTROY) {
            C2252321DDq c2252321DDq = this.LLILLJJLI.LJI;
            while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), null)) {
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Lifecycle.Event event, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(event, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
