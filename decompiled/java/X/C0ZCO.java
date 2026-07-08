package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics;

/* JADX INFO: renamed from: X.0ZCO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics", f = "IMMessageAnalytics.kt", l = {157, 266}, m = "reportMessage")
public final class C0ZCO extends AbstractC23140094w {
    public C869590Y9l LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ IMMessageAnalytics LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZCO(IMMessageAnalytics iMMessageAnalytics, InterfaceC1364105Vn<? super C0ZCO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = iMMessageAnalytics;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessageAnalytics@7084.reportMessage$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZ.LIZIZ(null, null, 0L, null, null, this);
        C1C7U.LIZIZ("IMMessageAnalytics@7084.reportMessage$1");
        return objLIZIZ;
    }
}
