package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl$onAgentClientEnvRequest$ref$1$1", f = "TakoClientAgentServiceImpl.kt", l = {93}, m = "invokeSuspend")
public final class C596500NaS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AgentClientEnv>, Object> {
    public int LL;
    public final /* synthetic */ Function2<AgentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv>, Object> LLILLJJLI;
    public final /* synthetic */ AgentClientEnv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C596500NaS(Function2<? super AgentClientEnv, ? super InterfaceC1364105Vn<? super AgentClientEnv>, ? extends Object> function2, AgentClientEnv agentClientEnv, InterfaceC1364105Vn<? super C596500NaS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = agentClientEnv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596500NaS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.onAgentClientEnvRequest$ref$1$1");
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
            Function2<AgentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv>, Object> function2 = this.LLILLJJLI;
            AgentClientEnv agentClientEnv = this.LLILLL;
            this.LL = 1;
            obj = function2.invoke(agentClientEnv, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onAgentClientEnvRequest$ref$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onAgentClientEnvRequest$ref$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AgentClientEnv> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
