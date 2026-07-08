package X;

import com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonAdRealtimeInfoServiceImpl;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;

/* JADX INFO: renamed from: X.0cGG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonAdRealtimeInfoServiceImpl", f = "AmazonAdRealtimeInfoServiceImpl.kt", l = {105}, m = "getAmazonAdRealtimeInfo")
public final class C1005060cGG extends AbstractC23140094w {
    public AmazonCheckoutAdModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AmazonAdRealtimeInfoServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005060cGG(AmazonAdRealtimeInfoServiceImpl amazonAdRealtimeInfoServiceImpl, InterfaceC1364105Vn<? super C1005060cGG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = amazonAdRealtimeInfoServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmazonAdRealtimeInfoServiceImpl@977b.getAmazonAdRealtimeInfo$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("AmazonAdRealtimeInfoServiceImpl@977b.getAmazonAdRealtimeInfo$1");
        return objLIZ;
    }
}
