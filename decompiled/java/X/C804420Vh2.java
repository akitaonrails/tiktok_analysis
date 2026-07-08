package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Vh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804420Vh2 {
    public static InterfaceC804430Vh3 LIZ;
    public static EnumC804620VhM LIZIZ = EnumC804620VhM.UNKNOWN;
    public static boolean LIZJ;
    public static long LIZLLL;

    public static int LIZ(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C804370Vgx.LIZ.getAndSet(true)) {
                C804370Vgx.LIZ().LIZIZ();
            }
            int iLIZ = C804370Vgx.LIZ().LIZ();
            if (!C804370Vgx.LIZJ && iLIZ == -1) {
                return 0;
            }
            return iLIZ;
        }
        return C2204961BRm.LLIILII(telephonyManager, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8thoe1CgUDWai5Rr1Y=", null));
    }

    public static void LIZIZ(Context context) {
        InterfaceC804430Vh3 interfaceC804430Vh3 = LIZ;
        if (interfaceC804430Vh3 != null && ((C804440Vh4) interfaceC804430Vh3).LIZIZ != EnumC804620VhM.NONE) {
            LIZIZ = ((C804440Vh4) LIZ).LIZIZ;
            return;
        }
        if (!LIZJ && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            C786410Ut5.LJIJJ(C786410Ut5.N3(context), new BroadcastReceiver() { // from class: X.0UuJ
                public static void LIZ(Context context2, Intent intent) {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
                        C804420Vh2.LIZIZ = C804420Vh2.LJ(context2);
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(context2, intent);
                    } else {
                        C2408409cA.LIZ();
                        LIZ(context2, intent);
                    }
                }
            }, intentFilter);
            LIZJ = true;
        }
        if (LIZIZ == EnumC804620VhM.UNKNOWN) {
            LIZIZ = LJ(context);
        }
    }

    public static String LIZJ(List list) {
        String strEncode;
        StringBuilder sb = new StringBuilder();
        for (Pair pair : (ArrayList) list) {
            try {
                String strEncode2 = URLEncoder.encode((String) pair.first, "UTF-8");
                String str = (String) pair.second;
                if (str != null) {
                    try {
                        strEncode = URLEncoder.encode(str, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    strEncode = "";
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(strEncode2);
                sb.append("=");
                sb.append(strEncode);
            } catch (UnsupportedEncodingException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new IllegalArgumentException(e2);
            }
        }
        return sb.toString();
    }

    public static String LIZLLL(EnumC804620VhM enumC804620VhM) {
        if (enumC804620VhM == EnumC804620VhM.WIFI) {
            return "wifi";
        }
        if (enumC804620VhM == EnumC804620VhM.WIFI_24GHZ) {
            return "wifi24ghz";
        }
        if (enumC804620VhM == EnumC804620VhM.WIFI_5GHZ) {
            return "wifi5ghz";
        }
        if (enumC804620VhM == EnumC804620VhM.MOBILE_2G) {
            return "2g";
        }
        if (enumC804620VhM == EnumC804620VhM.MOBILE_3G) {
            return "3g";
        }
        if (enumC804620VhM == EnumC804620VhM.MOBILE_3G_H) {
            return "3gh";
        }
        if (enumC804620VhM == EnumC804620VhM.MOBILE_3G_HP) {
            return "3ghp";
        }
        if (enumC804620VhM == EnumC804620VhM.MOBILE_4G) {
            return "4g";
        }
        if (enumC804620VhM == EnumC804620VhM.MOBILE_5G) {
            return "5g";
        }
        if (enumC804620VhM == EnumC804620VhM.MOBILE) {
            return "mobile";
        }
        return "";
    }

    public static EnumC804620VhM LJ(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ != null && networkInfoLJIJ.isAvailable()) {
                int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8thoe1CgUDWai5Rr1Y=", null));
                if (1 == iLJLLILLLL) {
                    return EnumC804620VhM.WIFI;
                }
                if (iLJLLILLLL == 0) {
                    int iLIZ = LIZ((TelephonyManager) C786410Ut5.H2(context, "phone"));
                    if (iLIZ != 3) {
                        if (iLIZ != 20) {
                            if (iLIZ != 5 && iLIZ != 6) {
                                switch (iLIZ) {
                                    case 8:
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        break;
                                    default:
                                        switch (iLIZ) {
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                            case 14:
                                            case 15:
                                                break;
                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                return EnumC804620VhM.MOBILE_4G;
                                            default:
                                                return EnumC804620VhM.MOBILE;
                                        }
                                        break;
                                }
                            }
                        } else {
                            return EnumC804620VhM.MOBILE_5G;
                        }
                    }
                    return EnumC804620VhM.MOBILE_3G;
                }
                return EnumC804620VhM.MOBILE;
            }
            return EnumC804620VhM.NONE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return EnumC804620VhM.MOBILE;
        }
    }

    public static boolean LJFF(Context context) {
        LIZIZ(context);
        if (System.currentTimeMillis() - LIZLLL > 2000) {
            LIZIZ = LJ(context);
            LIZLLL = System.currentTimeMillis();
        }
        return LIZIZ.isAvailable();
    }

    public static boolean LJI(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null || !networkInfoLJIJ.isAvailable()) {
                return false;
            }
            InterfaceC804430Vh3 interfaceC804430Vh3 = LIZ;
            if (interfaceC804430Vh3 != null && ((C804440Vh4) interfaceC804430Vh3).LIZIZ != EnumC804620VhM.NONE) {
                if (((C804440Vh4) LIZ).LIZIZ != EnumC804620VhM.WIFI) {
                    return false;
                }
                return true;
            }
            if (1 != C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8thoe1CgUDWai5Rr1Y=", null))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
