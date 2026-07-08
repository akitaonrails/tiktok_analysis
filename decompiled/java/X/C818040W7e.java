package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0W7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818040W7e {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context) {
        TelephonyManager telephonyManager;
        Object objH2 = C786410Ut5.H2(context, "phone");
        if (!(objH2 instanceof TelephonyManager) || (telephonyManager = (TelephonyManager) objH2) == null || telephonyManager.getSimState() != 5) {
            return null;
        }
        AtomicBoolean atomicBoolean = C794320VDy.LIZ;
        return C1300840jxK.LJ(telephonyManager);
    }

    public static ProxyInfo LIZIZ(ConnectivityManager connectivityManager) {
        ProxyInfo httpProxy;
        Network network;
        NetworkCapabilities networkCapabilitiesLJLJL;
        LinkProperties linkPropertiesLJLJJLL;
        String host;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        int length = allNetworks.length;
        int i = 0;
        while (true) {
            httpProxy = null;
            if (i >= length || !((networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager, (network = allNetworks[i]), new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK77lcoPOEm8bxuE56mklKUJqdM=", null))) == null || networkCapabilitiesLJLJL.hasTransport(4) || (linkPropertiesLJLJJLL = C2204961BRm.LJLJJLL(connectivityManager, network, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK77lcoPOEm8bxuE56mklKUJqdM=", null))) == null || (httpProxy = linkPropertiesLJLJJLL.getHttpProxy()) == null || (host = httpProxy.getHost()) == null || host.length() == 0)) {
                break;
            }
            i++;
        }
        return httpProxy;
    }

    public static String LIZJ(Context context) {
        TelephonyManager telephonyManager;
        Object objH2 = C786410Ut5.H2(context, "phone");
        if (!(objH2 instanceof TelephonyManager) || (telephonyManager = (TelephonyManager) objH2) == null || telephonyManager.getSimState() != 5) {
            return null;
        }
        AtomicBoolean atomicBoolean = C794320VDy.LIZ;
        return C1300840jxK.LJIIJ(telephonyManager);
    }

    public static boolean LIZLLL(String str, String str2) {
        if (u.LJIJI(str2, str, true)) {
            return true;
        }
        if (!a0.LJJIIZI(str2, "*", false)) {
            return false;
        }
        if (u.LJJIIJZLJL(str2, "*.", false)) {
            String strSubstring = str2.substring(2);
            if (u.LJIJI(str, strSubstring, true)) {
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('.');
            sbLIZ.append(strSubstring);
            if (u.LJIIZILJ(str, C2188811AlT.LIZIZ(sbLIZ), true)) {
                return true;
            }
            return false;
        }
        return new Regex(u.LJJIFFI(u.LJJIFFI(str2, e3.d, "\\.", false), "*", ".*", false), EnumC688760Qzy.IGNORE_CASE).matches(str);
    }
}
