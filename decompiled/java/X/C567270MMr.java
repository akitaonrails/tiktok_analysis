package X;

/* JADX INFO: renamed from: X.0MMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.composer.task.DownloadVideoTask", f = "DownloadVideoTask.kt", l = {134}, m = "runInternal")
public final class C567270MMr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C567250MMp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567270MMr(C567250MMp c567250MMp, InterfaceC1364105Vn<? super C567270MMr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c567250MMp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadVideoTask@71b9.runInternal$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("DownloadVideoTask@71b9.runInternal$1");
        return objLIZLLL;
    }
}
