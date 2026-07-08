package X;

import com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel;

/* JADX INFO: renamed from: X.0Iz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel", f = "LiveNotificationListViewModel.kt", l = {137}, m = "onLoadMore")
public final class C484390Iz7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveNotificationListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C484390Iz7(LiveNotificationListViewModel liveNotificationListViewModel, InterfaceC1364105Vn<? super C484390Iz7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = liveNotificationListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNotificationListViewModel@527e.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(this);
        C1C7U.LIZIZ("LiveNotificationListViewModel@527e.onLoadMore$1");
        return objWQ2;
    }
}
