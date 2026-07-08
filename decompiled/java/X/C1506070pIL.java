package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506070pIL {
    public final InterfaceC1506090pIN LIZ;

    public C1506070pIL(InterfaceC1506090pIN interfaceC1506090pIN) {
        this.LIZ = interfaceC1506090pIN;
    }

    public final void LIZ(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("step", str);
            if (str2 != null) {
                jSONObject.put("type", str2);
            }
            for (Map.Entry<String, Object> entry : this.LIZ.LIZIZ().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("tiktokec_rd_live_shop_bag_list_native_preload_step", jSONObject);
    }
}
