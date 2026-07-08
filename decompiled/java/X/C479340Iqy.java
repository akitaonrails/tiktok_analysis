package X;

import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;

/* JADX INFO: renamed from: X.0Iqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel", f = "MultiTopLivePlayFeedListViewModel.kt", l = {477}, m = "onRefresh")
public final class C479340Iqy extends AbstractC23140094w {
    public C259800zU LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MultiTopLivePlayFeedListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C479340Iqy(MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModel, InterfaceC1364105Vn<? super C479340Iqy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = multiTopLivePlayFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLivePlayFeedListViewModel@15dd.onRefresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLL.onRefresh(this);
        C1C7U.LIZIZ("MultiTopLivePlayFeedListViewModel@15dd.onRefresh$1");
        return objOnRefresh;
    }
}
