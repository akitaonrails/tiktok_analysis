package X;

import com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;

/* JADX INFO: renamed from: X.0Nac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl", f = "TakoClientAgentServiceImpl.kt", l = {106, 127, 129}, m = "processAgentCommand")
public final class C596600Nac extends AbstractC23140094w {
    public AgentCommandRequest LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoClientAgentServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596600Nac(TakoClientAgentServiceImpl takoClientAgentServiceImpl, InterfaceC1364105Vn<? super C596600Nac> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = takoClientAgentServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.processAgentCommand$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.processAgentCommand$1");
        return objLJ;
    }
}
