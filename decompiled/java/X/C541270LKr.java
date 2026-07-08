package X;

/* JADX INFO: renamed from: X.0LKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.ImageUploadTask", f = "ImageUploadTask.kt", l = {198, 212}, m = "beginTask")
public final class C541270LKr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C541280LKs LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541270LKr(C541280LKs c541280LKs, InterfaceC1364105Vn<? super C541270LKr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c541280LKs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageUploadTask@5f84.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("ImageUploadTask@5f84.beginTask$1");
        return objLJJJJJL;
    }
}
