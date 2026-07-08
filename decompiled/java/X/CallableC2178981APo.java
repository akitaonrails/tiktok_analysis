package X;

import X.C830490Whz;
import com.ss.optimizer.live.sdk.dns.DnsOptimizer;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1APo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class CallableC2178981APo implements Callable<C2179051APv> {
    @Override // java.util.concurrent.Callable
    public final C2179051APv call() {
        String string;
        C1C7U.LIZ("HttpPostLocalDnsTask@2fa5.call");
        C830490Whz c830490Whz = DnsOptimizer.LJIILL;
        if (c830490Whz == null) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder("{ \"IpMap\":{");
            Iterator it2 = ((C830490Whz.e) c830490Whz.values()).iterator();
            int i = 0;
            while (true) {
                AbstractC1322040kVW abstractC1322040kVW = (AbstractC1322040kVW) it2;
                if (!abstractC1322040kVW.hasNext()) {
                    break;
                }
                C1968707nR c1968707nR = ((C2179031APt) abstractC1322040kVW.next()).LIZLLL;
                if (c1968707nR != null) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    sb.append(c1968707nR.toString());
                    i++;
                }
            }
            sb.append("}}");
            string = sb.toString();
        }
        C2178971APn c2178971APn = C2178951APl.LIZIZ().LIZIZ;
        c2178971APn.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c2178971APn.LIZ);
        sbLIZ.append("/video/live/qos/v2/ipSettings");
        String strLIZ = C2178971APn.LIZ(C2188811AlT.LIZIZ(sbLIZ), c2178971APn.LIZJ);
        string.toString();
        C2179051APv c2179051APv = new C2179051APv(new JSONObject(c2178971APn.LIZIZ.LIZ(strLIZ, string.getBytes("UTF-8"))));
        C1C7U.LIZIZ("HttpPostLocalDnsTask@2fa5.call");
        return c2179051APv;
    }
}
