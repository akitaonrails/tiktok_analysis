package X;

/* JADX INFO: renamed from: X.0LVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2ITask", f = "EditorProT2ITask.kt", l = {70, 71, 73, 74, 75, 76}, m = "run")
public final class C544110LVp extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543990LVd LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544110LVp(C543990LVd c543990LVd, InterfaceC1364105Vn<? super C544110LVp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543990LVd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2ITask@3dc4.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("EditorProT2ITask@3dc4.run$1");
        return objLJFF;
    }
}
