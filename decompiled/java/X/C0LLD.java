package X;

/* JADX INFO: renamed from: X.0LLD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.ImagesUploadTask", f = "ImagesUploadTask.kt", l = {164}, m = "getUploadAuthKey")
public final class C0LLD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LL9 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LLD(C0LL9 c0ll9, InterfaceC1364105Vn<? super C0LLD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0ll9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImagesUploadTask@744a.getUploadAuthKey$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJL = this.LLILLJJLI.LJJJJL(this);
        C1C7U.LIZIZ("ImagesUploadTask@744a.getUploadAuthKey$1");
        return objLJJJJL;
    }
}
