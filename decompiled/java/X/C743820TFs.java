package X;

import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: renamed from: X.0TFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743820TFs {
    public static final String[] LIZ = {"wlan0", "wlan1", "wlan2"};

    public static List LIZ() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (C13LQ.LJJIJIIJI(networkInterfaceNextElement.getName(), LIZ) >= 0) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            arrayList.add(C746250TPb.LIZ((Inet4Address) inetAddressNextElement, CertProviderManagerKt.findCert("bpea-minis_game_native_debug_wifi_ip", 1476427780)));
                        }
                    }
                }
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZJ("minis-WifiUtils", e);
            return arrayList;
        } catch (SocketException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return arrayList;
    }
}
