package X;

import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet$updateSelectedOption$1", f = "ShopifySkuCheckoutBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class C596110NZp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ShopifySkuCheckoutBottomSheet LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596110NZp(String str, String str2, ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet, InterfaceC1364105Vn<? super C596110NZp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = shopifySkuCheckoutBottomSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596110NZp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopifySkuCheckoutBottomSheet@a87e.updateSelectedOption$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet = this.LLILLL;
        shopifySkuCheckoutBottomSheet.LIZJ(C2097608Jq.LJIIZILJ(shopifySkuCheckoutBottomSheet.LJ), true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopifySkuCheckoutBottomSheet@a87e.updateSelectedOption$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
