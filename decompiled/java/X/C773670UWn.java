package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data.LiveModeratorListViewModel;

/* JADX INFO: renamed from: X.0UWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data.LiveModeratorListViewModel", f = "LiveModeratorListViewModel.kt", l = {31}, m = "onRefresh")
public final class C773670UWn extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveModeratorListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773670UWn(LiveModeratorListViewModel liveModeratorListViewModel, InterfaceC1364105Vn<? super C773670UWn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = liveModeratorListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveModeratorListViewModel@45d9.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("LiveModeratorListViewModel@45d9.onRefresh$1");
        return objOnRefresh;
    }
}
