package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: renamed from: X.0hnt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1218110hnt extends C2217421BqW implements Function0<Unit> {
    public C1218110hnt(SystemNotificationListViewModel systemNotificationListViewModel) {
        super(0, systemNotificationListViewModel, SystemNotificationListViewModel.class, "onUnsubscribeFailed", "onUnsubscribeFailed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AssemViewModel assemViewModel = (AssemViewModel) this.receiver;
        assemViewModel.getClass();
        assemViewModel.setState(new AwS70S1000000_19(C1618770sE7.LIZJ(2131828035), 22));
        return Unit.LIZ;
    }
}
