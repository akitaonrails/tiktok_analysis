package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.112O, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
public final class C112O extends C09AX implements Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112O(long j, InterfaceC1364105Vn<? super C112O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C112O c112o = new C112O(this.LLILLJJLI, interfaceC1364105Vn);
        c112o.LL = obj;
        return c112o;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C112R) this.LL).LIZIZ(this.LLILLJJLI);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C112R c112r, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c112r, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
