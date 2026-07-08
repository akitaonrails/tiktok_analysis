package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.LogoutVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07h2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1929007h2 extends C2217421BqW implements Function1<InterfaceC1872407Va, Unit> {
    public C1929007h2(Object obj) {
        super(1, obj, LogoutVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/login/cell/LogoutCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1872407Va interfaceC1872407Va) {
        InterfaceC1872407Va interfaceC1872407Va2 = interfaceC1872407Va;
        LogoutVM logoutVM = (LogoutVM) this.receiver;
        logoutVM.getClass();
        if (interfaceC1872407Va2 instanceof C07VZ) {
            logoutVM.vQ2(((C07VZ) interfaceC1872407Va2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
