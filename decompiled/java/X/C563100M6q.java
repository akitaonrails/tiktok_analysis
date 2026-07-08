package X;

import com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor;
import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;

/* JADX INFO: renamed from: X.0M6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor", f = "AIRemixRouterInterceptor.kt", l = {151}, m = "reportAiselfInviteMatchEntranceMob")
public final class C563100M6q extends AbstractC23140094w {
    public IAIRemixEntranceMobService LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIRemixRouterInterceptor LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563100M6q(AIRemixRouterInterceptor aIRemixRouterInterceptor, InterfaceC1364105Vn<? super C563100M6q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aIRemixRouterInterceptor;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIRemixRouterInterceptor@ee11.reportAiselfInviteMatchEntranceMob$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, this);
        C1C7U.LIZIZ("AIRemixRouterInterceptor@ee11.reportAiselfInviteMatchEntranceMob$1");
        return objLIZLLL;
    }
}
