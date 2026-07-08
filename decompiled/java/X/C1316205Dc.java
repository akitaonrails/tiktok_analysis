package X;

import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutJsProductDetail;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.common.shopify.ShopifySkuCheckoutManager$Companion$getProductByJsUrl$1", f = "ShopifySkuCheckoutManager.kt", l = {109, 110}, m = "invokeSuspend")
public final class C1316205Dc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AwemeRawAd LLILZIL;
    public final /* synthetic */ Function1<ShopifySkuCheckoutJsProductDetail, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1316205Dc(String str, String str2, String str3, AwemeRawAd awemeRawAd, Function1<? super ShopifySkuCheckoutJsProductDetail, Unit> function1, InterfaceC1364105Vn<? super C1316205Dc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = awemeRawAd;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1316205Dc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ShopifySkuCheckoutManager$Companion@c0e0.getProductByJsUrl$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ShopifySkuCheckoutManager$Companion@c0e0.getProductByJsUrl$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            AwemeRawAd awemeRawAd = this.LLILZIL;
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1316705Dh(str, str3, str2, awemeRawAd, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShopifySkuCheckoutManager$Companion@c0e0.getProductByJsUrl$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1316305Dd c1316305Dd = new C1316305Dd(this.LLILZLL, (ShopifySkuCheckoutJsProductDetail) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1316305Dd) == objLJFF) {
            C1C7U.LIZIZ("ShopifySkuCheckoutManager$Companion@c0e0.getProductByJsUrl$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShopifySkuCheckoutManager$Companion@c0e0.getProductByJsUrl$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
