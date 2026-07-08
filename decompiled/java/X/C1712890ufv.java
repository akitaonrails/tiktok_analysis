package X;

import com.ss.android.ugc.aweme.pipo.cashier.agentbridge.AgentBridgeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ufv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.agentbridge.PIPOCashierAgentBridgeImpl$openInstrumentsChangePage$1$accessToken$1", f = "PIPOCashierAgentBridgeServiceImpl.kt", l = {345}, m = "invokeSuspend")
public final class C1712890ufv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1712990ug5>, Object> {
    public int LL;
    public final /* synthetic */ C1712870uft LLILLJJLI;
    public final /* synthetic */ C1712960ug2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1712890ufv(C1712870uft c1712870uft, C1712960ug2 c1712960ug2, InterfaceC1364105Vn<? super C1712890ufv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1712870uft;
        this.LLILLL = c1712960ug2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1712890ufv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PIPOCashierAgentBridgeImpl@ef2c.openInstrumentsChangePage$1$accessToken$1");
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
            C1712870uft c1712870uft = this.LLILLJJLI;
            C1717530unP c1717530unP = AgentBridgeApi.LIZ;
            C1712960ug2 c1712960ug2 = this.LLILLL;
            String str = c1712960ug2.LIZ;
            String str2 = c1712960ug2.LJIIIIZZ;
            c1717530unP.getClass();
            AgentBridgeApi agentBridgeApiLIZ = C1717530unP.LIZ(str, str2);
            C1712960ug2 c1712960ug22 = this.LLILLL;
            this.LL = 1;
            obj = c1712870uft.LJIILL(agentBridgeApiLIZ, c1712960ug22, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.openInstrumentsChangePage$1$accessToken$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.openInstrumentsChangePage$1$accessToken$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1712990ug5> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
