package X;

/* JADX INFO: renamed from: X.0Xqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.userlevel.flow.BaseBannerRequestFlow", f = "BaseBannerRequestFlow.kt", l = {43}, m = "fetchBannerInfo")
public final class C861360Xqg extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AbstractC889770YvP LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861360Xqg(AbstractC889770YvP abstractC889770YvP, InterfaceC1364105Vn<? super C861360Xqg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = abstractC889770YvP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseBannerRequestFlow@8482.fetchBannerInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("BaseBannerRequestFlow@8482.fetchBannerInfo$1");
        return objLIZIZ;
    }
}
