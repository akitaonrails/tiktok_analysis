package X;

import com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.carousel.tag.CommerceCarouselTagAmazonHandler$getAmazonProductInfo$1$1$1", f = "CommerceCarouselTagAmazonHandler.kt", l = {}, m = "invokeSuspend")
public final class C1001570cAd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<AmazonAdRealtimeInfoResult, Unit> LL;
    public final /* synthetic */ AmazonAdRealtimeInfoResult LLILLJJLI;
    public final /* synthetic */ IAmazonAdRealtimeInfoService LLILLL;
    public final /* synthetic */ Aweme LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1001570cAd(Function1<? super AmazonAdRealtimeInfoResult, Unit> function1, AmazonAdRealtimeInfoResult amazonAdRealtimeInfoResult, IAmazonAdRealtimeInfoService iAmazonAdRealtimeInfoService, Aweme aweme, InterfaceC1364105Vn<? super C1001570cAd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = amazonAdRealtimeInfoResult;
        this.LLILLL = iAmazonAdRealtimeInfoService;
        this.LLILZ = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001570cAd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r3 = "CommerceCarouselTagAmazonHandler@e878.getAmazonProductInfo$1$1$1"
            X.C1C7U.LIZ(r3)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r11)
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult, kotlin.Unit> r1 = r10.LL
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult r0 = r10.LLILLJJLI
            r1.invoke(r0)
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult r2 = r10.LLILLJJLI
            java.util.List<com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonProductDetailsModel> r0 = r2.productList
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyleModel r1 = r2.ctaButtonText
            boolean r0 = X.C1017070cZd.LLJJJJLIIL(r0)
            r8 = 0
            if (r0 == 0) goto L56
            if (r1 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyle r0 = r1.getPrime()
        L25:
            X.0c9l r4 = new X.0c9l
            java.lang.String r5 = r2.awemeId
            if (r0 == 0) goto L53
            java.lang.String r6 = r0.getText()
            java.lang.String r7 = r0.getTextColor()
            java.lang.String r8 = r0.getBackgroundColor()
        L37:
            r0 = 2130772915(0x7f0103b3, float:1.7148962E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r4.<init>(r5, r6, r7, r8, r9)
            X.C315960Ca2.LIZ(r4)
            com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService r2 = r10.LLILLL
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult r1 = r10.LLILLJJLI
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.LLILZ
            r2.LIZIZ(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L53:
            r6 = r8
            r7 = r8
            goto L37
        L56:
            if (r1 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyle r0 = r1.getNormal()
            goto L25
        L5d:
            r0 = r8
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1001570cAd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
