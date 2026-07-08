package X;

import com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv;

/* JADX INFO: renamed from: X.0NaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl", f = "TakoClientAgentServiceImpl.kt", l = {80}, m = "getAgentClientEnv")
public final class C596570NaZ extends AbstractC23140094w {
    public Object LL;
    public AgentClientEnv LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TakoClientAgentServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596570NaZ(TakoClientAgentServiceImpl takoClientAgentServiceImpl, InterfaceC1364105Vn<? super C596570NaZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = takoClientAgentServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.getAgentClientEnv$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(this);
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.getAgentClientEnv$1");
        return objLIZIZ;
    }
}
