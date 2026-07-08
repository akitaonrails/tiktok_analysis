package X;

/* JADX INFO: renamed from: X.0LKT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.VideoUploadTask", f = "VideoUploadTask.kt", l = {200}, m = "uploadVideo")
public final class C0LKT extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LKQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LKT(C0LKQ c0lkq, InterfaceC1364105Vn<? super C0LKT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lkq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoUploadTask@79a.uploadVideo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJLI = this.LLILLJJLI.LJJJJLI(null, null, this);
        C1C7U.LIZIZ("VideoUploadTask@79a.uploadVideo$1");
        return objLJJJJLI;
    }
}
