package X;

import com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor;

/* JADX INFO: renamed from: X.0M6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor", f = "AIRemixRouterInterceptor.kt", l = {137}, m = "loadAwemeById")
public final class C563120M6s extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIRemixRouterInterceptor LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563120M6s(AIRemixRouterInterceptor aIRemixRouterInterceptor, InterfaceC1364105Vn<? super C563120M6s> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aIRemixRouterInterceptor;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIRemixRouterInterceptor@ee11.loadAwemeById$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("AIRemixRouterInterceptor@ee11.loadAwemeById$1");
        return objLIZJ;
    }
}
