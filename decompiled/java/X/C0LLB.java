package X;

/* JADX INFO: renamed from: X.0LLB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.ImagesUploadTask", f = "ImagesUploadTask.kt", l = {41, 42, 45, 56, 59, 65, 69, 82, 83, 90}, m = "run")
public final class C0LLB extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LL9 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LLB(C0LL9 c0ll9, InterfaceC1364105Vn<? super C0LLB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0ll9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImagesUploadTask@744a.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLI = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("ImagesUploadTask@744a.run$1");
        return objLJJJJLI;
    }
}
