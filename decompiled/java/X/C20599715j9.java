package X;

import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel;

/* JADX INFO: renamed from: X.15j9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel", f = "LandscapeProfileListViewModel.kt", l = {197}, m = "onLoadMore")
public final class C20599715j9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LandscapeProfileListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20599715j9(LandscapeProfileListViewModel landscapeProfileListViewModel, InterfaceC1364105Vn<? super C20599715j9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = landscapeProfileListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandscapeProfileListViewModel@74aa.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objDQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("LandscapeProfileListViewModel@74aa.onLoadMore$1");
        return objDQ2;
    }
}
