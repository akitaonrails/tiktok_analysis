package X;

import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS176S1100000_27;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.015G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015G {
    public static final Map<String, Object> LIZ = C2097608Jq.LJIIJ(new Pair("livesdk_har_status", -1), new Pair("livesdk_ohr_status", 0));
    public static final C01GW LIZIZ = C292401Bi.LIZ(AnonymousClass0206.get$arr$(42));
    public static final C01GW LIZJ = C292401Bi.LIZ(AnonymousClass0206.get$arr$(43));

    @InterfaceC1294060jmO
    public static void LIZ(Object obj, String str, Map map) {
        Set<Map.Entry> setEntrySet;
        try {
            JSONObject jSONObject = new JSONObject(C19748512Ol.LIZIZ.LJIILL(obj));
            if (map != null && (setEntrySet = map.entrySet()) != null) {
                for (Map.Entry entry : setEntrySet) {
                    jSONObject.putOpt((String) entry.getKey(), entry.getValue());
                }
            }
            LivePitayaEnv.LJFF(new AwS176S1100000_27(str, jSONObject, 1), AnonymousClass0208.get$arr$(2), false, false);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(final Object obj, final String str, final Map map) {
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.00ky
            public final void LIZ() {
                Unit unit;
                Set<Map.Entry<String, Object>> setEntrySet;
                Object obj2 = obj;
                Map<String, Object> map2 = map;
                String str2 = str;
                try {
                    JSONObject jSONObject = new JSONObject(C19748512Ol.LIZIZ.LJIILL(obj2));
                    if (map2 != null && (setEntrySet = map2.entrySet()) != null) {
                        Iterator<T> it2 = setEntrySet.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            jSONObject.putOpt((String) entry.getKey(), entry.getValue());
                        }
                    }
                    Map<String, Object> map3 = C015G.LIZ;
                    C157V c157v = (C157V) C015G.LIZJ.getValue();
                    if (c157v != null) {
                        c157v.LJIJI(str2, jSONObject);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveFeatureCenter@5305.sendFeature2$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveFeatureCenter@5305.sendFeature2$2");
            }
        });
    }
}
