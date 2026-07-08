package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.OrdersVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07wR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2024507wR extends C2217421BqW implements Function1<InterfaceC1870007Uc, Unit> {
    public C2024507wR(Object obj) {
        super(1, obj, OrdersVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/OrdersCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1870007Uc interfaceC1870007Uc) {
        InterfaceC1870007Uc interfaceC1870007Uc2 = interfaceC1870007Uc;
        OrdersVM ordersVM = (OrdersVM) this.receiver;
        ordersVM.getClass();
        if (interfaceC1870007Uc2 instanceof C1869907Ub) {
            Activity activityLIZ = C1388190mED.LIZ(((C1869907Ub) interfaceC1870007Uc2).LIZ);
            if (activityLIZ != null) {
                ordersVM.LL.LIZ(activityLIZ);
            }
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
