package X;

import com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteRequest;

/* JADX INFO: renamed from: X.0dWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryRemoteDataSource", f = "AdWebHistoryRemoteDataSource.kt", l = {52}, m = "deleteHistoryList")
public final class C1053750dWn extends AbstractC23140094w {
    public AdWebHistoryDeleteRequest LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1053740dWm LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053750dWn(C1053740dWm c1053740dWm, InterfaceC1364105Vn<? super C1053750dWn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1053740dWm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebHistoryRemoteDataSource@3479.deleteHistoryList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("AdWebHistoryRemoteDataSource@3479.deleteHistoryList$1");
        return objLIZ;
    }
}
