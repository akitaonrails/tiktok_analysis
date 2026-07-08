package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.NotificationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07h1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928907h1 extends C2217421BqW implements Function1<C07VC, Unit> {
    public C1928907h1(Object obj) {
        super(1, obj, NotificationVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/NotificationCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VC c07vc) {
        C07VC c07vc2 = c07vc;
        NotificationVM notificationVM = (NotificationVM) this.receiver;
        notificationVM.getClass();
        if (c07vc2 instanceof C07VB) {
            notificationVM.vQ2(((C07VB) c07vc2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
