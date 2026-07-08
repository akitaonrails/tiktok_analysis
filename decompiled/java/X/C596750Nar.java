package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl$onCommandReceived$2$1$2", f = "TakoClientAgentServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C596750Nar extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AgentCommandRequest LL;
    public final /* synthetic */ AgentCommandResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596750Nar(AgentCommandRequest agentCommandRequest, AgentCommandResponse agentCommandResponse, InterfaceC1364105Vn<? super C596750Nar> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = agentCommandRequest;
        this.LLILLJJLI = agentCommandResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596750Nar(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.onCommandReceived$2$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Agent tools call(");
            sbLIZ.append(this.LL.id);
            sbLIZ.append("): ");
            sbLIZ.append(this.LL.command);
            sbLIZ.append(", result: ");
            sbLIZ.append(this.LLILLJJLI.result);
            c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onCommandReceived$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
