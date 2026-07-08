package X;

/* JADX INFO: renamed from: X.0LVW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditI2VServerTask", f = "EditI2VServerTask.kt", l = {352}, m = "setTaskFailed")
public final class C0LVW extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LVQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVW(C0LVQ c0lvq, InterfaceC1364105Vn<? super C0LVW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lvq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditI2VServerTask@cf5c.setTaskFailed$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(0, null, null, null, this);
        C1C7U.LIZIZ("EditI2VServerTask@cf5c.setTaskFailed$1");
        return objLJI;
    }
}
