package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.10ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19378810ri {
    public static final C19378810ri LIZ = new C19378810ri();
    public static final Map<String, C19352310nR> LIZIZ = new LinkedHashMap();

    public static C19352310nR LIZ(C0N6N c0n6n) {
        C19352310nR c19352310nR;
        String strLIZIZ = LIZIZ(c0n6n);
        Map<String, C19352310nR> map = LIZIZ;
        if (map.containsKey(strLIZIZ)) {
            c19352310nR = (C19352310nR) ((LinkedHashMap) map).get(strLIZIZ);
        } else {
            c19352310nR = null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMinisInterstitialAdsCountData, result:");
        sbLIZ.append(c19352310nR);
        C2188811AlT.LIZIZ(sbLIZ);
        return c19352310nR;
    }

    public static String LIZIZ(C0N6N c0n6n) {
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        } else {
            curUserId = null;
        }
        String strLIZ = C2195221Avo.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(strLIZ);
        sbLIZ.append('_');
        sbLIZ.append(c0n6n.ordinal());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getKey, key:");
        sbLIZ2.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        return strLIZIZ;
    }

    public static void LIZJ(C0N6N c0n6n) {
        C19352310nR c19352310nR;
        String strLIZIZ = LIZIZ(c0n6n);
        Map<String, C19352310nR> map = LIZIZ;
        if (map.containsKey(strLIZIZ)) {
            c19352310nR = (C19352310nR) ((LinkedHashMap) map).get(strLIZIZ);
            if (c19352310nR != null) {
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recordShowIfOk, data:");
            sbLIZ.append(c19352310nR);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        c19352310nR = new C19352310nR(0);
        c19352310nR.LIZ = strLIZIZ;
        c19352310nR.LIZIZ++;
        c19352310nR.LIZJ++;
        c19352310nR.LIZLLL = System.currentTimeMillis();
        map.put(strLIZIZ, c19352310nR);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("recordShowIfOk, data:");
        sbLIZ2.append(c19352310nR);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZLLL(C0N6N c0n6n) {
        String strLIZIZ = LIZIZ(c0n6n);
        LIZIZ.remove(strLIZIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset, key:");
        sbLIZ.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
