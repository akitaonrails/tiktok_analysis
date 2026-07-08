package X;

/* JADX INFO: renamed from: X.0dWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryRemoteDataSource", f = "AdWebHistoryRemoteDataSource.kt", l = {40}, m = "saveAndFetchHistoryList")
public final class C1053760dWo extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1053740dWm LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053760dWo(C1053740dWm c1053740dWm, InterfaceC1364105Vn<? super C1053760dWo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1053740dWm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebHistoryRemoteDataSource@3479.saveAndFetchHistoryList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("AdWebHistoryRemoteDataSource@3479.saveAndFetchHistoryList$1");
        return objLIZJ;
    }
}
