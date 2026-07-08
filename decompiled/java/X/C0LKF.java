package X;

/* JADX INFO: renamed from: X.0LKF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.backgroundtask.SafeFrameUploadTaskWrapper", f = "AutoPickFrameUploadBackgroundTask.kt", l = {118}, m = "run")
public final class C0LKF extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LKE LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LKF(C0LKE c0lke, InterfaceC1364105Vn<? super C0LKF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lke;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SafeFrameUploadTaskWrapper@156.run$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJFF(null, this);
        C1C7U.LIZIZ("SafeFrameUploadTaskWrapper@156.run$1");
        return objLJJJJJL;
    }
}
