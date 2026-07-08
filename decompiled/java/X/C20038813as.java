package X;

import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.ShopifySkuCheckoutApiService;

/* JADX INFO: renamed from: X.13as, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.ShopifySkuCheckoutApiService", f = "ShopifySkuCheckoutApiService.kt", l = {75}, m = "reportDataInteract")
public final class C20038813as extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ShopifySkuCheckoutApiService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20038813as(ShopifySkuCheckoutApiService shopifySkuCheckoutApiService, InterfaceC1364105Vn<? super C20038813as> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = shopifySkuCheckoutApiService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopifySkuCheckoutApiService@fa2f.reportDataInteract$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, null, null, this);
        C1C7U.LIZIZ("ShopifySkuCheckoutApiService@fa2f.reportDataInteract$1");
        return objLIZIZ;
    }
}
