package X;

/* JADX INFO: renamed from: X.06rT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.analytics.IMBusinessPerformanceAnalytics", f = "IMBusinessChatAnalytics.kt", l = {150}, m = "reportAutoReplyMessagePerformance")
public final class C1738906rT extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1738606rQ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738906rT(C1738606rQ c1738606rQ, InterfaceC1364105Vn<? super C1738906rT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1738606rQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMBusinessPerformanceAnalytics@4654.reportAutoReplyMessagePerformance$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, null, 0L, null, this);
        C1C7U.LIZIZ("IMBusinessPerformanceAnalytics@4654.reportAutoReplyMessagePerformance$1");
        return objLIZLLL;
    }
}
