package X;

/* JADX INFO: renamed from: X.0LKM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoPickFrameUploadTask", f = "AutoPickFrameUploadTask.kt", l = {76, 77, 88, 97, 104, 118, 131, 159, 169, 184, 197, 205, 219, 234, 235, 246}, m = "run")
public final class C0LKM extends AbstractC23140094w {
    public Object LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0LKL LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LKM(C0LKL c0lkl, InterfaceC1364105Vn<? super C0LKM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0lkl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPickFrameUploadTask@d4a9.run$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZIL.LJFF(null, this);
        C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.run$1");
        return objLJFF;
    }
}
