package X;

import com.ss.android.ugc.aweme.live.toplives.watchlater.WatchLaterHistoryViewModel;

/* JADX INFO: renamed from: X.0y2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.watchlater.WatchLaterHistoryViewModel", f = "WatchLaterHistoryViewModel.kt", l = {30}, m = "onRefresh")
public final class C1842300y2e extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ WatchLaterHistoryViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842300y2e(WatchLaterHistoryViewModel watchLaterHistoryViewModel, InterfaceC1364105Vn<? super C1842300y2e> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = watchLaterHistoryViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WatchLaterHistoryViewModel@1193.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("WatchLaterHistoryViewModel@1193.onRefresh$1");
        return objOnRefresh;
    }
}
