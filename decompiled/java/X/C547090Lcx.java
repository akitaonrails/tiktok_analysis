package X;

/* JADX INFO: renamed from: X.0Lcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.lifecycle.resourcemanager.AsyncTaskHandle", f = "AsyncTaskHandle.kt", l = {43}, m = "release")
public final class C547090Lcx extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C547060Lcu LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C547090Lcx(C547060Lcu c547060Lcu, InterfaceC1364105Vn<? super C547090Lcx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c547060Lcu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTaskHandle@2ba6.release$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("AsyncTaskHandle@2ba6.release$1");
        return objLIZIZ;
    }
}
