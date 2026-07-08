package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.SecurityAndPermissionsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928307gv extends C2217421BqW implements Function1<InterfaceC1870607Ui, Unit> {
    public C1928307gv(Object obj) {
        super(1, obj, SecurityAndPermissionsVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/SecurityAndPermissionsCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1870607Ui interfaceC1870607Ui) {
        InterfaceC1870607Ui interfaceC1870607Ui2 = interfaceC1870607Ui;
        SecurityAndPermissionsVM securityAndPermissionsVM = (SecurityAndPermissionsVM) this.receiver;
        securityAndPermissionsVM.getClass();
        if (interfaceC1870607Ui2 instanceof C1870507Uh) {
            securityAndPermissionsVM.vQ2(((C1870507Uh) interfaceC1870607Ui2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
