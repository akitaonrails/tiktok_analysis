package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ShopifySkuCheckoutServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14CZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CZ extends C09AY implements Function1<ShopifySkuCheckoutProductDetailData, Unit> {
    public final /* synthetic */ ShopifySkuCheckoutServiceImpl LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ C14CT LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14CZ(ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl, DialogC1389620mGW dialogC1389620mGW, String str, Aweme aweme, String str2, Context context, String str3, boolean z, C14CT c14ct) {
        super(1);
        this.LL = shopifySkuCheckoutServiceImpl;
        this.LLILLJJLI = dialogC1389620mGW;
        this.LLILLL = str;
        this.LLILZ = aweme;
        this.LLILZIL = str2;
        this.LLILZLL = context;
        this.LLIZ = str3;
        this.LLIZLLLIL = z;
        this.LLJ = c14ct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData) {
        ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData2 = shopifySkuCheckoutProductDetailData;
        ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl = this.LL;
        DialogC1389620mGW dialogC1389620mGW = this.LLILLJJLI;
        shopifySkuCheckoutServiceImpl.getClass();
        ShopifySkuCheckoutServiceImpl.LJIIJJI(dialogC1389620mGW);
        AwemeRawAd awemeRawAd = null;
        if (shopifySkuCheckoutProductDetailData2 == null) {
            this.LL.getClass();
            this.LL.getClass();
            String str = this.LLILLL;
            Aweme aweme = this.LLILZ;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            ShopifySkuCheckoutServiceImpl.LJIIJ(new C20225914Cb(2, 0, str, awemeRawAd, this.LLILZIL));
            ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl2 = this.LL;
            Context context = this.LLILZLL;
            Aweme aweme2 = this.LLILZ;
            String str2 = this.LLILZIL;
            shopifySkuCheckoutServiceImpl2.getClass();
            ShopifySkuCheckoutServiceImpl.LJI(context, aweme2, str2);
        } else {
            String str3 = shopifySkuCheckoutProductDetailData2.errorMessage;
            if (str3 != null && C123100dR.LIZ(str3)) {
                this.LL.getClass();
                this.LL.getClass();
                String str4 = this.LLILLL;
                Aweme aweme3 = this.LLILZ;
                if (aweme3 != null) {
                    awemeRawAd = aweme3.getAwemeRawAd();
                }
                ShopifySkuCheckoutServiceImpl.LJIIJ(new C20225914Cb(2, 0, str4, awemeRawAd, this.LLILZIL));
                ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl3 = this.LL;
                Context context2 = this.LLILZLL;
                Aweme aweme4 = this.LLILZ;
                String str5 = this.LLILZIL;
                shopifySkuCheckoutServiceImpl3.getClass();
                ShopifySkuCheckoutServiceImpl.LJI(context2, aweme4, str5);
            } else {
                C1316405De.LIZIZ.put(this.LLIZ, shopifySkuCheckoutProductDetailData2);
                this.LL.LJIIIIZZ(this.LLILZLL, this.LLILZIL, this.LLILLL, this.LLILZ, this.LLIZLLLIL, this.LLJ, shopifySkuCheckoutProductDetailData2);
            }
        }
        return Unit.LIZ;
    }
}
