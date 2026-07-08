package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.MyQrCodeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2025407wa extends C2217421BqW implements Function1<InterfaceC1869807Ua, Unit> {
    public C2025407wa(Object obj) {
        super(1, obj, MyQrCodeVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/MyQrCodeCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1869807Ua interfaceC1869807Ua) {
        Activity activityLIZ;
        InterfaceC1869807Ua interfaceC1869807Ua2 = interfaceC1869807Ua;
        this.receiver.getClass();
        if (interfaceC1869807Ua2 instanceof C07UZ) {
            Context context = ((C07UZ) interfaceC1869807Ua2).LIZ;
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C621180OYa.LIZ.LJJLJ(activityLIZ, "settings_page", null);
            }
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
