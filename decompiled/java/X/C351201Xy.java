package X;

/* JADX INFO: renamed from: X.01Xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.model.PcsThirdPartyLinkRepository", f = "PcsThirdPartyLinkRepository.kt", l = {21}, m = "fetchThirdPartyLink-0E7RQCE")
public final class C351201Xy extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C351101Xx LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351201Xy(C351101Xx c351101Xx, InterfaceC1364105Vn<? super C351201Xy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c351101Xx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsThirdPartyLinkRepository@e4e5.fetchThirdPartyLink$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0L, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("PcsThirdPartyLinkRepository@e4e5.fetchThirdPartyLink$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("PcsThirdPartyLinkRepository@e4e5.fetchThirdPartyLink$1");
        return c189200o6M1boximpl;
    }
}
