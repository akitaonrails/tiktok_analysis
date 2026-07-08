package X;

import k0.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.112M, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {522}, m = "invokeSuspend")
public final class C112M extends C09AX implements Function2<C1378605aS, InterfaceC1364105Vn<? super C1378605aS>, Object> {
    public int LL;
    public /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C20074413gc LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112M(C20074413gc c20074413gc, InterfaceC1364105Vn<? super C112M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20074413gc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            C20082713hx c20082713hx = this.LLILLL.LLJLILLLLZIIL;
            this.LL = 1;
            obj = f2.LIZ(c20082713hx, j, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        return obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C112M c112m = new C112M(this.LLILLL, interfaceC1364105Vn);
        c112m.LLILLJJLI = ((C1378605aS) obj).LIZ;
        return c112m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1378605aS c1378605aS, InterfaceC1364105Vn<? super C1378605aS> interfaceC1364105Vn) {
        return ((a) create(new C1378605aS(c1378605aS.LIZ), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
