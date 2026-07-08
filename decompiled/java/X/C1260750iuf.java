package X;

import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel;

/* JADX INFO: renamed from: X.0iuf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel", f = "RepostListViewModel.kt", l = {507}, m = "retryWhenEmpty")
public final class C1260750iuf extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public Object LLILZIL;
    public long LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ RepostListViewModel LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260750iuf(RepostListViewModel repostListViewModel, InterfaceC1364105Vn<? super C1260750iuf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = repostListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostListViewModel@7b6b.retryWhenEmpty$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLIZLLLIL.HQ2(0, 0, 0, 0L, null, this);
        C1C7U.LIZIZ("RepostListViewModel@7b6b.retryWhenEmpty$1");
        return objHQ2;
    }
}
