package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
public final class C314680CVe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C319410Cfb LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314680CVe(C319410Cfb c319410Cfb, InterfaceC1364105Vn<? super C314680CVe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c319410Cfb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C314680CVe c314680CVe = new C314680CVe(this.LLILLJJLI, interfaceC1364105Vn);
        c314680CVe.LL = obj;
        return c314680CVe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C09AE andSet = this.LLILLJJLI.LIZIZ.getAndSet(null);
        C319410Cfb c319410Cfb = this.LLILLJJLI;
        AtomicReference<C09AE> atomicReference = c319410Cfb.LIZIZ;
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C314690CVf(andSet, c319410Cfb, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, anonymousClass0956LIZLLL)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
