package X;

/* JADX INFO: renamed from: X.01yT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.session.ReportSession", f = "ReportSession.kt", l = {227, 231, 231}, m = "uploadPerformanceData")
public final class C508301yT extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C508401yU LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508301yT(C508401yU c508401yU, InterfaceC1364105Vn<? super C508301yT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c508401yU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReportSession@cd97.uploadPerformanceData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(null, null, this);
        C1C7U.LIZIZ("ReportSession@cd97.uploadPerformanceData$1");
        return objLJII;
    }
}
