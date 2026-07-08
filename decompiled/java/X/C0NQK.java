package X;

/* JADX INFO: renamed from: X.0NQK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryActionQueue", f = "AdWebHistoryActionQueue.kt", l = {37}, m = "executeAllTasks")
public final class C0NQK extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NQJ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQK(C0NQJ c0nqj, InterfaceC1364105Vn<? super C0NQK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0nqj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebHistoryActionQueue@330e.executeAllTasks$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this);
        C1C7U.LIZIZ("AdWebHistoryActionQueue@330e.executeAllTasks$1");
        return objLIZIZ;
    }
}
