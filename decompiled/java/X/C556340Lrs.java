package X;

/* JADX INFO: renamed from: X.0Lrs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowBaseTracker", f = "AIGCWorkflowBaseTracker.kt", l = {193, 194, 195}, m = "trackTaskEnd")
public final class C556340Lrs extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ AbstractC556310Lrp LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556340Lrs(AbstractC556310Lrp abstractC556310Lrp, InterfaceC1364105Vn<? super C556340Lrs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = abstractC556310Lrp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowBaseTracker@ac32.trackTaskEnd$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLJI.LJIILIIL(null, 0, 0, null, null, 0L, null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowBaseTracker@ac32.trackTaskEnd$1");
        return objLJIILIIL;
    }
}
