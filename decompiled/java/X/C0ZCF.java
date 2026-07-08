package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNewMessageAnalytics;

/* JADX INFO: renamed from: X.0ZCF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNewMessageAnalytics", f = "IMNewMessageAnalytics.kt", l = {190, 198}, m = "constructNewEventTrackingParams")
public final class C0ZCF extends AbstractC23140094w {
    public Object LL;
    public C0ZCG LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ IMNewMessageAnalytics LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZCF(IMNewMessageAnalytics iMNewMessageAnalytics, InterfaceC1364105Vn<? super C0ZCF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = iMNewMessageAnalytics;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMNewMessageAnalytics@f8bf.constructNewEventTrackingParams$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, null, null, this);
        C1C7U.LIZIZ("IMNewMessageAnalytics@f8bf.constructNewEventTrackingParams$1");
        return objLIZLLL;
    }
}
