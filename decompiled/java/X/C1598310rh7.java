package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;

/* JADX INFO: renamed from: X.0rh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel", f = "SkylightListViewModel.kt", l = {568}, m = "onLoadMore")
public final class C1598310rh7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SkylightListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598310rh7(SkylightListViewModel skylightListViewModel, InterfaceC1364105Vn<? super C1598310rh7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = skylightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightListViewModel@8bc2.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.onLoadMore$1");
        return objOnLoadMore;
    }
}
