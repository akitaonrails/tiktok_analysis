package X;

/* JADX INFO: renamed from: X.05vS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis", f = "IMSmartReplyAnalysis.kt", l = {1080}, m = "checkAndReportAutoReplyMessageLatency")
public final class C1508805vS extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1508705vR LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508805vS(C1508705vR c1508705vR, InterfaceC1364105Vn<? super C1508805vS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1508705vR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.checkAndReportAutoReplyMessageLatency$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, this);
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.checkAndReportAutoReplyMessageLatency$1");
        return objLIZ;
    }
}
