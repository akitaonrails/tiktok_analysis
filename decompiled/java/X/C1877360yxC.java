package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877360yxC {
    public static final C1877360yxC LIZ = new C1877360yxC();
    public static final Map<String, Class<? extends AbstractC1064500do8>> LIZIZ = C2097608Jq.LJIIJ(new Pair("x.getUserInfo", C1874650ysp.class), new Pair("x.getAppInfo", C2214151BlF.class), new Pair("x.getAPIParams", C1870620ymK.class), new Pair("x.getAPIParams", C1871240ynK.class), new Pair("x.getStorageItem", C1870790ymb.class), new Pair("x.setStorageItem", C1871880yoM.class), new Pair("x.getStorageInfo", C1870730ymV.class), new Pair("x.removeStorageItem", C1870840ymg.class), new Pair("x.reportAppLog", C1324250kZ5.class), new Pair("x.reportADLog", C1B1O.class), new Pair("x.reportMonitorLog", C1871780yoC.class), new Pair("x.updateGecko", C1889960zHW.class), new Pair("x.getGeckoInfo", C1890130zHn.class), new Pair("x.request", C1872050yod.class));
    public static final List<AbstractC1063600dmg> LIZJ = new ArrayList();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static void LIZ() {
        C1063590dmf c1063590dmfLJJL;
        if (LIZLLL.compareAndSet(false, true)) {
            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi != null) {
                iSparkHostApi.LJJJ();
            }
            for (Map.Entry entry : ((LinkedHashMap) LIZIZ).entrySet()) {
                if (iSparkHostApi != null && (c1063590dmfLJJL = iSparkHostApi.LJJL(null, (Class) entry.getValue())) != null) {
                    ((ArrayList) LIZJ).add(c1063590dmfLJJL);
                }
            }
            LIZ.getClass();
            ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi2 == null || !iSparkHostApi2.LJJJLZIJ()) {
                return;
            }
            if (!C1544000qHW.LIZJ) {
                Iterator it2 = ((LinkedHashMap) LIZIZ).entrySet().iterator();
                while (it2.hasNext()) {
                    C1062300dka.LIZLLL((Class) ((Map.Entry) it2.next()).getValue(), null, null, 6);
                }
            } else {
                for (Map.Entry entry2 : ((LinkedHashMap) LIZIZ).entrySet()) {
                    C1062300dka.LJ((String) entry2.getKey(), (Class) entry2.getValue());
                }
            }
        }
    }
}
