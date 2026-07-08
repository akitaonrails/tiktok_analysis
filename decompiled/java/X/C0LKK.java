package X;

/* JADX INFO: renamed from: X.0LKK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoPickFrameUploadTask", f = "AutoPickFrameUploadTask.kt", l = {269, 276}, m = "beginTask")
public final class C0LKK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LKL LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LKK(C0LKL c0lkl, InterfaceC1364105Vn<? super C0LKK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lkl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPickFrameUploadTask@d4a9.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.beginTask$1");
        return objLJJJJJL;
    }
}
