package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Vh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804410Vh1 {
    public static int LIZ(Context context) {
        NetworkInfo networkInfoLJIJ;
        int iLLIILII;
        try {
            networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 16;
        }
        if (networkInfoLJIJ == null || !networkInfoLJIJ.isAvailable()) {
            return 0;
        }
        int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKZy4FEza7J60guilFZQ3oDU2lPSD9+BqgsKGNXg==", null));
        if (1 == iLJLLILLLL) {
            return 1;
        }
        if (iLJLLILLLL != 0) {
            return 16;
        }
        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C804370Vgx.LIZ.getAndSet(true)) {
                C804370Vgx.LIZ().LIZIZ();
            }
            iLLIILII = C804370Vgx.LIZ().LIZ();
            if (!C804370Vgx.LIZJ && iLLIILII == -1) {
                return 16;
            }
        } else {
            iLLIILII = C2204961BRm.LLIILII(telephonyManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKZy4FEza7J60guilFZQ3oDU2lPSD9+BqgsKGNXg==", null));
        }
        if (iLLIILII != 3) {
            if (iLLIILII != 20) {
                if (iLLIILII == 5 || iLLIILII == 6) {
                    return 4;
                }
                switch (iLLIILII) {
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return 4;
                    default:
                        switch (iLLIILII) {
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            case 14:
                            case 15:
                                return 4;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                return 2;
                            default:
                                return 16;
                        }
                }
                TryCatchGuardChecker.doCheck(th);
                return 16;
            }
            return 2;
        }
        return 4;
    }

    public static boolean LIZIZ(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null) {
                return false;
            }
            if (!networkInfoLJIJ.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
