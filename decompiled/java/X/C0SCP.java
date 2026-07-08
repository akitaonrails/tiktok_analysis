package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SCP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt$requestAmazonRealtimeInfo$1", f = "CommerceVideoDelegateKt.kt", l = {3168, 3171}, m = "invokeSuspend")
public final class C0SCP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public IAmazonAdRealtimeInfoService LL;
    public Aweme LLILLJJLI;
    public AmazonAdRealtimeInfoResult LLILLL;
    public int LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ CommerceVideoDelegateKt LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SCP(CommerceVideoDelegateKt commerceVideoDelegateKt, Aweme aweme, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = aweme;
        this.LLILZLL = commerceVideoDelegateKt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SCP(this.LLILZLL, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "CommerceVideoDelegateKt@740c.requestAmazonRealtimeInfo$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r7 = 2
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L28
            if (r0 == r2) goto L57
            if (r0 != r7) goto L84
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult r9 = r11.LLILLL
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r11.LLILLJJLI
            com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService r4 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L1d:
            if (r8 == 0) goto L22
            r4.LIZIZ(r9, r8)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L28:
            X.C155000ia.LIZIZ(r12)
            com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService r4 = com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonAdRealtimeInfoServiceImpl.LJ()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.LLILZIL
            if (r0 == 0) goto L55
            java.lang.String r1 = r0.getAid()
        L37:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.LLILZIL
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel r0 = r0.getAmazonCheckoutData()
        L45:
            r11.LL = r4
            r11.LLILZ = r2
            java.lang.Object r12 = r4.LIZJ(r1, r0, r11)
            if (r12 != r6) goto L5c
            X.C1C7U.LIZIZ(r10)
            return r6
        L53:
            r0 = r5
            goto L45
        L55:
            r1 = r5
            goto L37
        L57:
            com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService r4 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L5c:
            r9 = r12
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult r9 = (com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult) r9
            if (r9 == 0) goto L22
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r11.LLILZIL
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt r3 = r11.LLILZLL
            org.json.JSONObject r2 = r9.adInfoJsonObject
            if (r2 == 0) goto L1d
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0SCO r0 = new X.0SCO
            r0.<init>(r3, r2, r5)
            r11.LL = r4
            r11.LLILLJJLI = r8
            r11.LLILLL = r9
            r11.LLILZ = r7
            java.lang.Object r0 = X.C23250099c.LJI(r11, r1, r0)
            if (r0 != r6) goto L1d
            X.C1C7U.LIZIZ(r10)
            return r6
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SCP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
