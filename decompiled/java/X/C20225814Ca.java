package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutJsProductDetail;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ShopifySkuCheckoutServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14Ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20225814Ca extends C09AY implements Function1<ShopifySkuCheckoutJsProductDetail, Unit> {
    public final /* synthetic */ ShopifySkuCheckoutServiceImpl LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20225814Ca(ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl, DialogC1389620mGW dialogC1389620mGW, String str, Aweme aweme, String str2, Context context, boolean z) {
        super(1);
        this.LL = shopifySkuCheckoutServiceImpl;
        this.LLILLJJLI = dialogC1389620mGW;
        this.LLILLL = str;
        this.LLILZ = aweme;
        this.LLILZIL = str2;
        this.LLILZLL = context;
        this.LLIZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ShopifySkuCheckoutJsProductDetail shopifySkuCheckoutJsProductDetail) {
        AwemeRawAd awemeRawAd;
        ShopifySkuCheckoutJsProductDetail shopifySkuCheckoutJsProductDetail2 = shopifySkuCheckoutJsProductDetail;
        ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl = this.LL;
        DialogC1389620mGW dialogC1389620mGW = this.LLILLJJLI;
        shopifySkuCheckoutServiceImpl.getClass();
        ShopifySkuCheckoutServiceImpl.LJIIJJI(dialogC1389620mGW);
        if (shopifySkuCheckoutJsProductDetail2 == null) {
            this.LL.getClass();
            this.LL.getClass();
            String str = this.LLILLL;
            Aweme aweme = this.LLILZ;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            ShopifySkuCheckoutServiceImpl.LJIIJ(new C20225914Cb(1, 0, str, awemeRawAd, this.LLILZIL));
            ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl2 = this.LL;
            Context context = this.LLILZLL;
            Aweme aweme2 = this.LLILZ;
            String str2 = this.LLILZIL;
            shopifySkuCheckoutServiceImpl2.getClass();
            ShopifySkuCheckoutServiceImpl.LJI(context, aweme2, str2);
        } else {
            C1316405De.LIZ.put(this.LLILZIL, shopifySkuCheckoutJsProductDetail2);
            this.LL.LJII(this.LLILZLL, this.LLILZIL, this.LLILLL, this.LLILZ, this.LLIZ, shopifySkuCheckoutJsProductDetail2);
        }
        return Unit.LIZ;
    }
}
