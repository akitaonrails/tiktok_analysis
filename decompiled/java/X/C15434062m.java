package X;

/* JADX INFO: renamed from: X.062m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.UcpApiCache", f = "UcpApiCache.kt", l = {122, 124}, m = "awaitResult-BWLJW6A")
public final class C15434062m<T> extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C15433062l LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15434062m(C15433062l c15433062l, InterfaceC1364105Vn<? super C15434062m> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c15433062l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UcpApiCache@c9da.awaitResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(0L, null, this, null);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("UcpApiCache@c9da.awaitResult$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("UcpApiCache@c9da.awaitResult$1");
        return c189200o6M1boximpl;
    }
}
