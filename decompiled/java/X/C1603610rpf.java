package X;

import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel;

/* JADX INFO: renamed from: X.0rpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel", f = "RepostFeedDetailViewModel.kt", l = {216}, m = "onLoadMore")
public final class C1603610rpf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RepostFeedDetailViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603610rpf(RepostFeedDetailViewModel repostFeedDetailViewModel, InterfaceC1364105Vn<? super C1603610rpf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = repostFeedDetailViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostFeedDetailViewModel@279b.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(0L, this);
        C1C7U.LIZIZ("RepostFeedDetailViewModel@279b.onLoadMore$1");
        return objOnLoadMore;
    }
}
