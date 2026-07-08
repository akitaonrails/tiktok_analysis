package X;

import Y.AfS155S0200000_19;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1244890iV5 extends C2217421BqW implements Function1<C1246520iXi, Unit> {
    public C1244890iV5(Object obj) {
        super(1, obj, SystemNotificationListViewModel.class, "onDeleteItem", "onDeleteItem(Lcom/ss/android/ugc/aweme/notification/sysnotice/cell/SystemNotificationItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1246520iXi c1246520iXi) {
        C1246520iXi c1246520iXi2 = c1246520iXi;
        SystemNotificationListViewModel systemNotificationListViewModel = (SystemNotificationListViewModel) this.receiver;
        systemNotificationListViewModel.getClass();
        systemNotificationListViewModel.getDisposables().LIZ(NotificationApi.LIZ().LJIILL(c1246520iXi2.LL.nid).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS155S0200000_19(c1246520iXi2, systemNotificationListViewModel, 14), new AfS155S0200000_19(c1246520iXi2, systemNotificationListViewModel, 15)));
        return Unit.LIZ;
    }
}
