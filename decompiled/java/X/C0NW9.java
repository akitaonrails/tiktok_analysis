package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NW9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {314}, m = "invokeSuspend")
public final class C0NW9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC595010NVj LLILLJJLI;
    public final /* synthetic */ C0NNS LLILLL;
    public final /* synthetic */ InterfaceC2238208po LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NW9(InterfaceC595010NVj interfaceC595010NVj, C0NNS c0nns, InterfaceC2238208po interfaceC2238208po, InterfaceC1364105Vn<? super C0NW9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC595010NVj;
        this.LLILLL = c0nns;
        this.LLILZ = interfaceC2238208po;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NW9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
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
            InterfaceC595010NVj interfaceC595010NVj = this.LLILLJJLI;
            C0NNS c0nns = this.LLILLL;
            this.LL = 1;
            if (interfaceC595010NVj.LIZ(c0nns, this) == objLJFF) {
                return objLJFF;
            }
        }
        InterfaceC2238208po interfaceC2238208po = this.LLILZ;
        if (interfaceC2238208po != null) {
            interfaceC2238208po.dispose();
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
