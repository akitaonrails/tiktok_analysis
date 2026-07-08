package X;

/* JADX INFO: renamed from: X.0LLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.MultiResourceUploadTask", f = "MultiResourceUploadTask.kt", l = {55, 56, 63, 83, 85, 89, 91, 95, 96, 109, 117}, m = "run")
public final class C541380LLc extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C541400LLe LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541380LLc(C541400LLe c541400LLe, InterfaceC1364105Vn<? super C541380LLc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c541400LLe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiResourceUploadTask@eeac.run$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZIL.LJFF(null, this);
        C1C7U.LIZIZ("MultiResourceUploadTask@eeac.run$1");
        return objLJFF;
    }
}
