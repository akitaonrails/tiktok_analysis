package X;

import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267490j5X {
    public static boolean LIZJ;
    public InterfaceC1267460j5U LIZ;
    public final Set<String> LIZIZ = new HashSet();

    public static void LIZ(JSONObject jSONObject) {
        if (C1267480j5W.LIZ.LIZ != null) {
            AVLog.logApiCall("ttlh_adaptive", jSONObject);
        }
    }

    public static void LIZIZ(JSONObject jSONObject) {
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        InterfaceC1267460j5U interfaceC1267460j5U = C1267480j5W.LIZ.LIZ;
        if (interfaceC1267460j5U != null) {
            ((C1266460j3s) interfaceC1267460j5U).LIZ("ttlh_adaptive_framework_initialize", jSONObject);
        }
    }
}
