package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.SwitchAccountVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07h5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1929307h5 extends C2217421BqW implements Function1<InterfaceC1872607Vc, Unit> {
    public C1929307h5(Object obj) {
        super(1, obj, SwitchAccountVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/login/cell/SwitchAccountCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1872607Vc interfaceC1872607Vc) {
        InterfaceC1872607Vc interfaceC1872607Vc2 = interfaceC1872607Vc;
        SwitchAccountVM switchAccountVM = (SwitchAccountVM) this.receiver;
        switchAccountVM.getClass();
        if (interfaceC1872607Vc2 instanceof C1872507Vb) {
            switchAccountVM.vQ2(((C1872507Vb) interfaceC1872607Vc2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
