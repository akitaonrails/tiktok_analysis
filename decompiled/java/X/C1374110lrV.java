package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374110lrV {
    public static String LIZ(AbstractC1375550ltp abstractC1375550ltp) {
        String str;
        String str2 = "";
        if (abstractC1375550ltp instanceof C1375540lto) {
            C1375540lto c1375540lto = (C1375540lto) abstractC1375550ltp;
            String str3 = c1375540lto.LIZJ;
            if (str3 != null && str3.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1375540lto.LIZJ);
                sbLIZ.append(' ');
                String str4 = c1375540lto.LJ;
                if (str4 != null) {
                    str2 = str4;
                }
                sbLIZ.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            str = c1375540lto.LJ;
            if (str == null) {
                return "";
            }
        } else {
            if (!(abstractC1375550ltp instanceof C1374270lrl)) {
                return "";
            }
            C1374270lrl c1374270lrl = (C1374270lrl) abstractC1375550ltp;
            String str5 = c1374270lrl.LIZJ;
            if (str5 != null && str5.length() != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1374270lrl.LIZJ);
                sbLIZ2.append(' ');
                String str6 = c1374270lrl.LJ;
                if (str6 != null) {
                    str2 = str6;
                }
                sbLIZ2.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            str = c1374270lrl.LJ;
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    public static void LIZIZ(String str, String str2) {
        Pair[] pairArr = new Pair[3];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("app_package_name", str);
        pairArr[1] = new Pair("platform", "sms");
        pairArr[2] = new Pair("share_mode", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("sms_share_info_track", mapLJIIJ);
        }
    }
}
