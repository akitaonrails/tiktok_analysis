package X;

import com.ss.android.ugc.aweme.agent.tools.spi.TarsAgentToolService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl$init$3$1", f = "TakoClientAgentServiceImpl.kt", l = {151}, m = "invokeSuspend")
public final class C596530NaV extends C09AX implements Function2<AgentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C596530NaV(InterfaceC1364105Vn<? super C596530NaV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C596530NaV c596530NaV = new C596530NaV(interfaceC1364105Vn);
        c596530NaV.LLILLJJLI = obj;
        return c596530NaV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AgentClientEnv agentClientEnv;
        List list;
        Object objLIZ = obj;
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.init$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                agentClientEnv = (AgentClientEnv) this.LLILLJJLI;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            agentClientEnv = (AgentClientEnv) this.LLILLJJLI;
            TarsAgentToolService tarsAgentToolService = (TarsAgentToolService) PluggableExtentionKt.pluggableSpi$default(TarsAgentToolService.class, false, false, false, 14, null);
            if (tarsAgentToolService != null) {
                this.LLILLJJLI = agentClientEnv;
                this.LL = 1;
                objLIZ = tarsAgentToolService.LIZ();
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.init$3$1");
                    return objLJFF;
                }
            }
            list = C13BV.INSTANCE;
            AgentClientEnv agentClientEnvLIZ = AgentClientEnv.LIZ(agentClientEnv, null, null, null, null, null, 0L, list, null, null, 447);
            C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.init$3$1");
            return agentClientEnvLIZ;
        }
        list = (List) objLIZ;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        AgentClientEnv agentClientEnvLIZ2 = AgentClientEnv.LIZ(agentClientEnv, null, null, null, null, null, 0L, list, null, null, 447);
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.init$3$1");
        return agentClientEnvLIZ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AgentClientEnv agentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv> interfaceC1364105Vn) {
        return ((a) create(agentClientEnv, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
