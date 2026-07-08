package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05sG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1489005sG {
    public static final void LIZ(Aweme aweme, Object obj) {
        Map map;
        if (aweme != null) {
            try {
                C1367960lha.LIZ.getClass();
                Object obj2 = null;
                obj2 = null;
                Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(aweme, null);
                if (mapLJIILJJIL != null) {
                    if (obj instanceof C2344009Gk) {
                        C2344009Gk c2344009Gk = (C2344009Gk) obj;
                        c2344009Gk.LJII(mapLJIILJJIL);
                        obj2 = c2344009Gk;
                    } else if (C19719512Dh.LJII(obj)) {
                        if (C19719512Dh.LJII(obj) && (map = (Map) obj) != null) {
                            map.putAll(mapLJIILJJIL);
                            obj2 = Unit.LIZ;
                        }
                    } else if (obj instanceof JSONObject) {
                        try {
                            for (Map.Entry entry : mapLJIILJJIL.entrySet()) {
                                ((JSONObject) obj).put((String) entry.getKey(), entry.getValue());
                            }
                            obj2 = Unit.LIZ;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            obj2 = Unit.LIZ;
                        }
                    } else {
                        obj2 = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(obj2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
