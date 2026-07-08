package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1244900iV6 extends C2217421BqW implements Function2<MusNotice, Function0<? extends Unit>, Unit> {
    public C1244900iV6(Object obj) {
        super(2, obj, SystemNotificationListViewModel.class, "reportItemShowEvent", "reportItemShowEvent(Lcom/ss/android/ugc/aweme/notice/repo/list/bean/MusNotice;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(MusNotice musNotice, Function0<? extends Unit> function0) {
        MusNotice musNotice2 = musNotice;
        Function0<? extends Unit> function02 = function0;
        SystemNotificationListViewModel systemNotificationListViewModel = (SystemNotificationListViewModel) this.receiver;
        systemNotificationListViewModel.getClass();
        String str = musNotice2.nid;
        if (str != null && str.length() != 0 && !((CopyOnWriteArraySet) systemNotificationListViewModel.LLILZ.getValue()).contains(musNotice2.nid)) {
            ((CopyOnWriteArraySet) systemNotificationListViewModel.LLILZ.getValue()).add(musNotice2.nid);
            function02.invoke();
        }
        return Unit.LIZ;
    }
}
