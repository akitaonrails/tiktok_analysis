package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0947, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0947 extends C09AX implements Function2<C094N<? extends Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C259800zU<Object> LLILLJJLI;
    public final /* synthetic */ AnonymousClass0954<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0947(C259800zU<Object> c259800zU, AnonymousClass0954<Unit> anonymousClass0954, InterfaceC1364105Vn<? super AnonymousClass0947> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = anonymousClass0954;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0947 anonymousClass0947 = new AnonymousClass0947(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        anonymousClass0947.LL = obj;
        return anonymousClass0947;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.09AU] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ?? r3 = ((C094N) this.LL).LIZ;
        C259800zU<Object> c259800zU = this.LLILLJJLI;
        boolean z = r3 instanceof C094O;
        if (!z) {
            c259800zU.element = r3;
        }
        AnonymousClass0954<Unit> anonymousClass0954 = this.LLILLL;
        if (z) {
            Throwable thLIZ = C094N.LIZ(r3);
            if (thLIZ == null) {
                anonymousClass0954.LIZIZ(new C23038090y());
                c259800zU.element = C09AV.LIZJ;
            } else {
                throw thLIZ;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094N<? extends Object> c094n, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(new C094N(c094n.LIZ), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
