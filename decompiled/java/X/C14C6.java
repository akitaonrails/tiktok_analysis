package X;

import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS609S0100000_30;
import njp.a;

/* JADX INFO: renamed from: X.14C6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet$parseProductId$1", f = "ShopifySkuCheckoutBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class C14C6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShopifySkuCheckoutBottomSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14C6(ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet, InterfaceC1364105Vn<? super C14C6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shopifySkuCheckoutBottomSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C14C6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopifySkuCheckoutBottomSheet@a87e.parseProductId$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet = this.LL;
        C14CQ c14cq = shopifySkuCheckoutBottomSheet.LIZIZ;
        C14CS.LJFF(c14cq.pdpUrl, c14cq.from, c14cq.awemeRawAd, new AwS609S0100000_30(shopifySkuCheckoutBottomSheet, 54));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopifySkuCheckoutBottomSheet@a87e.parseProductId$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
