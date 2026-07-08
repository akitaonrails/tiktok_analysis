package X;

/* JADX INFO: renamed from: X.0uRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.audiencecontrol.AudienceControlRepoImpl", f = "AudienceControlRepoImpl.kt", l = {23}, m = "setAccountAudienceControlStatus-gIAlu-s")
public final class C1703800uRG extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1703810uRH LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703800uRG(C1703810uRH c1703810uRH, InterfaceC1364105Vn<? super C1703800uRG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1703810uRH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudienceControlRepoImpl@deeb.setAccountAudienceControlStatus$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(false, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("AudienceControlRepoImpl@deeb.setAccountAudienceControlStatus$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("AudienceControlRepoImpl@deeb.setAccountAudienceControlStatus$1");
        return c189200o6M1boximpl;
    }
}
