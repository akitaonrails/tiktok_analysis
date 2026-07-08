package X;

import com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Naa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl$processAgentCommand$2$1", f = "TakoClientAgentServiceImpl.kt", l = {127}, m = "invokeSuspend")
public final class C596580Naa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC596640Nag>, Object> {
    public int LL;
    public final /* synthetic */ AgentCommandRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596580Naa(AgentCommandRequest agentCommandRequest, InterfaceC1364105Vn<? super C596580Naa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = agentCommandRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596580Naa(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.processAgentCommand$2$1");
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
            AgentCommandRequest agentCommandRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = TakoClientAgentServiceImpl.LJFF(agentCommandRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.processAgentCommand$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.processAgentCommand$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC596640Nag> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
