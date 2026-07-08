package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.stranger.DefaultMessageRequestManager$loadAllConvs$1", f = "DefaultMessageRequestManager.kt", l = {}, m = "invokeSuspend")
public final class C871210YFr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C871200YFq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C871210YFr(C871200YFq c871200YFq, InterfaceC1364105Vn<? super C871210YFr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c871200YFq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C871210YFr(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultMessageRequestManager@9541.loadAllConvs$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869260Y8e c869260Y8eLJIIJJI = this.LL.LIZJ.LIZIZ().LJIIJJI();
        this.LL.LIZ.LJIIIZ().getClass();
        List<Pair> listLJIL = C2097808Js.LJIL(c869260Y8eLJIIJJI.LJIILJJIL());
        C871250YFv c871250YFvLJIJJLI = this.LL.LJIJJLI();
        if (c871250YFvLJIJJLI.LIZIZ) {
            for (Pair pair : listLJIL) {
                c871250YFvLJIJJLI.LIZ((String) pair.getFirst(), (C0Y9G) pair.getSecond());
            }
        } else {
            c871250YFvLJIJJLI.LIZ.putAll(C2097608Jq.LJIILLIIL(listLJIL));
        }
        C871200YFq c871200YFq = this.LL;
        c871200YFq.LJIIIZ = true;
        c871200YFq.LJJIII();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultMessageRequestManager@9541.loadAllConvs$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
