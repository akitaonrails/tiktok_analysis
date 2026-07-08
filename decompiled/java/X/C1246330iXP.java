package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS484S0200000_19;

/* JADX INFO: renamed from: X.0iXP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1246330iXP extends C2217421BqW implements Function2<MusNotice, Boolean, Unit> {
    public C1246330iXP(Object obj) {
        super(2, obj, SystemNotificationListViewModel.class, "onUnsubscribeItem", "onUnsubscribeItem(Lcom/ss/android/ugc/aweme/notice/repo/list/bean/MusNotice;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(MusNotice musNotice, Boolean bool) {
        MusNotice musNotice2 = musNotice;
        boolean zBooleanValue = bool.booleanValue();
        SystemNotificationListViewModel systemNotificationListViewModel = (SystemNotificationListViewModel) this.receiver;
        systemNotificationListViewModel.getClass();
        NoticeChannelInfo noticeChannelInfo = musNotice2.channelInfo;
        if (noticeChannelInfo != null) {
            int i = noticeChannelInfo.group;
            int i2 = musNotice2.channelCategory;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUnsubscribeItem group = ");
            sbLIZ.append(i);
            sbLIZ.append(", category = ");
            sbLIZ.append(i2);
            sbLIZ.append(", isUnsubscribe = ");
            sbLIZ.append(zBooleanValue);
            C1246320iXO.LIZIZ("SystemNotificationListViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C635410Ow7.LIZIZ(i, i2, zBooleanValue, new AwS484S0200000_19(musNotice2, systemNotificationListViewModel, 11), new C1218110hnt(systemNotificationListViewModel), systemNotificationListViewModel.getDisposables());
        }
        return Unit.LIZ;
    }
}
