package X;

import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;

/* JADX INFO: renamed from: X.08eI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3", f = "SearchCSIProfileBannerRepoV3.kt", l = {1583}, m = "requestBannerData")
public final class C2166808eI extends AbstractC23140094w {
    public EnumC2193241Asc LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2166808eI(SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, InterfaceC1364105Vn<? super C2166808eI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = searchCSIProfileBannerRepoV3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.requestBannerData$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJII = this.LLILZ.LJJII(null, null, this);
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.requestBannerData$1");
        return objLJJII;
    }
}
