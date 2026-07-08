package X;

import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;

/* JADX INFO: renamed from: X.0Ir0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel", f = "MultiTopLivePlayFeedListViewModel.kt", l = {531}, m = "onLoadMore")
public final class C479360Ir0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MultiTopLivePlayFeedListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C479360Ir0(MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModel, InterfaceC1364105Vn<? super C479360Ir0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = multiTopLivePlayFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLivePlayFeedListViewModel@15dd.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLJJLI.yQ2(this);
        C1C7U.LIZIZ("MultiTopLivePlayFeedListViewModel@15dd.onLoadMore$1");
        return objYQ2;
    }
}
