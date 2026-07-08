package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1018503yZ {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZ(Map map) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null || a0.LJJJIL(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object objWrap = JSONObject.wrap(entry.getValue());
                    if (objWrap == null) {
                        objWrap = "";
                    }
                    jSONObject.put(str, objWrap);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObject;
        }
    }

    public static void LIZIZ(String str, Map map, boolean z) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1018403yY(str, map, null, z), 2);
    }
}
