package X;

/* JADX INFO: renamed from: X.0LMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.CreationDownloadListTask", f = "CreationDownloadListTask.kt", l = {228, 240}, m = "beginTask")
public final class C541660LMe extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C541640LMc LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541660LMe(C541640LMc c541640LMc, InterfaceC1364105Vn<? super C541660LMe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c541640LMc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationDownloadListTask@ec02.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("CreationDownloadListTask@ec02.beginTask$1");
        return objLJJJJJL;
    }
}
