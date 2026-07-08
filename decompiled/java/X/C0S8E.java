package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl;

/* JADX INFO: renamed from: X.0S8E, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {438, 526}, m = "makePaywallNetworkCallVhs")
public final class C0S8E extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public LifecycleCoroutineScope LLILLL;
    public C0S8H LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public C0S8A LLIZLLLIL;
    public Object LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ PaidContentVideoHotSwapServiceImpl LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S8E(PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl, InterfaceC1364105Vn<? super C0S8E> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = paidContentVideoHotSwapServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLJIJIL.LJIILIIL(null, null, null, null, null, null, null, false, this);
        C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$1");
        return objLJIILIIL;
    }
}
