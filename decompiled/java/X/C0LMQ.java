package X;

/* JADX INFO: renamed from: X.0LMQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.CreationDownloadTask", f = "CreationDownloadTask.kt", l = {142, 159}, m = "beginTask")
public final class C0LMQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LMO LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LMQ(C0LMO c0lmo, InterfaceC1364105Vn<? super C0LMQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lmo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationDownloadTask@d5c2.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("CreationDownloadTask@d5c2.beginTask$1");
        return objLJJJJJL;
    }
}
