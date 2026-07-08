package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl$onAgentClientEnvRequest$ref$1", f = "TakoClientAgentServiceImpl.kt", l = {92}, m = "invokeSuspend")
public final class C596510NaT extends C09AX implements Function2<AgentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC2252651DEx LLILLL;
    public final /* synthetic */ Function2<AgentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C596510NaT(AbstractC2252651DEx abstractC2252651DEx, Function2<? super AgentClientEnv, ? super InterfaceC1364105Vn<? super AgentClientEnv>, ? extends Object> function2, InterfaceC1364105Vn<? super C596510NaT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC2252651DEx;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C596510NaT c596510NaT = new C596510NaT(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c596510NaT.LLILLJJLI = obj;
        return c596510NaT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.onAgentClientEnvRequest$ref$1");
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
            AgentClientEnv agentClientEnv = (AgentClientEnv) this.LLILLJJLI;
            AbstractC2252651DEx abstractC2252651DEx = this.LLILLL;
            C596500NaS c596500NaS = new C596500NaS(this.LLILZ, agentClientEnv, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, abstractC2252651DEx, c596500NaS);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onAgentClientEnvRequest$ref$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onAgentClientEnvRequest$ref$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AgentClientEnv agentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv> interfaceC1364105Vn) {
        return ((a) create(agentClientEnv, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
