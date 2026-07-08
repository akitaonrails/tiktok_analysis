package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0XF1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@InterfaceC1294060jmO
public final class C0XF1 {
    public static final /* synthetic */ int LIZ = 0;

    public static final C0XF2 LIZ(Context context) {
        int iLLIILII;
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ != null && networkInfoLJIJ.isAvailable()) {
                int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhyC+vMYsNtE2evGYQ==", null));
                if (1 == iLJLLILLLL) {
                    return C0XF2.WIFI;
                }
                if (iLJLLILLLL == 0) {
                    TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (!C804370Vgx.LIZ.getAndSet(true)) {
                            C804370Vgx.LIZ().LIZIZ();
                        }
                        iLLIILII = C804370Vgx.LIZ().LIZ();
                        if (C804370Vgx.LIZJ || iLLIILII != -1) {
                        }
                        return C0XF2.MOBILE;
                    }
                    iLLIILII = C2204961BRm.LLIILII(telephonyManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhyC+vMYsNtE2evGYQ==", null));
                    switch (iLLIILII) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            return C0XF2.MOBILE_2G;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        case 14:
                        case 15:
                            return C0XF2.MOBILE_3G;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            return C0XF2.MOBILE_4G;
                        default:
                            return C0XF2.MOBILE;
                    }
                }
                return C0XF2.MOBILE;
            }
            return C0XF2.NONE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C0XF2.MOBILE;
        }
    }

    public static final boolean LIZIZ(Context context) {
        if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Context context) {
        C0XF2 c0xf2LIZ = LIZ(context);
        if (C0XF2.MOBILE_2G != c0xf2LIZ && C0XF2.MOBILE_3G != c0xf2LIZ && C0XF2.MOBILE_4G != c0xf2LIZ && C0XF2.MOBILE != c0xf2LIZ) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null) {
                return false;
            }
            if (!networkInfoLJIJ.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final boolean LJ(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null || !networkInfoLJIJ.isAvailable()) {
                return false;
            }
            if (1 != C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhyC+vMYsNtE2evGYQ==", null))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
