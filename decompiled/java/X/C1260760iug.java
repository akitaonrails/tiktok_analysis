package X;

import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel;

/* JADX INFO: renamed from: X.0iug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel", f = "RepostListViewModel.kt", l = {154, 156}, m = "fetchServerData")
public final class C1260760iug extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ RepostListViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260760iug(RepostListViewModel repostListViewModel, InterfaceC1364105Vn<? super C1260760iug> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = repostListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("RepostListViewModel@7b6b.fetchServerData$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILZLL.CQ2(null, 0L, 0, 0, false, this);
        C1C7U.LIZIZ("RepostListViewModel@7b6b.fetchServerData$1");
        return objCQ2;
    }
}
