package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspPollOrderCacheSettings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.03PN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03PN {
    public static final boolean LIZ;
    public static final Object LIZIZ;
    public static final Map<String, C837903Pd> LIZJ;
    public static final int LIZLLL;

    static {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECOspPollOrderCacheSettings.OSPPollOrderCacheConfig oSPPollOrderCacheConfig = ECOspPollOrderCacheSettings.LIZ;
        ECOspPollOrderCacheSettings.OSPPollOrderCacheConfig oSPPollOrderCacheConfig2 = (ECOspPollOrderCacheSettings.OSPPollOrderCacheConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_fix_order_poll_missing_combo_id", ECOspPollOrderCacheSettings.OSPPollOrderCacheConfig.class, oSPPollOrderCacheConfig);
        if (oSPPollOrderCacheConfig2 == null) {
            oSPPollOrderCacheConfig2 = oSPPollOrderCacheConfig;
        }
        LIZ = oSPPollOrderCacheConfig2.enable;
        LIZIZ = new Object();
        LIZJ = new LinkedHashMap();
        ECOspPollOrderCacheSettings.OSPPollOrderCacheConfig oSPPollOrderCacheConfig3 = (ECOspPollOrderCacheSettings.OSPPollOrderCacheConfig) SettingsManager.LIZLLL().LJIIIIZZ("ec_fix_order_poll_missing_combo_id", ECOspPollOrderCacheSettings.OSPPollOrderCacheConfig.class, oSPPollOrderCacheConfig);
        if (oSPPollOrderCacheConfig3 != null) {
            oSPPollOrderCacheConfig = oSPPollOrderCacheConfig3;
        }
        Integer num = oSPPollOrderCacheConfig.cacheValidTime;
        LIZLLL = num != null ? num.intValue() : C538540LAe.LLJJJIL;
    }

    public static void LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) LIZJ).entrySet()) {
            C837903Pd c837903Pd = (C837903Pd) entry.getValue();
            c837903Pd.getClass();
            if (SystemClock.elapsedRealtime() - c837903Pd.LIZLLL <= LIZLLL) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map<String, C837903Pd> map = LIZJ;
        ((LinkedHashMap) map).clear();
        map.putAll(linkedHashMap);
    }

    public static void LIZIZ(String str, String str2, String str3, List list) {
        if (LIZ && str != null && str.length() != 0) {
            synchronized (LIZIZ) {
                try {
                    LIZ();
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    C837903Pd c837903Pd = new C837903Pd(str2, arrayList, str3);
                    Map<String, C837903Pd> map = LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("order_poll_");
                    sbLIZ.append(str);
                    map.put(C2188811AlT.LIZIZ(sbLIZ), c837903Pd);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
