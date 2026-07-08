package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0mQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentDataSource", f = "OfflineCommentDataSource.kt", l = {186, 189, 191, 203, 207, 209, 216, 218}, m = "refreshAllIfDue")
public final class C1396060mQu extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Aweme LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C1396050mQt LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1396060mQu(C1396050mQt c1396050mQt, InterfaceC1364105Vn<? super C1396060mQu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c1396050mQt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentDataSource@a92b.refreshAllIfDue$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLJI.LJIIIZ(this);
        C1C7U.LIZIZ("OfflineCommentDataSource@a92b.refreshAllIfDue$1");
        return objLJIIIZ;
    }
}
