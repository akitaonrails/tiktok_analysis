package X;

import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine$reset$job$1", f = "GatekeeperEngine.kt", l = {434}, m = "invokeSuspend")
public final class C593810NQt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GatekeeperEngine LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593810NQt(GatekeeperEngine gatekeeperEngine, InterfaceC1364105Vn<? super C593810NQt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = gatekeeperEngine;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593810NQt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GatekeeperEngine@cdc1.reset$job$1");
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
            C1DEV c1dev = this.LLILLJJLI.LJIIJ;
            this.LL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("GatekeeperEngine@cdc1.reset$job$1");
                return objLJFF;
            }
        }
        Iterator it2 = ((LinkedHashMap) this.LLILLJJLI.LJII).entrySet().iterator();
        while (it2.hasNext()) {
            ((C0NR1) ((Map.Entry) it2.next()).getValue()).LIZ();
        }
        ((ArrayList) this.LLILLJJLI.LJI).clear();
        this.LLILLJJLI.LIZJ.clear();
        GatekeeperEngine gatekeeperEngine = this.LLILLJJLI;
        gatekeeperEngine.LIZIZ = 0;
        gatekeeperEngine.LJIIJ.LIZIZ(null);
        C23118094a.LJ(this.LLILLJJLI.LJIIIZ.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GatekeeperEngine@cdc1.reset$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
