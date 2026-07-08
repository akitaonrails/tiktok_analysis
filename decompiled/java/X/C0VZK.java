package X;

import com.bytedance.pumbaa.hybrid.external.gateway.IHybridExternalGateway;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VZK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZK {
    public static C790430UzZ LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(251));

    public static IHybridExternalGateway LIZIZ() {
        return (IHybridExternalGateway) LIZIZ.getValue();
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        LIZIZ().monitorCommonLog(str, jSONObject);
    }

    public static void LIZ(Throwable th, String str, Map map) {
        LIZIZ().ensureNotReachHere(th, str, map);
    }
}
