package X;

/* JADX INFO: renamed from: X.0LW0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2ITask", f = "EditorProT2ITask.kt", l = {108, 120, 132}, m = "beginTask")
public final class C0LW0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543990LVd LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LW0(C543990LVd c543990LVd, InterfaceC1364105Vn<? super C0LW0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543990LVd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2ITask@3dc4.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, null, this);
        C1C7U.LIZIZ("EditorProT2ITask@3dc4.beginTask$1");
        return objLJJJJJL;
    }
}
