package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomEventMonitorSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.058s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13048058s {
    public static final C13048058s LIZ = new C13048058s();
    public static final C01GW LIZIZ;
    public static List<String> LIZJ;
    public static final C13047058r LIZLLL;
    public static final ArrayList<C052K> LJ;
    public static final C13046058q LJFF;
    public static volatile boolean LJI;
    public static final LinkedList<C13050058u> LJII;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.058q] */
    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C13051058v());
        LIZIZ = c01gwLIZIZ;
        LIZJ = a0.LJJLIIIJILLIZJL(((Keva) c01gwLIZIZ.getValue()).getString("slark_events_monitor_list", ""), new String[]{","}, 0, 6);
        LIZLLL = C13047058r.LIZ;
        LJ = new ArrayList<>();
        LJFF = new InterfaceC2190351Anx() { // from class: X.058q
            @Override // X.InterfaceC2190351Anx
            public void onEvent(String str) {
                if (str != null) {
                    C13048058s.LIZ.getClass();
                    C13048058s.LIZ(null, str);
                }
            }

            @Override // X.InterfaceC2190351Anx
            public final void LIZ(String str, Map<String, String> map) {
                if (str != null) {
                    C13048058s.LIZ.getClass();
                    C13048058s.LIZ(map, str);
                }
            }

            @Override // X.InterfaceC2190351Anx
            public final void onEvent(String str, JSONObject jSONObject) {
                if (str != null) {
                    C13048058s.LIZ.getClass();
                    C13048058s.LIZ(jSONObject, str);
                }
            }
        };
        LJII = new LinkedList<>();
    }

    public static void LIZ(Object obj, String str) {
        if (Intrinsics.LJFF(str, "tiktokec_product_click")) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcomEventMonitorSettings.EcomEventMonitorConfig ecomEventMonitorConfig = EcomEventMonitorSettings.LIZ;
            EcomEventMonitorSettings.EcomEventMonitorConfig ecomEventMonitorConfig2 = (EcomEventMonitorSettings.EcomEventMonitorConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_event_monitor_config", EcomEventMonitorSettings.EcomEventMonitorConfig.class, ecomEventMonitorConfig);
            if (ecomEventMonitorConfig2 != null) {
                ecomEventMonitorConfig = ecomEventMonitorConfig2;
            }
            long j = ecomEventMonitorConfig.eventPairDetectThreshold;
            C13050058u c13050058u = new C13050058u(str, SystemClock.elapsedRealtime());
            c13050058u.LIZJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C13049058t(j, str, obj, c13050058u, null), 2);
            LinkedList<C13050058u> linkedList = LJII;
            synchronized (linkedList) {
                try {
                    linkedList.addLast(c13050058u);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (Intrinsics.LJFF(str, "tiktokec_enter_product_detail")) {
            LinkedList<C13050058u> linkedList2 = LJII;
            synchronized (linkedList2) {
                try {
                    C13050058u c13050058u2 = (C13050058u) C19719612Di.LJJIIZI(linkedList2);
                    if (c13050058u2 == null) {
                        if (obj != null) {
                            LIZ.getClass();
                            LIZIZ(obj, "EC_ENTER_MISS_CLICK");
                        }
                    } else {
                        C09AE c09ae = c13050058u2.LIZJ;
                        if (c09ae != null) {
                            c09ae.LIZIZ(null);
                        }
                        c13050058u2.LIZJ = null;
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public static void LIZIZ(Object obj, String str) {
        JSONObject jSONObject;
        if ((obj instanceof HashMap) && obj != null) {
            C1AF0.LIZLLL(str, (Map) obj);
            return;
        }
        if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null) {
            return;
        }
        LIZ.getClass();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
        }
        C1AF0.LIZLLL(str, map);
    }
}
