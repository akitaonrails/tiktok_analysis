package X;

import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutJsProductDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.common.shopify.ShopifySkuCheckoutManager$Companion$getProductByJsUrl$1$1", f = "ShopifySkuCheckoutManager.kt", l = {}, m = "invokeSuspend")
public final class C1316305Dd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<ShopifySkuCheckoutJsProductDetail, Unit> LL;
    public final /* synthetic */ ShopifySkuCheckoutJsProductDetail LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1316305Dd(Function1<? super ShopifySkuCheckoutJsProductDetail, Unit> function1, ShopifySkuCheckoutJsProductDetail shopifySkuCheckoutJsProductDetail, InterfaceC1364105Vn<? super C1316305Dd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = shopifySkuCheckoutJsProductDetail;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1316305Dd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopifySkuCheckoutManager$Companion@c0e0.getProductByJsUrl$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopifySkuCheckoutManager$Companion@c0e0.getProductByJsUrl$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
