package X;

/* JADX INFO: renamed from: X.0LKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.ImageUploadTask", f = "ImageUploadTask.kt", l = {268}, m = "getUploadAuthKey")
public final class C541250LKp extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C541280LKs LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541250LKp(C541280LKs c541280LKs, InterfaceC1364105Vn<? super C541250LKp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c541280LKs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageUploadTask@5f84.getUploadAuthKey$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJL = this.LLILLJJLI.LJJJJL(this);
        C1C7U.LIZIZ("ImageUploadTask@5f84.getUploadAuthKey$1");
        return objLJJJJL;
    }
}
