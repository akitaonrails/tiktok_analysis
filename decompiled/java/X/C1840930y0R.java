package X;

import com.ss.android.ugc.aweme.notification.aggregate.InviteListViewModel;

/* JADX INFO: renamed from: X.0y0R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.aggregate.InviteListViewModel", f = "InviteListViewModel.kt", l = {78}, m = "onLoadMore")
public final class C1840930y0R extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InviteListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1840930y0R(InviteListViewModel inviteListViewModel, InterfaceC1364105Vn<? super C1840930y0R> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = inviteListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InviteListViewModel@e654.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("InviteListViewModel@e654.onLoadMore$1");
        return objVQ2;
    }
}
