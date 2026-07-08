package X;

/* JADX INFO: renamed from: X.0LLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.MultiResourceUploadTask", f = "MultiResourceUploadTask.kt", l = {246, 268}, m = "uploadVideo")
public final class C541360LLa extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C541400LLe LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541360LLa(C541400LLe c541400LLe, InterfaceC1364105Vn<? super C541360LLa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c541400LLe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiResourceUploadTask@eeac.uploadVideo$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILZ.LJJJJLL(null, this);
        C1C7U.LIZIZ("MultiResourceUploadTask@eeac.uploadVideo$1");
        return objLJJJJLL;
    }
}
