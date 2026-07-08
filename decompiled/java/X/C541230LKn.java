package X;

/* JADX INFO: renamed from: X.0LKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask", f = "AutoCut2MAETask.kt", l = {292, 293}, m = "retryAttempt")
public final class C541230LKn extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C541110LKb LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541230LKn(C541110LKb c541110LKb, InterfaceC1364105Vn<? super C541230LKn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c541110LKb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCut2MAETask@5514.retryAttempt$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJLL = this.LLILLJJLI.LJJJLL(this);
        C1C7U.LIZIZ("AutoCut2MAETask@5514.retryAttempt$1");
        return objLJJJLL;
    }
}
