package X;

import android.net.Uri;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LruCache;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomCommonOptimizeConfigBean;
import com.ss.android.ugc.aweme.ecommerce.lynx.spark.EcLynxPerfTrackConfig;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pkb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523590pkb {
    public static final C1523590pkb LIZ = new C1523590pkb();
    public static final LruCache<String, C1523600pkc> LIZIZ = new LruCache<>(16);
    public static final boolean LIZJ;

    static {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        LIZJ = ((IApplicationDependencyService) iECommerceHostService).isLocalTest();
    }

    public static void LIZIZ(Uri uri) {
        Map mapLIZ = LIZ(true, uri);
        if (mapLIZ == null || !((ConcurrentHashMap) mapLIZ).containsKey("route_start")) {
            return;
        }
        C1769860w9o.LL.getClass();
        String strLIZ = C1769860w9o.LIZ(uri, false, false);
        if (strLIZ == null) {
            strLIZ = "";
        }
        LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start_");
        sbLIZ.append(strLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C08L6.LIZ.getClass();
        C08L6.LIZIZ(strLIZIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(mapLIZ);
        linkedHashMap.put("channel", strLIZ);
        if (LIZJ) {
            linkedHashMap.put("json", C1741890vQh.LJIIIIZZ(mapLIZ));
        }
        C1018703yb.LIZIZ("rd_tiktokec_lynx_perf", linkedHashMap);
    }

    public static boolean LIZJ(Uri uri) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcLynxPerfTrackConfig ecLynxPerfTrackConfig = C1523610pkd.LIZ;
        EcLynxPerfTrackConfig ecLynxPerfTrackConfig2 = (EcLynxPerfTrackConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_lynx_perf_track_settings", EcLynxPerfTrackConfig.class, ecLynxPerfTrackConfig);
        if (ecLynxPerfTrackConfig2 == null) {
            if (ecLynxPerfTrackConfig == null) {
                return false;
            }
        } else {
            ecLynxPerfTrackConfig = ecLynxPerfTrackConfig2;
        }
        EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean = ecLynxPerfTrackConfig.channels;
        if (ecomCommonOptimizeConfigBean != null) {
            C1769860w9o.LL.getClass();
            String strLIZ = C1769860w9o.LIZ(uri, true, true);
            if (strLIZ != null && ecomCommonOptimizeConfigBean.LIZ(strLIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Map LIZ(boolean z, Uri uri) {
        C1523600pkc c1523600pkcRemove;
        String strLIZIZ = C1942307jB.LIZIZ(uri, "ec_lynx_open_id");
        if (strLIZIZ != null && strLIZIZ.length() > 0) {
            if (z) {
                c1523600pkcRemove = LIZIZ.remove(strLIZIZ);
            } else {
                c1523600pkcRemove = LIZIZ.get(strLIZIZ);
            }
            if (c1523600pkcRemove != null) {
                return c1523600pkcRemove.LIZ;
            }
            return null;
        }
        return null;
    }

    public static void LJFF(String str, Map map) {
        if (str.length() > 0) {
            C1523600pkc c1523600pkc = LIZIZ.get(str);
            if (c1523600pkc == null) {
                c1523600pkc = new C1523600pkc();
            }
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    c1523600pkc.LIZ.put((String) key, value);
                }
            }
            LIZIZ.put(str, c1523600pkc);
        }
    }

    public static void LIZLLL(Uri uri, String str, String str2, boolean z, Object obj, boolean z2) {
        if (str.length() == 0) {
            return;
        }
        LruCache<String, C1523600pkc> lruCache = LIZIZ;
        C1523600pkc c1523600pkc = lruCache.get(str);
        if (c1523600pkc == null) {
            if (z2) {
                c1523600pkc = new C1523600pkc();
            } else {
                return;
            }
        }
        Trace.beginSection(str2);
        if (z) {
            try {
                if (c1523600pkc.LIZ.containsKey(str2)) {
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Trace.endSection();
                throw th;
            }
        }
        if (obj == null) {
            obj = Long.valueOf(System.currentTimeMillis());
        }
        c1523600pkc.LIZ.put(str2, obj);
        lruCache.put(str, c1523600pkc);
        C1769860w9o.LL.getClass();
        String strLIZ = C1769860w9o.LIZ(uri, false, false);
        if (strLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start_");
            sbLIZ.append(strLIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (Intrinsics.LJFF(str2, "start_time")) {
                C08L6.LIZ.getClass();
                C08L6.LJFF(strLIZIZ);
            } else {
                C08L6.LIZ.getClass();
                C08L6.LIZ(strLIZIZ, str2);
            }
        }
        Trace.endSection();
    }
}
