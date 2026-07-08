package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ab.LiveFYPWindowForCountryModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0rfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597250rfP implements InterfaceC1597210rfL<C1597410rff>, InterfaceC1596890rep {
    @Override // X.InterfaceC1596890rep
    public final void LIZIZ(C1597440rfi c1597440rfi) {
        c1597440rfi.LIZ(C1597410rff.LIZ);
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZ(InterfaceC1597430rfh interfaceC1597430rfh, C1597310rfV c1597310rfV) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZJ(InterfaceC1597430rfh interfaceC1597430rfh, C1597320rfW c1597320rfW) {
        User curUser;
        String strLIZ;
        if (c1597320rfW.LIZJ == EnumC1597050rf5.LOAD_MORE) {
            return C13BV.INSTANCE;
        }
        LiveFYPWindowForCountryModel liveFYPWindowForCountryModelLIZ = C1594980rbk.LIZ();
        if (liveFYPWindowForCountryModelLIZ.avatarType > 0 && liveFYPWindowForCountryModelLIZ.goLiveAvatar && C1594980rbk.LIZJ) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
                C1595990rdN c1595990rdN = new C1595990rdN(curUser);
                String strLIZJ = C1596950rev.LIZJ(EnumC1597060rf6.LIVE, "go_live");
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLL(c1597320rfW.LIZIZ);
                if (interfaceC1891350zJl != null && (strLIZ = c1597320rfW.LIZ(interfaceC1891350zJl)) != null) {
                    return Collections.singletonList(new C1160310gIf(strLIZJ, c1595990rdN, strLIZ, C0N2L.BEFORE));
                }
                return Collections.singletonList(new C1160310gIf(strLIZJ, c1595990rdN, "", C0N2L.AFTER));
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }
}
