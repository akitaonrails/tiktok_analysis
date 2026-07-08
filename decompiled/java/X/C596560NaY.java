package X;

import com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl;

/* JADX INFO: renamed from: X.0NaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl", f = "TakoClientAgentServiceImpl.kt", l = {98}, m = "onAgentClientEnvRequest")
public final class C596560NaY extends AbstractC23140094w {
    public C596510NaT LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoClientAgentServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596560NaY(TakoClientAgentServiceImpl takoClientAgentServiceImpl, InterfaceC1364105Vn<? super C596560NaY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = takoClientAgentServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.onAgentClientEnvRequest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onAgentClientEnvRequest$1");
        return objLIZJ;
    }
}
