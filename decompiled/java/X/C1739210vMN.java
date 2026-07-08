package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;

/* JADX INFO: renamed from: X.0vMN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService", f = "ECommerceShowcaseService.kt", l = {164}, m = "queryShop")
public final class C1739210vMN extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ECommerceShowcaseService LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739210vMN(ECommerceShowcaseService eCommerceShowcaseService, InterfaceC1364105Vn<? super C1739210vMN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = eCommerceShowcaseService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECommerceShowcaseService@1f0a.queryShop$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, null, this, false);
        C1C7U.LIZIZ("ECommerceShowcaseService@1f0a.queryShop$1");
        return objLJFF;
    }
}
