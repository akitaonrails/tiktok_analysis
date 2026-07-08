package X;

/* JADX INFO: renamed from: X.0LKS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.VideoUploadTask", f = "VideoUploadTask.kt", l = {170, 176}, m = "beginTask")
public final class C0LKS extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LKQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LKS(C0LKQ c0lkq, InterfaceC1364105Vn<? super C0LKS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lkq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoUploadTask@79a.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("VideoUploadTask@79a.beginTask$1");
        return objLJJJJJL;
    }
}
