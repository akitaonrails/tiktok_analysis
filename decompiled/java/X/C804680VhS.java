package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.0VhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804680VhS {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC804670VhR LIZ(Context context) {
        int iLLIILII;
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ != null && networkInfoLJIJ.isAvailable()) {
                int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmM0OR9b31HIQ+RVp0zGel9HqFg=", null));
                if (1 == iLJLLILLLL) {
                    return EnumC804670VhR.WIFI;
                }
                if (iLJLLILLLL == 0) {
                    TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
                    if (C838410Wul.LIZ(context, new String(Base64.decode("YW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=", 0), StandardCharsets.UTF_8)) != 0) {
                        return EnumC804670VhR.UNKNOWN;
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (!C804370Vgx.LIZ.getAndSet(true)) {
                            C804370Vgx.LIZ().LIZIZ();
                        }
                        iLLIILII = C804370Vgx.LIZ().LIZ();
                        if (C804370Vgx.LIZJ || iLLIILII != -1) {
                        }
                        return EnumC804670VhR.MOBILE;
                    }
                    iLLIILII = C2204961BRm.LLIILII(telephonyManager, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmM0OR9b31HIQ+RVp0zGel9HqFg=", null));
                    if (iLLIILII != 3) {
                        if (iLLIILII != 20) {
                            if (iLLIILII != 5 && iLLIILII != 6) {
                                switch (iLLIILII) {
                                    default:
                                        switch (iLLIILII) {
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                            case 14:
                                            case 15:
                                                break;
                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                return EnumC804670VhR.MOBILE_4G;
                                            default:
                                                return EnumC804670VhR.MOBILE;
                                        }
                                    case 8:
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        return EnumC804670VhR.MOBILE_3G;
                                }
                            }
                        } else {
                            return EnumC804670VhR.MOBILE_5G;
                        }
                    }
                    return EnumC804670VhR.MOBILE_3G;
                }
                return EnumC804670VhR.MOBILE;
            }
            return EnumC804670VhR.NONE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return EnumC804670VhR.MOBILE;
        }
    }
}
