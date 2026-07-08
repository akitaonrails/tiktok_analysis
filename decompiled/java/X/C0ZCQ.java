package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics;

/* JADX INFO: renamed from: X.0ZCQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics", f = "IMMessageAnalytics.kt", l = {385}, m = "makeCommonSendMessageParams")
public final class C0ZCQ extends AbstractC23140094w {
    public C869590Y9l LL;
    public C0ZCG LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ IMMessageAnalytics LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZCQ(IMMessageAnalytics iMMessageAnalytics, InterfaceC1364105Vn<? super C0ZCQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = iMMessageAnalytics;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessageAnalytics@7084.makeCommonSendMessageParams$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(0L, null, null, this);
        C1C7U.LIZIZ("IMMessageAnalytics@7084.makeCommonSendMessageParams$1");
        return objLIZ;
    }
}
