package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;

/* JADX INFO: renamed from: X.0iym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel", f = "UserCardListViewModel.kt", l = {400}, m = "onRefresh$suspendImpl")
public final class C1263300iym extends AbstractC23140094w {
    public UserCardListViewModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ UserCardListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263300iym(UserCardListViewModel userCardListViewModel, InterfaceC1364105Vn<? super C1263300iym> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = userCardListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardListViewModel@982.onRefresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = UserCardListViewModel.BQ2(this.LLILLL, this);
        C1C7U.LIZIZ("UserCardListViewModel@982.onRefresh$1");
        return objBQ2;
    }
}
