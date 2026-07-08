package X;

import com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor;
import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;

/* JADX INFO: renamed from: X.0M6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor", f = "AIRemixRouterInterceptor.kt", l = {182}, m = "reportAiselfInvitePermissionBlockToastMob")
public final class C563110M6r extends AbstractC23140094w {
    public IAIRemixEntranceMobService LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIRemixRouterInterceptor LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563110M6r(AIRemixRouterInterceptor aIRemixRouterInterceptor, InterfaceC1364105Vn<? super C563110M6r> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aIRemixRouterInterceptor;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIRemixRouterInterceptor@ee11.reportAiselfInvitePermissionBlockToastMob$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("AIRemixRouterInterceptor@ee11.reportAiselfInvitePermissionBlockToastMob$1");
        return objLJ;
    }
}
