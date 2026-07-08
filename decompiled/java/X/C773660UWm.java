package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data.LiveModeratorListViewModel;

/* JADX INFO: renamed from: X.0UWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data.LiveModeratorListViewModel", f = "LiveModeratorListViewModel.kt", l = {60}, m = "updateModeratorSharePermission")
public final class C773660UWm extends AbstractC23140094w {
    public int LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ LiveModeratorListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773660UWm(LiveModeratorListViewModel liveModeratorListViewModel, InterfaceC1364105Vn<? super C773660UWm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = liveModeratorListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveModeratorListViewModel@45d9.updateModeratorSharePermission$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(0, 0L, null, this);
        C1C7U.LIZIZ("LiveModeratorListViewModel@45d9.updateModeratorSharePermission$1");
        return objVQ2;
    }
}
