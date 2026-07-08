package X;

import android.accounts.Account;
import android.content.Context;
import com.bytedance.bdinstall.storage.AbsDeviceParamsProvider;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0XBF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XBF extends C0XBI {
    public static void LIZ(final Context context, C844630XBl c844630XBl, C844770XBz c844770XBz) {
        String strLIZIZ;
        String strLIZJ;
        if (c844630XBl.LLILLL) {
            strLIZJ = C844580XBg.LIZJ(c844630XBl, "dp");
        } else {
            if (c844770XBz.LJJIIZ) {
                strLIZIZ = "device_parameters";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("device_parameters_");
                sbLIZ.append(c844770XBz.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            strLIZJ = C844580XBg.LIZJ(c844630XBl, strLIZIZ);
        }
        if (c844770XBz.LJJI) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZJ);
            sbLIZ2.append("_local");
            strLIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZJ);
        sbLIZ3.append(".dat");
        C2188811AlT.LIZIZ(sbLIZ3);
        final C0WID c0wid = new C0WID();
        c0wid.LIZ = c844630XBl.LIZ(c844770XBz);
        c0wid.LIZIZ = c844770XBz.LJJI;
        Account account = c844770XBz.LJIJJLI;
        String strLIZJ2 = C844580XBg.LIZJ(c844630XBl, "");
        c0wid.LIZJ = account;
        c0wid.LIZLLL = strLIZJ2;
        c0wid.LJ = c844770XBz;
        Object objLJII = new AbsDeviceParamsProvider(context, c0wid) { // from class: X.0WIC
            @Override // X.C0XBK
            public final void clearAll() {
                this.LIZJ.LIZLLL(Arrays.asList("openudid", "clientudid", "device_id", "install_id"));
            }
        };
        InterfaceC844940XCq interfaceC844940XCq = (InterfaceC844940XCq) C0XBH.LIZ(InterfaceC844940XCq.class, c844770XBz.LIZ());
        if (interfaceC844940XCq != null) {
            objLJII = interfaceC844940XCq.LJII();
        }
        C0XBH.LIZIZ(C0XBK.class, c844770XBz.LIZ(), objLJII);
    }
}
