package X;

/* JADX INFO: renamed from: X.0LMG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationSaveDraftTask", f = "AICreationSaveDraftTask.kt", l = {75, 81, 82}, m = "handleResult")
public final class C0LMG extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LMB LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LMG(C0LMB c0lmb, InterfaceC1364105Vn<? super C0LMG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lmb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationSaveDraftTask@c95e.handleResult$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJLZIJ = this.LLILLJJLI.LJJJLZIJ(false, this);
        C1C7U.LIZIZ("AICreationSaveDraftTask@c95e.handleResult$1");
        return objLJJJLZIJ;
    }
}
