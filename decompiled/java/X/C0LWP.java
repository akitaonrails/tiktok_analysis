package X;

/* JADX INFO: renamed from: X.0LWP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2ITask", f = "EditorProT2ITask.kt", l = {256, 259, 264}, m = "requestProgress")
public final class C0LWP extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543990LVd LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LWP(C543990LVd c543990LVd, InterfaceC1364105Vn<? super C0LWP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543990LVd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2ITask@3dc4.requestProgress$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLL.LJJJJLL(this);
        C1C7U.LIZIZ("EditorProT2ITask@3dc4.requestProgress$1");
        return objLJJJJLL;
    }
}
