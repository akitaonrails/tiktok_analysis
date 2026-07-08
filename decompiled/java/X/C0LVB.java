package X;

/* JADX INFO: renamed from: X.0LVB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerProgressTask", f = "AICreationServerProgressTask.kt", l = {357}, m = "setTaskFailed")
public final class C0LVB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LV4 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVB(C0LV4 c0lv4, InterfaceC1364105Vn<? super C0LVB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lv4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerProgressTask@fd9e.setTaskFailed$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(0, null, null, null, this);
        C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.setTaskFailed$1");
        return objLJI;
    }
}
