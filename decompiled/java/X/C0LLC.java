package X;

/* JADX INFO: renamed from: X.0LLC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.ImagesUploadTask", f = "ImagesUploadTask.kt", l = {99, 105}, m = "beginTask")
public final class C0LLC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LL9 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LLC(C0LL9 c0ll9, InterfaceC1364105Vn<? super C0LLC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0ll9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImagesUploadTask@744a.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("ImagesUploadTask@744a.beginTask$1");
        return objLJJJJJL;
    }
}
