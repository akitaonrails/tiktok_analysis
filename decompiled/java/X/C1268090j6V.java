package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j6V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268090j6V {
    public InterfaceC1267450j5T LIZ;
    public final Map<String, AbstractC1268060j6S> LIZIZ = new HashMap();
    public final Map<String, AbstractC1268060j6S> LIZJ = new HashMap();

    public C1268090j6V() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api", "TTLHCommandCenterInit");
            C1267490j5X.LIZ(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(HashMap map) {
        InterfaceC1267460j5U interfaceC1267460j5U;
        try {
            JSONObject jSONObject = new JSONObject(map);
            if (jSONObject.optInt("execute", -1) >= 0 && (interfaceC1267460j5U = C1267480j5W.LIZ.LIZ) != null) {
                ((C1266460j3s) interfaceC1267460j5U).LIZ("ttlh_adaptive_rule_execute", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(HashMap map) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api", "ttlh_adaptive_command_success");
            jSONObject.put("method_name", "executeCommand");
            jSONObject.put("command", map);
            C1267490j5X.LIZ(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.EnumC1268100j6W r7, java.util.HashMap<java.lang.String, java.lang.Object> r8, java.util.HashMap<java.lang.String, java.lang.Object> r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268090j6V.LIZ(X.0j6W, java.util.HashMap, java.util.HashMap, java.lang.String):void");
    }
}
