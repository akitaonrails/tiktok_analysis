package X;

/* JADX INFO: renamed from: X.0LKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask", f = "AutoCut2MAETask.kt", l = {420}, m = "handlePollingRetryableFailure")
public final class C541180LKi extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C541110LKb LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541180LKi(C541110LKb c541110LKb, InterfaceC1364105Vn<? super C541180LKi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c541110LKb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCut2MAETask@5514.handlePollingRetryableFailure$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJZ = this.LLILZ.LJJJJZ(0, null, this);
        C1C7U.LIZIZ("AutoCut2MAETask@5514.handlePollingRetryableFailure$1");
        return objLJJJJZ;
    }
}
