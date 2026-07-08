package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailViewModel;

/* JADX INFO: renamed from: X.0Ia2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailViewModel", f = "BulletinPollVoteDetailViewModel.kt", l = {45}, m = "onRefresh")
public final class C468840Ia2 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinPollVoteDetailViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468840Ia2(BulletinPollVoteDetailViewModel bulletinPollVoteDetailViewModel, InterfaceC1364105Vn<? super C468840Ia2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinPollVoteDetailViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPollVoteDetailViewModel@3f6c.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("BulletinPollVoteDetailViewModel@3f6c.onRefresh$1");
        return objOnRefresh;
    }
}
