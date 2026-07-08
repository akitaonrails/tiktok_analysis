package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T82, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T82 {
    public static void LJFF() {
        List<C1897250zTH> listLLIIII;
        synchronized (C1897250zTH.LJIIIIZZ) {
            try {
                listLLIIII = C13LP.LLIIII(C1897250zTH.LJIIIZ.getValue().values());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (C1897250zTH c1897250zTH : listLLIIII) {
            c1897250zTH.LJIILLIIL(0);
            ((LinkedHashMap) c1897250zTH.LJFF).clear();
        }
    }

    public static C1897250zTH LIZJ(String str) {
        C1897250zTH c1897250zTH;
        synchronized (C1897250zTH.LJIIIIZZ) {
            try {
                HashMap<String, C1897250zTH> value = C1897250zTH.LJIIIZ.getValue();
                C1897250zTH c1897250zTH2 = value.get(str);
                if (c1897250zTH2 == null) {
                    c1897250zTH2 = new C1897250zTH(LJ(str));
                    value.put(str, c1897250zTH2);
                }
                c1897250zTH = c1897250zTH2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1897250zTH;
    }

    public static String LIZLLL(String str) {
        String str2;
        Map<String, String> map;
        int iLJ = LJ(str);
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1893670zNV c1893670zNVLJ = C2178808gE.LIZ().LJ(iLJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("referral_card_");
        if (c1893670zNVLJ == null || (map = c1893670zNVLJ.LJ) == null || (str2 = map.get("type")) == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LJ(String str) {
        if (!Intrinsics.LJFF(str, "homepage_hot") && Intrinsics.LJFF(str, "homepage_friends")) {
            return 28;
        }
        return 8;
    }

    public static boolean LIZ(C0VSJ c0vsj, String str) {
        if (!c0vsj.exists() || str == null || str.length() == 0) {
            return false;
        }
        return Intrinsics.LJFF(C08HM.LIZIZ(c0vsj), str);
    }

    public static int LIZIZ(double d, Context context) {
        if (context != null && context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
            return (int) ((d * ((double) context.getResources().getDisplayMetrics().density)) + ((double) 0.5f));
        }
        return 0;
    }
}
