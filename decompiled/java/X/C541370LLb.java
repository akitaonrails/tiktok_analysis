package X;

/* JADX INFO: renamed from: X.0LLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.MultiResourceUploadTask", f = "MultiResourceUploadTask.kt", l = {127, 138}, m = "beginTask")
public final class C541370LLb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C541400LLe LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541370LLb(C541400LLe c541400LLe, InterfaceC1364105Vn<? super C541370LLb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c541400LLe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiResourceUploadTask@eeac.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("MultiResourceUploadTask@eeac.beginTask$1");
        return objLJJJJJL;
    }
}
