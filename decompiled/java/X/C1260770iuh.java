package X;

import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel;

/* JADX INFO: renamed from: X.0iuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel", f = "RepostListViewModel.kt", l = {98, 98, 102}, m = "fetchRepostList")
public final class C1260770iuh extends AbstractC23140094w {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ RepostListViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260770iuh(RepostListViewModel repostListViewModel, InterfaceC1364105Vn<? super C1260770iuh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = repostListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostListViewModel@7b6b.fetchRepostList$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILZLL.BQ2(0, 0L, 0, null, this);
        C1C7U.LIZIZ("RepostListViewModel@7b6b.fetchRepostList$1");
        return objBQ2;
    }
}
