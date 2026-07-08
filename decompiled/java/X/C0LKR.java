package X;

/* JADX INFO: renamed from: X.0LKR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.VideoUploadTask", f = "VideoUploadTask.kt", l = {59, 60, 64, 73, 77, 88, 98, 102, 118, 126, 135, 136, 147, 157}, m = "run")
public final class C0LKR extends AbstractC23140094w {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LKQ LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LKR(C0LKQ c0lkq, InterfaceC1364105Vn<? super C0LKR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lkq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoUploadTask@79a.run$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, this);
        C1C7U.LIZIZ("VideoUploadTask@79a.run$1");
        return objLJFF;
    }
}
