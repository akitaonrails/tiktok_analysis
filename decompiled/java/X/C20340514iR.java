package X;

import Y.ARunnableS1S3100000_31;
import android.os.Handler;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.HighlightData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14iR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20340514iR {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(552));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(551));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(550));

    public static ConcurrentHashMap LIZIZ() {
        return (ConcurrentHashMap) LIZJ.getValue();
    }

    public static InterfaceC1120520fGU LIZLLL() {
        return (InterfaceC1120520fGU) LIZ.getValue();
    }

    public static boolean LJ() {
        return LIZLLL().isAvailable() && C1120510fGT.LIZ().enable;
    }

    public static boolean LJFF() {
        return LIZLLL().hc() == EnumC1115870f8z.ECOMMERCE;
    }

    public static void LIZ(String str) {
        C20340614iS c20340614iS = (C20340614iS) LIZIZ().remove(str);
        if (c20340614iS != null) {
            LJI("exit room clear cache");
            Runnable runnable = c20340614iS.LIZLLL;
            if (runnable != null) {
                ((Handler) LIZIZ.getValue()).removeCallbacks(runnable);
            }
        }
    }

    public static HighlightData LIZJ(String str) {
        C20340614iS c20340614iS = (C20340614iS) LIZIZ().get(str);
        if (c20340614iS != null) {
            return c20340614iS.LIZ;
        }
        return null;
    }

    public static void LJI(String str) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionManager ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
    }

    public static void LJIIIZ(String str, String str2, String str3) {
        if (!C1120510fGT.LIZ().enable) {
            return;
        }
        if (!LIZIZ().containsKey(str)) {
            LIZIZ().put(str, new C20340614iS());
        }
        C20340614iS c20340614iS = (C20340614iS) LIZIZ().get(str);
        if (c20340614iS != null) {
            c20340614iS.LIZJ = str3;
        }
        C1120500fGS.LIZ(EnumC1120490fGR.START_ENTER_ROOM);
        LJII(str, str2, null, null, true);
    }

    public static void LJII(String str, String str2, String str3, String str4, boolean z) {
        if (!C1120510fGT.LIZ().enable) {
            return;
        }
        C20340614iS c20340614iS = (C20340614iS) LIZIZ().get(str);
        if (c20340614iS == null) {
            c20340614iS = new C20340614iS();
            LIZIZ().put(str, c20340614iS);
        }
        if (z) {
            ARunnableS1S3100000_31 aRunnableS1S3100000_31 = new ARunnableS1S3100000_31(c20340614iS, str, str2, str3, 0);
            C786410Ut5.LJLIIL(C1120510fGT.LIZ().delay, (Handler) LIZIZ.getValue(), aRunnableS1S3100000_31);
            c20340614iS.LIZLLL = aRunnableS1S3100000_31;
            LJI("show is first delay");
            return;
        }
        if (c20340614iS.LIZLLL != null && (str4 == null || str4.length() == 0 || !Intrinsics.LJFF(c20340614iS.LIZJ, str4))) {
            LJI("show is scheduled");
            return;
        }
        if (C703302op.LIZ(str4)) {
            c20340614iS.LIZJ = null;
            LJI("reset firstPinProductId");
        }
        Runnable runnable = c20340614iS.LIZLLL;
        if (runnable != null) {
            ((Handler) LIZIZ.getValue()).removeCallbacks(runnable);
        }
        C1440005kM.LIZ(new C033Z(new C20340714iT(c20340614iS, str, str2, str3)));
    }
}
