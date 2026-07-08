package X;

import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;

/* JADX INFO: renamed from: X.0Iqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel", f = "MultiTopLivePlayFeedListViewModel.kt", l = {305}, m = "fetchPlayFeedList")
public final class C479330Iqx extends AbstractC23140094w {
    public EnumC479370Ir1 LL;
    public Object LLILLJJLI;
    public C479450Ir9 LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ MultiTopLivePlayFeedListViewModel LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C479330Iqx(MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModel, InterfaceC1364105Vn<? super C479330Iqx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = multiTopLivePlayFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLivePlayFeedListViewModel@15dd.fetchPlayFeedList$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLIZLLLIL.wQ2(null, null, false, null, this);
        C1C7U.LIZIZ("MultiTopLivePlayFeedListViewModel@15dd.fetchPlayFeedList$1");
        return objWQ2;
    }
}
