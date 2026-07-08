package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0aDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926700aDs implements InterfaceC926580aDg {
    @Override // X.InterfaceC926580aDg
    public final boolean LIZ(String str) {
        if (UserService.getInstance().user().LJIJI(EnumC1134120fcQ.INTERACT)) {
            C927960aFu.LIZ("interactLimit");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
            sbLIZ.append("_LiveInteractFuncInterceptor_");
            sbLIZ.append(26);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onInteractIconClickForApply intercepted by LiveInteractFuncInterceptor, from: ");
            sbLIZ2.append(str);
            C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return true;
        }
        return false;
    }
}
