package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0z2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace.MixPerfTracer$reportMixCardPerf$2$1", f = "MixPerfTracer.kt", l = {}, m = "invokeSuspend")
public final class C1880830z2n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C474500IjA LL;
    public final /* synthetic */ InterfaceC1883030z6L LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880830z2n(C474500IjA c474500IjA, InterfaceC1883030z6L interfaceC1883030z6L, InterfaceC1364105Vn<? super C1880830z2n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c474500IjA;
        this.LLILLJJLI = interfaceC1883030z6L;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1880830z2n(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1880850z2p interfaceC1880850z2p;
        C1C7U.LIZ("MixPerfTracer@bb0.reportMixCardPerf$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, String> mapLJIJI = this.LL.LJIJI();
        InterfaceC1883030z6L interfaceC1883030z6L = this.LLILLJJLI;
        if (mapLJIJI != null) {
            C476770Imp.LJ(mapLJIJI);
        }
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ = interfaceC1883030z6L.LIZJ();
        if (interfaceC1881340z3cLIZJ != null && (interfaceC1880850z2p = (InterfaceC1880850z2p) interfaceC1881340z3cLIZJ.LJIILJJIL().LIZ(InterfaceC1880850z2p.class)) != null) {
            interfaceC1880850z2p.LJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixPerfTracer@bb0.reportMixCardPerf$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
