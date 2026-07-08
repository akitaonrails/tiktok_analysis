package X;

import com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonAdRealtimeInfoServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SCQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.carousel.tag.CommerceCarouselTagAmazonHandler$getAmazonProductInfo$1", f = "CommerceCarouselTagAmazonHandler.kt", l = {52, 57}, m = "invokeSuspend")
public final class C0SCQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public IAmazonAdRealtimeInfoService LL;
    public int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Function1<AmazonAdRealtimeInfoResult, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0SCQ(Aweme aweme, Function1<? super AmazonAdRealtimeInfoResult, Unit> function1, InterfaceC1364105Vn<? super C0SCQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aweme;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SCQ(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IAmazonAdRealtimeInfoService iAmazonAdRealtimeInfoServiceLJ;
        AmazonCheckoutAdModel amazonCheckoutData;
        Object objLIZJ = obj;
        C1C7U.LIZ("CommerceCarouselTagAmazonHandler@e878.getAmazonProductInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZJ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CommerceCarouselTagAmazonHandler@e878.getAmazonProductInfo$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iAmazonAdRealtimeInfoServiceLJ = this.LL;
            C155000ia.LIZIZ(objLIZJ);
        } else {
            C155000ia.LIZIZ(objLIZJ);
            iAmazonAdRealtimeInfoServiceLJ = AmazonAdRealtimeInfoServiceImpl.LJ();
            String aid = this.LLILLL.getAid();
            AwemeRawAd awemeRawAd = this.LLILLL.getAwemeRawAd();
            if (awemeRawAd != null) {
                amazonCheckoutData = awemeRawAd.getAmazonCheckoutData();
            } else {
                amazonCheckoutData = null;
            }
            this.LL = iAmazonAdRealtimeInfoServiceLJ;
            this.LLILLJJLI = 1;
            objLIZJ = iAmazonAdRealtimeInfoServiceLJ.LIZJ(aid, amazonCheckoutData, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("CommerceCarouselTagAmazonHandler@e878.getAmazonProductInfo$1");
                return objLJFF;
            }
        }
        AmazonAdRealtimeInfoResult amazonAdRealtimeInfoResult = (AmazonAdRealtimeInfoResult) objLIZJ;
        if (amazonAdRealtimeInfoResult != null) {
            Function1<AmazonAdRealtimeInfoResult, Unit> function1 = this.LLILZ;
            Aweme aweme = this.LLILLL;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1001570cAd c1001570cAd = new C1001570cAd(function1, amazonAdRealtimeInfoResult, iAmazonAdRealtimeInfoServiceLJ, aweme, null);
            this.LL = null;
            this.LLILLJJLI = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1001570cAd) == objLJFF) {
                C1C7U.LIZIZ("CommerceCarouselTagAmazonHandler@e878.getAmazonProductInfo$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommerceCarouselTagAmazonHandler@e878.getAmazonProductInfo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
