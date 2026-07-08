package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ufu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.agentbridge.PIPOCashierAgentBridgeImpl$fetchAndRefreshCashier$2$1", f = "PIPOCashierAgentBridgeServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1712880ufu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1712870uft LL;
    public final /* synthetic */ C1712960ug2 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1712880ufu(C1712870uft c1712870uft, C1712960ug2 c1712960ug2, String str, Map<String, String> map, InterfaceC1364105Vn<? super C1712880ufu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1712870uft;
        this.LLILLJJLI = c1712960ug2;
        this.LLILLL = str;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1712880ufu(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PIPOCashierAgentBridgeImpl@ef2c.fetchAndRefreshCashier$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1192660h8q interfaceC1192660h8q = this.LL.LJ;
        if (interfaceC1192660h8q == null) {
            C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.fetchAndRefreshCashier$2$1");
            return false;
        }
        C1712960ug2 c1712960ug2 = this.LLILLJJLI;
        interfaceC1192660h8q.LJI(c1712960ug2.LJI, c1712960ug2.LJII, c1712960ug2.LJIIIZ);
        interfaceC1192660h8q.LJIJI(this.LLILLL, this.LL.LIZ);
        interfaceC1192660h8q.LIZIZ(this.LLILZ);
        C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.fetchAndRefreshCashier$2$1");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
