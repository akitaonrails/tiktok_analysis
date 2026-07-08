package X;

import com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonAdRealtimeInfoServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResponse;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonProductDetailsModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SCR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.carousel.tag.CommerceCarouselTagAmazonHandler$preloadAmazonProductInfo$1", f = "CommerceCarouselTagAmazonHandler.kt", l = {35}, m = "invokeSuspend")
public final class C0SCR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SCR(Aweme aweme, InterfaceC1364105Vn<? super C0SCR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SCR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AmazonCheckoutAdModel amazonCheckoutData;
        AwemeRawAd awemeRawAd;
        AmazonCheckoutAdModel amazonCheckoutData2;
        C1C7U.LIZ("CommerceCarouselTagAmazonHandler@e878.preloadAmazonProductInfo$1");
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
            IAmazonAdRealtimeInfoService iAmazonAdRealtimeInfoServiceLJ = AmazonAdRealtimeInfoServiceImpl.LJ();
            AwemeRawAd awemeRawAd2 = this.LLILLJJLI.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                amazonCheckoutData = awemeRawAd2.getAmazonCheckoutData();
            } else {
                amazonCheckoutData = null;
            }
            this.LL = 1;
            obj = iAmazonAdRealtimeInfoServiceLJ.LIZ(amazonCheckoutData, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommerceCarouselTagAmazonHandler@e878.preloadAmazonProductInfo$1");
                return objLJFF;
            }
        }
        AmazonAdRealtimeInfoResponse amazonAdRealtimeInfoResponse = (AmazonAdRealtimeInfoResponse) obj;
        if (amazonAdRealtimeInfoResponse != null) {
            Aweme aweme = this.LLILLJJLI;
            List<AmazonProductDetailsModel> productList = amazonAdRealtimeInfoResponse.getProductList();
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (amazonCheckoutData2 = awemeRawAd.getAmazonCheckoutData()) != null) {
                amazonCheckoutData2.setAmazonProductDetails(productList);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceCarouselTagAmazonHandler@e878.preloadAmazonProductInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
