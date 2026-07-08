package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NR8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.network.core.retry.PNSCoroutineNetworkRetryManager", f = "PNSCoroutineNetworkRetryManager.kt", l = {46, 83}, m = "requestWithRetry-BWLJW6A")
public final class C0NR8<T> extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Function1 LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C0NR7 LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NR8(C0NR7 c0nr7, InterfaceC1364105Vn<? super C0NR8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c0nr7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSCoroutineNetworkRetryManager@7573.requestWithRetry$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLJI.LIZIZ(null, null, this, null);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("PNSCoroutineNetworkRetryManager@7573.requestWithRetry$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("PNSCoroutineNetworkRetryManager@7573.requestWithRetry$1");
        return c189200o6M1boximpl;
    }
}
