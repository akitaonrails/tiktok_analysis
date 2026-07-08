package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510170pOx {
    public static String LIZIZ;
    public static long LIZLLL;
    public static long LJFF;
    public static C1497140p3w LJI;
    public static long LJII;
    public static int LJIIIIZZ;
    public static long LJIIIZ;
    public static boolean LJIIJ;
    public static long LJIIJJI;
    public static int LJIIL;
    public static long LJIILIIL;
    public static IRequestIdService LJIILJJIL;
    public static final SimpleDateFormat LJIILL;
    public static final C1510170pOx LIZ = new C1510170pOx();
    public static String LIZJ = "";
    public static int LJ = -1;

    static {
        C1497140p3w c1497140p3w = new C1497140p3w();
        LJI = c1497140p3w;
        LJIILL = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        c1497140p3w.LIZJ = 0;
        c1497140p3w.LIZIZ = 0;
        c1497140p3w.LIZ = 0;
    }

    public static C1497140p3w LIZ(long j) {
        if (j - LJII > 30000) {
            try {
                C1497140p3w networkQuality = TTNetInit.getNetworkQuality();
                if (networkQuality != null) {
                    LJI = networkQuality;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJII = j;
        }
        return LJI;
    }

    public static boolean LIZJ(float f) {
        double d = f;
        if (0.0d <= d && d <= 1.0d) {
            if (AbstractC19994813Le.Default.nextFloat() <= f) {
                return true;
            }
            return false;
        }
        "Probability must be between 0 and 1".toString();
        throw new IllegalArgumentException("Probability must be between 0 and 1");
    }

    public static C0SDA LIZIZ(String str, String str2) {
        if (LJIILJJIL == null) {
            LJIILJJIL = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
        }
        if (LJIILJJIL != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Intrinsics.LJFF(str2, "homepage_hot")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('0');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return LJIILJJIL.LIZLLL(strLIZIZ);
            }
        }
        return null;
    }
}
