package X;

import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine$registerTaskFactory$job$1", f = "GatekeeperEngine.kt", l = {347}, m = "invokeSuspend")
public final class C593790NQr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GatekeeperEngine LLILLJJLI;
    public final /* synthetic */ C0NR2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593790NQr(GatekeeperEngine gatekeeperEngine, C0NR2 c0nr2, InterfaceC1364105Vn<? super C593790NQr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = gatekeeperEngine;
        this.LLILLL = c0nr2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593790NQr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GatekeeperEngine@cdc1.registerTaskFactory$job$1");
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
                C1C7U.LIZIZ("GatekeeperEngine@cdc1.registerTaskFactory$job$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZLLL.add(this.LLILLL);
        this.LLILLJJLI.LJIIJ.LIZIZ(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GatekeeperEngine@cdc1.registerTaskFactory$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
