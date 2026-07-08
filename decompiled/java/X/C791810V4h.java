package X;

import android.content.Context;
import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791810V4h {
    public InterfaceC791790V4f LIZ;
    public final HashSet<String> LIZIZ = new HashSet<>();

    public final void LIZ(Throwable th) {
        JSONObject jSONObject;
        IEnsure iEnsure;
        try {
            if (this.LIZ != null && (iEnsure = C1AF0.LIZ) != null) {
                iEnsure.reportLogException(5, th, "apm_error");
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (!C792400V6o.LJIIIIZZ() && ((jSONObject = C792400V6o.LJFF) == null || jSONObject.optString("channel") == null || !C792400V6o.LJFF.optString("channel").contains("local"))) {
        } else {
            throw new RuntimeException(th);
        }
    }

    public final void LIZIZ(Throwable th, String str) {
        if (this.LIZ != null && !this.LIZIZ.contains(str)) {
            this.LIZIZ.add(str);
            InterfaceC791790V4f interfaceC791790V4f = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("apm_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            interfaceC791790V4f.getClass();
            C1AF0.LJFF(th, strLIZIZ);
        }
        Context context = C792400V6o.LIZ;
    }
}
