package X;

/* JADX INFO: renamed from: X.0XzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.proxy.RemoteFetcherProxy", f = "RemoteFetcherProxy.kt", l = {39}, m = "decodeResponse-0E7RQCE")
public final class C866650XzD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C866640XzC LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866650XzD(C866640XzC c866640XzC, InterfaceC1364105Vn<? super C866650XzD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c866640XzC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoteFetcherProxy@739e.decodeResponse$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLJJLI.LJJJLIIL(null, null, this);
        if (objLJJJLIIL == C099R.LJFF()) {
            C1C7U.LIZIZ("RemoteFetcherProxy@739e.decodeResponse$1");
            return objLJJJLIIL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJJJLIIL);
        C1C7U.LIZIZ("RemoteFetcherProxy@739e.decodeResponse$1");
        return c189200o6M1boximpl;
    }
}
