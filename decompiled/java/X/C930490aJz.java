package X;

import android.app.Activity;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: renamed from: X.0aJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930490aJz implements InterfaceC926580aDg {
    public final LiveWidget LIZ;

    public C930490aJz(LiveWidget liveWidget) {
        this.LIZ = liveWidget;
    }

    @Override // X.InterfaceC926580aDg
    public final boolean LIZ(String str) {
        Activity topActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity();
        if (UserService.getInstance().user().isLogin()) {
            return false;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C476760Imo c476760Imo = new C476760Imo();
        c476760Imo.LIZ = C497740JfY.LJIJI(2131853459);
        c476760Imo.LIZLLL = "interact";
        c476760Imo.LIZJ = 0;
        ((C0J1N) interfaceC500940JkiUser.LJIILL(topActivity, new C501600Jlm(c476760Imo)).LIZJ(C11RD.LJ(this.LIZ))).LIZIZ(new C476750Imn());
        C927960aFu.LIZ("logout");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_LoginInterceptor_");
        sbLIZ.append(42);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onInteractIconClickForApply intercepted by LoginInterceptor, from: ");
        sbLIZ2.append(str);
        C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        return true;
    }
}
