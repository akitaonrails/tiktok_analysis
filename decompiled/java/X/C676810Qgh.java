package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.MallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qgh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676810Qgh {
    public static long LIZIZ;
    public static C676820Qgi LIZJ;
    public static final C676810Qgh LIZ = new C676810Qgh();
    public static final ConcurrentHashMap<Integer, C676820Qgi> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, C676820Qgi> LJ = new ConcurrentHashMap<>();

    public static C676820Qgi LIZJ(int i) {
        C676820Qgi c676820Qgi = LIZLLL.get(Integer.valueOf(i));
        if (c676820Qgi == null) {
            C676820Qgi c676820Qgi2 = LJ.get(Integer.valueOf(i));
            if (c676820Qgi2 == null) {
                c676820Qgi2 = LIZJ;
            }
            if (c676820Qgi2 == null) {
                return LIZJ;
            }
            return c676820Qgi2;
        }
        return c676820Qgi;
    }

    public static C676820Qgi LIZLLL(int i) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixPerfMonitor start key=");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        LIZIZ = System.currentTimeMillis();
        C676820Qgi c676820Qgi = new C676820Qgi();
        LIZJ = c676820Qgi;
        c676820Qgi.LIZLLL = LIZIZ;
        LIZLLL.put(Integer.valueOf(i), c676820Qgi);
        return LIZJ;
    }

    public static void LIZIZ(long j, String str) {
        AnonymousClass0317 anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin = MallLandingPerfTrackerDependencyService.createIMallLandingPerfTrackerDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IMallLandingPerfTrackerDependencyService.class.getName();
            if (anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IMallLandingPerfTrackerDependencyService.class);
        }
        ((IMallLandingPerfTrackerDependencyService) anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin).onSearchMixLandingFinished(str, j, "shop_search_result");
    }

    public static void LIZ(Integer num, String str, HashMap map) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixPerfMonitor end key=");
        sbLIZ.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (num != null) {
            num.intValue();
            C676820Qgi c676820QgiRemove = LIZLLL.remove(num);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MixPerfMonitor end event=");
            sbLIZ2.append(c676820QgiRemove);
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (c676820QgiRemove != null) {
                C2341109Fh.LIZ("MixPerfMonitor end report");
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                if (str == null) {
                    str = "";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, c676820QgiRemove.LIZ);
                jSONObject.put("page_name", c676820QgiRemove.LIZJ);
                for (Map.Entry<String, Integer> entry : c676820QgiRemove.LJ.entrySet()) {
                    String key = entry.getKey();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append("_index");
                    if (!Intrinsics.LJFF(key, C2188811AlT.LIZIZ(sbLIZ3))) {
                        jSONObject.put(entry.getKey(), entry.getValue().intValue());
                    }
                }
                jSONObject.put("chunk_count", c676820QgiRemove.LJFF);
                for (Map.Entry<String, Long> entry2 : c676820QgiRemove.LJI.entrySet()) {
                    String key2 = entry2.getKey();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str);
                    sbLIZ4.append("_cost");
                    if (!Intrinsics.LJFF(key2, C2188811AlT.LIZIZ(sbLIZ4))) {
                        jSONObject.put(entry2.getKey(), entry2.getValue().longValue());
                    }
                }
                for (Map.Entry<String, Long> entry3 : c676820QgiRemove.LJII.entrySet()) {
                    String key3 = entry3.getKey();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(str);
                    sbLIZ5.append("_lynx_render");
                    if (!Intrinsics.LJFF(key3, C2188811AlT.LIZIZ(sbLIZ5))) {
                        jSONObject.put(entry3.getKey(), entry3.getValue().longValue());
                    }
                }
                for (Map.Entry<String, Long> entry4 : c676820QgiRemove.LJIIIIZZ.entrySet()) {
                    String key4 = entry4.getKey();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(str);
                    sbLIZ6.append("_render");
                    if (!Intrinsics.LJFF(key4, C2188811AlT.LIZIZ(sbLIZ6))) {
                        jSONObject.put(entry4.getKey(), entry4.getValue().longValue());
                    }
                }
                jSONObject.put("first_chunk_total_cost", c676820QgiRemove.LJIIIZ);
                if (c676820QgiRemove.LJIIJ <= 0) {
                    c676820QgiRemove.LJIIJ = c676820QgiRemove.LJIIJJI;
                }
                jSONObject.put("meaningful_chunk_total_cost", c676820QgiRemove.LJIIJ);
                jSONObject.put("root_enter_from_type", c676820QgiRemove.LJIIL);
                jSONObject.put("enter_method", c676820QgiRemove.LJIILIIL);
                jSONObject.put("client_request_id", c676820QgiRemove.LJIILJJIL);
                jSONObject.put("search_id", c676820QgiRemove.LJIILL);
                jSONObject.put("rd_mixed_page", c676820QgiRemove.LJIILLIIL);
                jSONObject.put("is_re_search", c676820QgiRemove.LJIIZILJ);
                Map<String, Long> map2 = c676820QgiRemove.LJIJ;
                if (map2 != null) {
                    for (Map.Entry<String, Long> entry5 : map2.entrySet()) {
                        jSONObject.put(entry5.getKey(), entry5.getValue().longValue());
                    }
                }
                jSONObject.put("performance_info", c676820QgiRemove.LJIJI);
                c676820QgiRemove.LJIJI = "";
                jSONObject.put("performance_info_server", c676820QgiRemove.LJIJJ);
                c676820QgiRemove.LJIJJ = "";
                Map<String, Long> map3 = c676820QgiRemove.LJIJJLI;
                if (map3 != null) {
                    for (Map.Entry<String, Long> entry6 : map3.entrySet()) {
                        jSONObject.put(entry6.getKey(), entry6.getValue().longValue());
                    }
                }
                Map<String, Long> map4 = c676820QgiRemove.LJIL;
                if (map4 != null) {
                    for (Map.Entry<String, Long> entry7 : map4.entrySet()) {
                        jSONObject.put(entry7.getKey(), entry7.getValue().longValue());
                    }
                }
                for (Map.Entry entry8 : map.entrySet()) {
                    jSONObject.put((String) entry8.getKey(), ((Number) entry8.getValue()).intValue());
                }
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("rd_tiktokec_search_trace", jSONObject);
                ConcurrentHashMap<Integer, C676820Qgi> concurrentHashMap = LJ;
                if (concurrentHashMap.containsKey(num)) {
                    concurrentHashMap.remove(num);
                }
                concurrentHashMap.put(num, c676820QgiRemove);
            }
        }
        LIZJ = null;
    }
}
