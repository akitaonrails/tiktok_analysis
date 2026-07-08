package X;

/* JADX INFO: renamed from: X.0CzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository", f = "PDPDataRepository.kt", l = {95, 97}, m = "fetchThroughCache-yxL6bBk")
public final class C331670CzN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C331730CzT LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331670CzN(C331730CzT c331730CzT, InterfaceC1364105Vn<? super C331670CzN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c331730CzT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PDPDataRepository@79c7.fetchThroughCache$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(null, null, null, null, this);
        if (objLJIIIIZZ == C099R.LJFF()) {
            C1C7U.LIZIZ("PDPDataRepository@79c7.fetchThroughCache$1");
            return objLJIIIIZZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIIIZZ);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchThroughCache$1");
        return c189200o6M1boximpl;
    }
}
