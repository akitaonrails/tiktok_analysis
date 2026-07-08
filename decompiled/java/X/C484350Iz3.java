package X;

import com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel;

/* JADX INFO: renamed from: X.0Iz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel", f = "LiveNotificationListViewModel.kt", l = {96}, m = "fetchList")
public final class C484350Iz3 extends AbstractC23140094w {
    public EnumC484320Iz0 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveNotificationListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C484350Iz3(LiveNotificationListViewModel liveNotificationListViewModel, InterfaceC1364105Vn<? super C484350Iz3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = liveNotificationListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNotificationListViewModel@527e.fetchList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, null, this);
        C1C7U.LIZIZ("LiveNotificationListViewModel@527e.fetchList$1");
        return objVQ2;
    }
}
