package X;

/* JADX INFO: renamed from: X.0LQT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskFactory", f = "CreationAsyncTaskFactory.kt", l = {145}, m = "repairTaskStatus")
public final class C0LQT extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LQK LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LQT(C0LQK c0lqk, InterfaceC1364105Vn<? super C0LQT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lqk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskFactory@88c4.repairTaskStatus$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("CreationAsyncTaskFactory@88c4.repairTaskStatus$1");
        return objLIZIZ;
    }
}
