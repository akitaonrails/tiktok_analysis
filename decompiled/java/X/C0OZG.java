package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel;

/* JADX INFO: renamed from: X.0OZG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel", f = "BulletinPollVoteDetailListViewModel.kt", l = {112}, m = "onLoadMore")
public final class C0OZG extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinPollVoteDetailListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OZG(BulletinPollVoteDetailListViewModel bulletinPollVoteDetailListViewModel, InterfaceC1364105Vn<? super C0OZG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinPollVoteDetailListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPollVoteDetailListViewModel@cfdd.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("BulletinPollVoteDetailListViewModel@cfdd.onLoadMore$1");
        return objOnLoadMore;
    }
}
