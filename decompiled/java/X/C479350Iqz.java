package X;

import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;

/* JADX INFO: renamed from: X.0Iqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel", f = "MultiTopLivePlayFeedListViewModel.kt", l = {220}, m = "preloadPlayFeedDataForRender")
public final class C479350Iqz extends AbstractC23140094w {
    public EnumC479370Ir1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MultiTopLivePlayFeedListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C479350Iqz(MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModel, InterfaceC1364105Vn<? super C479350Iqz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = multiTopLivePlayFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLivePlayFeedListViewModel@15dd.preloadPlayFeedDataForRender$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILLL.zQ2(null, null, null, this);
        C1C7U.LIZIZ("MultiTopLivePlayFeedListViewModel@15dd.preloadPlayFeedDataForRender$1");
        return objZQ2;
    }
}
