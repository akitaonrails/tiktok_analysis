package X;

/* JADX INFO: renamed from: X.06rS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.analytics.IMBusinessPerformanceAnalytics", f = "IMBusinessChatAnalytics.kt", l = {128}, m = "checkAndReportAutoReplyMessageLatency")
public final class C1738806rS extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1738606rQ LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738806rS(C1738606rQ c1738606rQ, InterfaceC1364105Vn<? super C1738806rS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1738606rQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMBusinessPerformanceAnalytics@4654.checkAndReportAutoReplyMessageLatency$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, this);
        C1C7U.LIZIZ("IMBusinessPerformanceAnalytics@4654.checkAndReportAutoReplyMessageLatency$1");
        return objLIZ;
    }
}
