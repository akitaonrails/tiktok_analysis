package X;

import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutJsProductDetail;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ShopifySkuCheckoutServiceImpl$preloadShopifySkuData$2", f = "ShopifySkuCheckoutServiceImpl.kt", l = {487}, m = "invokeSuspend")
public final class C1316005Da extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AwemeRawAd LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1316005Da(AwemeRawAd awemeRawAd, String str, String str2, String str3, String str4, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = awemeRawAd;
        this.LLILZLL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1316005Da(this.LLILZIL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ShopifySkuCheckoutServiceImpl@ae09.preloadShopifySkuData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            AwemeRawAd awemeRawAd = this.LLILZIL;
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1316705Dh(str, str3, str2, awemeRawAd, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShopifySkuCheckoutServiceImpl@ae09.preloadShopifySkuData$2");
                return objLJFF;
            }
        }
        if (obj != null) {
            String str4 = this.LLILZLL;
            if (str4 == null) {
                str4 = "";
            }
            C1316405De.LIZ.put(str4, (ShopifySkuCheckoutJsProductDetail) obj);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopifySkuCheckoutServiceImpl@ae09.preloadShopifySkuData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
