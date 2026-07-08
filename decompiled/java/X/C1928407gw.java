package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.PrivacyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928407gw extends C2217421BqW implements Function1<InterfaceC1870207Ue, Unit> {
    public C1928407gw(Object obj) {
        super(1, obj, PrivacyVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/PrivacyCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1870207Ue interfaceC1870207Ue) {
        InterfaceC1870207Ue interfaceC1870207Ue2 = interfaceC1870207Ue;
        PrivacyVM privacyVM = (PrivacyVM) this.receiver;
        privacyVM.getClass();
        if (interfaceC1870207Ue2 instanceof C1870107Ud) {
            privacyVM.vQ2(((C1870107Ud) interfaceC1870207Ue2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
