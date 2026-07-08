package X;

import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.09GC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GC {
    public static String LIZ() {
        String strLIZ = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        strLIZ = C746250TPb.LIZ((Inet4Address) inetAddressNextElement, CertProviderManagerKt.findCert("bpea-BNPL_IP_address", 1476427778));
                        return strLIZ;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLIZ;
        }
    }

    public static String LIZIZ() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(Collections.list(((NetworkInterface) it2.next()).getInetAddresses()), arrayList);
            }
            return (String) C09RB.LJIIL(new C08LY(C09RB.LJIIIZ(new C08LY(C09RB.LJIIIZ(new C1939607ik(arrayList), AFwS231S0000000_3.get$arr$(258)), AFwS231S0000000_3.get$arr$(259)), new C020N(12)), new C020N(13)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }
}
