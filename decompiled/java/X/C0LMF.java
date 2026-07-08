package X;

/* JADX INFO: renamed from: X.0LMF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationSaveDraftTask", f = "AICreationSaveDraftTask.kt", l = {91}, m = "saveDraft")
public final class C0LMF extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LMB LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LMF(C0LMB c0lmb, InterfaceC1364105Vn<? super C0LMF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lmb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationSaveDraftTask@c95e.saveDraft$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJZ = this.LLILLJJLI.LJJJZ(null, this);
        C1C7U.LIZIZ("AICreationSaveDraftTask@c95e.saveDraft$1");
        return objLJJJZ;
    }
}
