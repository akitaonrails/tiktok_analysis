package X;

/* JADX INFO: renamed from: X.0CzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository", f = "PDPDataRepository.kt", l = {168}, m = "fetchPDPData-yxL6bBk")
public final class C331710CzR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C331730CzT LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331710CzR(C331730CzT c331730CzT, InterfaceC1364105Vn<? super C331710CzR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c331730CzT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PDPDataRepository@79c7.fetchPDPData$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, null, null, 0, this);
        if (objLJFF == C099R.LJFF()) {
            C1C7U.LIZIZ("PDPDataRepository@79c7.fetchPDPData$1");
            return objLJFF;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJFF);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchPDPData$1");
        return c189200o6M1boximpl;
    }
}
