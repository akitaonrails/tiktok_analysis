package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0r06, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571640r06 {
    public static void LIZ(C1571620r04 c1571620r04, String str) {
        String str2;
        String str3;
        C1571660r08 c1571660r08;
        int i;
        C1571670r09 c1571670r09 = C1571670r09.LIZ;
        C0CAK c0cak = null;
        if (c1571620r04 != null) {
            str2 = c1571620r04.LIZJ;
            str3 = c1571620r04.LIZIZ;
            c1571660r08 = c1571620r04.LJFF;
        } else {
            str2 = null;
            str3 = null;
            c1571660r08 = null;
        }
        c1571670r09.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("success", i);
            if (c1571660r08 != null) {
                c0cak = c1571660r08.LIZ;
            }
            jSONObject.put(Scene.SCENE_SERVICE, c0cak);
            jSONObject.put("from_bottom", str3);
            jSONObject.put("from_top", str2);
            jSONObject.put("error_reason", str);
            C20684815ws.LJIJ("tiktok_tab_recreate_restore_trigger", jSONObject);
            C1586120rNS c1586120rNS = C1586120rNS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tiktok_tab_recreate_restore_trigger: ");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
            c1586120rNS.getClass();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
