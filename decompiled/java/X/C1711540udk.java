package X;

/* JADX INFO: renamed from: X.0udk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.TTLSProxy", f = "TTLSProxy.kt", l = {49}, m = "fetchCertContent")
public final class C1711540udk extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1711520udi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1711540udk(C1711520udi c1711520udi, InterfaceC1364105Vn<? super C1711540udk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1711520udi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTLSProxy@1216.fetchCertContent$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("TTLSProxy@1216.fetchCertContent$1");
        return objLIZ;
    }
}
