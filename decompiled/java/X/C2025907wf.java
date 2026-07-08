package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PrivacyCheckupVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2025907wf extends C2217421BqW implements Function1<InterfaceC1874207Vs, Unit> {
    public C2025907wf(Object obj) {
        super(1, obj, PrivacyCheckupVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/cells/PrivacyCheckupCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1874207Vs interfaceC1874207Vs) {
        InterfaceC1874207Vs interfaceC1874207Vs2 = interfaceC1874207Vs;
        this.receiver.getClass();
        if (interfaceC1874207Vs2 instanceof C1874107Vr) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C1874107Vr) interfaceC1874207Vs2).LIZ, "//privacy/checkup");
            smartRouteBuildRoute.withParam("enter_from", "support_page");
            smartRouteBuildRoute.open();
            C20684815ws.LJFF().submit(RunnableC168400kk.LL);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
