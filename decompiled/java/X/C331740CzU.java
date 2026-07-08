package X;

/* JADX INFO: renamed from: X.0CzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository", f = "PDPDataRepository.kt", l = {107, 136}, m = "fetchProductWithColorFallback-hUnOzRk")
public final class C331740CzU extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C331730CzT LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331740CzU(C331730CzT c331730CzT, InterfaceC1364105Vn<? super C331740CzU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c331730CzT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PDPDataRepository@79c7.fetchProductWithColorFallback$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZLL.LJI(null, null, null, null, null, this);
        if (objLJI == C099R.LJFF()) {
            C1C7U.LIZIZ("PDPDataRepository@79c7.fetchProductWithColorFallback$1");
            return objLJI;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJI);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchProductWithColorFallback$1");
        return c189200o6M1boximpl;
    }
}
