package X;

import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;

/* JADX INFO: renamed from: X.1Asn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3", f = "SearchCSIProfileBannerRepoV3.kt", l = {1469, 1481}, m = "checkHandlerShouldShow")
public final class C2193351Asn extends AbstractC23140094w {
    public EnumC2193241Asc LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2193351Asn(SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, InterfaceC1364105Vn<? super C2193351Asn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = searchCSIProfileBannerRepoV3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.checkHandlerShouldShow$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(null, false, this);
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.checkHandlerShouldShow$1");
        return objLJII;
    }
}
