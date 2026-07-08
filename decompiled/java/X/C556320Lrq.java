package X;

/* JADX INFO: renamed from: X.0Lrq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowBaseTracker", f = "AIGCWorkflowBaseTracker.kt", l = {249, 250, 251}, m = "trackSubtaskEnd")
public final class C556320Lrq extends AbstractC23140094w {
    public Object LL;
    public C556010LrL LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ AbstractC556310Lrp LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556320Lrq(AbstractC556310Lrp abstractC556310Lrp, InterfaceC1364105Vn<? super C556320Lrq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = abstractC556310Lrp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowBaseTracker@ac32.trackSubtaskEnd$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLJIJIL.LJIIJ(null, null, 0, 0, null, null, 0L, null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowBaseTracker@ac32.trackSubtaskEnd$1");
        return objLJIIJ;
    }
}
