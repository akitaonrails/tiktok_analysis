package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;

/* JADX INFO: renamed from: X.0iyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel", f = "UserCardListViewModel.kt", l = {409}, m = "onLoadMore$suspendImpl")
public final class C1263290iyl extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ UserCardListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263290iyl(UserCardListViewModel userCardListViewModel, InterfaceC1364105Vn<? super C1263290iyl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = userCardListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardListViewModel@982.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objAQ2 = UserCardListViewModel.AQ2(this.LLILLJJLI, null, this);
        C1C7U.LIZIZ("UserCardListViewModel@982.onLoadMore$1");
        return objAQ2;
    }
}
