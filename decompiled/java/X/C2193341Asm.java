package X;

import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;

/* JADX INFO: renamed from: X.1Asm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3", f = "SearchCSIProfileBannerRepoV3.kt", l = {1402}, m = "findNextValidBanner")
public final class C2193341Asm extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2193341Asm(SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, InterfaceC1364105Vn<? super C2193341Asm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = searchCSIProfileBannerRepoV3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.findNextValidBanner$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILZIL.LJIIJ(0, this);
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.findNextValidBanner$1");
        return objLJIIJ;
    }
}
