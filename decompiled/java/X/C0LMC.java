package X;

/* JADX INFO: renamed from: X.0LMC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationSaveDraftTask", f = "AICreationSaveDraftTask.kt", l = {28, 30, 35, 37, 38}, m = "run")
public final class C0LMC extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LMB LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LMC(C0LMB c0lmb, InterfaceC1364105Vn<? super C0LMC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lmb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationSaveDraftTask@c95e.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("AICreationSaveDraftTask@c95e.run$1");
        return objLJFF;
    }
}
