package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1238404sw {
    public static final /* synthetic */ int LIZIZ = 0;
    public final LinkedHashMap<String, JSONObject> LIZ = new LinkedHashMap<>();

    static {
        new Object() { // from class: X.04sx
        };
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(System.currentTimeMillis());
            this.LIZ.put(C2188811AlT.LIZIZ(sbLIZ), jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
