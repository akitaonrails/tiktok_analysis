package X;

import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;

/* JADX INFO: renamed from: X.0iXQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel", f = "SystemNotificationListViewModel.kt", l = {111}, m = "onRefresh")
public final class C1246340iXQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SystemNotificationListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246340iXQ(SystemNotificationListViewModel systemNotificationListViewModel, InterfaceC1364105Vn<? super C1246340iXQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = systemNotificationListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemNotificationListViewModel@79a3.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("SystemNotificationListViewModel@79a3.onRefresh$1");
        return objOnRefresh;
    }
}
