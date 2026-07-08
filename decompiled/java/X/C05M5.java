package X;

/* JADX INFO: renamed from: X.05M5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentSyncWorker", f = "OfflineCommentSyncWorker.kt", l = {45}, m = "replay")
public final class C05M5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C05M3 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05M5(C05M3 c05m3, InterfaceC1364105Vn<? super C05M5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c05m3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentSyncWorker@1388.replay$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("OfflineCommentSyncWorker@1388.replay$1");
        return objLIZJ;
    }
}
