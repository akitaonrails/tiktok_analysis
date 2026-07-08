package X;

/* JADX INFO: renamed from: X.0LWA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2ITask", f = "EditorProT2ITask.kt", l = {240, 246}, m = "setTaskFailAttempt")
public final class C0LWA extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543990LVd LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LWA(C543990LVd c543990LVd, InterfaceC1364105Vn<? super C0LWA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543990LVd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2ITask@3dc4.setTaskFailAttempt$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJZI = this.LLILZ.LJJJJZI(0, null, null, this);
        C1C7U.LIZIZ("EditorProT2ITask@3dc4.setTaskFailAttempt$1");
        return objLJJJJZI;
    }
}
