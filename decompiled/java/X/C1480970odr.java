package X;

import android.content.Context;
import android.os.Build;
import android.util.SparseIntArray;
import android.webkit.CookieManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: X.0odr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480970odr {
    public static C1485800ole LIZ;
    public static Boolean LIZIZ;
    public static C1480980ods LIZJ;
    public static C2503309rT LIZLLL;

    public static InterfaceC1469840oLu LJFF() {
        if (LIZ == null) {
            C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(C786410Ut5.j4("https://%s/", new Object[]{"tiktokv.com"}));
            c1499850p8J.getClass();
            LIZ = new C1485800ole(c1499850p8J.build());
        }
        return LIZ;
    }

    public static boolean LIZLLL() {
        return (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_use_codecpool", true) == 1) && (Build.VERSION.SDK_INT >= 24);
    }

    public static void LIZ(C1480980ods c1480980ods) throws Throwable {
        if (!C104100aN.LIZ().isNewUser()) {
            LIZLLL.getClass();
            if (!C304180Bw8.LIZIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "player_get_cookie_lazy_enable", true) != 1) {
                CookieManager cookieManagerA2 = C786410Ut5.A2();
                String str = C0CQT.LIZ;
                String strLLIZ = C2204961BRm.LLIZ(cookieManagerA2, str, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkiEBigVanPN9ju3CWKta3Be5XUA1cYjHL1qSGA==", null));
                Map<String, String> mapLIZJ = C847400XMc.LIZJ(str);
                C1473540oRs c1473540oRs = new C1473540oRs();
                c1473540oRs.LIZ = strLLIZ;
                c1473540oRs.LIZIZ = mapLIZJ;
                c1480980ods.LJIILIIL = c1473540oRs;
                return;
            }
        }
        c1480980ods.LJIIL = new InterfaceC1473550oRt() { // from class: X.0oe2
        };
    }

    public static void LIZIZ(boolean z, SparseIntArray sparseIntArray) {
        try {
            if (((Boolean) C266310Ac9.LIZ.getValue()).booleanValue() && ((SuperResolutionStrategyConfigV2) C1055540dZg.LIZ.getValue()) != null) {
                LIZJ(z, sparseIntArray);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZJ(boolean z, SparseIntArray sparseIntArray) {
        int i;
        if (sparseIntArray == null) {
            return;
        }
        TTVideoEngine.LLFII(719, 1);
        sparseIntArray.put(42, z ? 1 : 0);
        C01GW c01gw = C1055540dZg.LIZ;
        if (c01gw.getValue() != null) {
            SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2 = (SuperResolutionStrategyConfigV2) c01gw.getValue();
            if (superResolutionStrategyConfigV2 == null) {
                i = 0;
            } else {
                i = superResolutionStrategyConfigV2.asyncInitSr;
            }
        } else {
            i = 1;
        }
        sparseIntArray.put(62, i);
        sparseIntArray.put(66, C0C64.LJIILLIIL().LJIJ(31744, 0, "player_sr_dynamic_control", true));
        sparseIntArray.put(45, C0C64.LJIILLIIL().LJIJ(31744, 5, "player_super_resolution_algorithm_type", true));
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0029: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:33554473), block:B:15:0x0029 */
    public static String LJ(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    TryCatchGuardChecker.doCheck(th);
                    C2260008tK.LIZ(closeable2);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                inputStreamOpen = null;
            }
            try {
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                C2260008tK.LIZ(inputStreamOpen);
                return str2;
            } catch (IOException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                C2260008tK.LIZ(inputStreamOpen);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1480980ods LJI(X.EnumC1479760obu r17, boolean r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1480970odr.LJI(X.0obu, boolean, boolean):X.0ods");
    }
}
