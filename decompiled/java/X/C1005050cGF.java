package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonAdRealtimeInfoServiceImpl;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;

/* JADX INFO: renamed from: X.0cGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonAdRealtimeInfoServiceImpl", f = "AmazonAdRealtimeInfoServiceImpl.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "getAmazonAdRealtimeInfoJSON")
public final class C1005050cGF extends AbstractC23140094w {
    public Object LL;
    public AmazonCheckoutAdModel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AmazonAdRealtimeInfoServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005050cGF(AmazonAdRealtimeInfoServiceImpl amazonAdRealtimeInfoServiceImpl, InterfaceC1364105Vn<? super C1005050cGF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = amazonAdRealtimeInfoServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmazonAdRealtimeInfoServiceImpl@977b.getAmazonAdRealtimeInfoJSON$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, this);
        C1C7U.LIZIZ("AmazonAdRealtimeInfoServiceImpl@977b.getAmazonAdRealtimeInfoJSON$1");
        return objLIZJ;
    }
}
